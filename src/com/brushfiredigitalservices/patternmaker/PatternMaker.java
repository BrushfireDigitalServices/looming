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
	 * 
	 */

}
