package com.brushfiredigitalservices.patternmaker;

import java.awt.Color;
import java.util.List;

import javax.swing.JFrame;

public class PatternMaker extends JFrame {

	MosaicPanel mosaic;
	
	 /**
	  * main routine creates a frame of type PatternMaker
	  * with a new MosaicPanel as its content pane
	  * and makes it visible on the screen.
	  */
	 public static void main(String[] args) {
	  PatternMaker window = new PatternMaker();
	  window.setContentPane(window.getMosaic());
	  window.setMenuBar(window.makeMenuBar());
	  window.setVisible(true);
	 }
	 
	 public MosaicPanel getMosaic() {
		// TODO Auto-generated method stub
		return mosaic;
	}

	public PatternMaker() {
		 this(new MosaicPanel());
	 }

	 public PatternMaker(MosaicPanel m) {
		 super("Pattern Maker");
		 if (m == null) {
			 mosaic = new MosaicPanel();
		 }
		 mosaic = m;
	 }
	 
	/**
	 * Default serial version ID
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	* Utility method to construct and return menu bar 
	* for this PatternMaker instance.
	* @returns JMenuBar with options and settings reflecting
	* the current settings of this PatternMaker.
	*/
	public JMenuBar makeMenuBar() {
		// TODO method stub
		return null;
	}

	/**
	* Utility method to attempt to access Color at given index,
	*@throws ColorIndexConversionException with useful, specific error messages
	if index too high or low, or passed a null List reference
	*@returns Color reference at given index i in List availColors.
	 return value may be null.
	*@param i the desired index to retreive
	*@param availColors any List<Color>, may contain null values.
	*/
	public static Color colorIndexToColor(List<Color> availColors, int i) throws ColorIndexConversionException {
		if (availColors == null)
			throw new ColorIndexConversionException(ColorIndexConversionException.makeMessage(ColorIndexConversionException.IS_NULL));
		else
		if (i < 0)
			throw new ColorIndexConversionException(ColorIndexConversionException.makeMessage(ColorIndexConversionException.TOO_LOW));
		else
		if (i >= availColors.size())
			throw new ColorIndexConversionException(ColorIndexConversionException.makeMessage(ColorIndexConversionException.TOO_HIGH));
		return availColors.get(i);
	}
	
	/**
	 * Save current project and its settings as XML
	 */
	public void doSave() {
		// TODO method stub
	}
	
	/**
	* Open given XML project
	* @param
	* @throws IOException occured opening file
	*/
	public void doOpen(File f) throws IOException, ProjectLoadException {
		// TODO method stub
	}
}
