package com.brushfiredigitalservices.patternmaker;

/*
 * ColorIndexConversionException indicates something has
 * gone wrong accessing the color map of this pattern.
 * For example, it is thrown by 
 * colorIndexToColor(ArrayList<Color>,int)
 * when passed an invalid int index, or when passed
 * a null ArrayList<Color>. Contains static constants
 * with an error message for each state, which will 
 * automatically fill the message field.
 */
public class ColorIndexConversionException extends
		Exception {
	/**
	 * Default Serial Version UID
	 */
	private static final long serialVersionUID = 1L;
	
	public static enum ErrCode { TOO_LOW, TOO_HIGH, IS_NULL; 
		@override
		public String toString() {
			
		}
	}
	
	private ErrCode err;
	
	public ColorIndexConversionException(ErrCode problem) {
		super(problem);
		
	}
	
	private static String makeMessage(ErrCode problem) {
		String message;
		switch(problem) {
			case TOO_LOW: 
				message = "There cannot be a negative index in the color map.";
				break;
			case TOO_HIGH:
				message = "The index is larger than the color map.";
				break;
			case IS_NULL:
				message = "The color index collection points to null!";
				break;
			default:
				message = "Unrecognized problem code \""+problem+"\". Use 'TOO_lOW', 'TOO_HIGH', 'IS_NULL'.";
				break;
		}
		return message;
	}
}
