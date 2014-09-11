package com.brushfiredigitalservices.patternmaker;

import java.awt.Color;
import java.util.ArrayList;

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

	public static class ColorIndexOutOfBoundsException extends
			IndexOutOfBoundsException {
		/**
		 * Default Serial Version UID
		 */
		private static final long serialVersionUID = 1L;

		public ColorIndexOutOfBoundsException(String message) {
			super(message);
		}
	}

	public static Color colorIndexToColor(ArrayList<Color> availColors, int i) {
		if (i < 0)
			throw new ColorIndexOutOfBoundsException("There cannot be a negative index in the color map.");
		if (i >= availColors.size())
			throw new ColorIndexOutOfBoundsException("The index is larger than the color map.");
		return availColors.get(i);
	}
	
	/**
	 * 
	 */

}
