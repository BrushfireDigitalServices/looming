package com.brushfiredigitalservices.patternmaker;

import static org.junit.Assert.*;

import java.awt.Color;
import java.util.ArrayList;

import org.junit.Test;

public class PatternMakerTest {

	@Test
	public void testForSelectCorrectColorFromColorIndex() {
		ArrayList<Color> availColors = new ArrayList<Color>();
		availColors.add(Color.WHITE);
		availColors.add(Color.BLUE);
		availColors.add(Color.BLACK);
		assertEquals(availColors.get(1), PatternMaker.colorIndexToColor(availColors, 1));
	}
	
	@Test
	public void testForErrorWhenAttemptingToGetColorFromNegativeColorIndex() {
		ArrayList<Color> availColors = new ArrayList<Color>();
		availColors.add(Color.WHITE);
		availColors.add(Color.BLUE);
		availColors.add(Color.BLACK);
		PatternMaker.ColorIndexOutOfBoundsException ex = null;
		try {
			PatternMaker.colorIndexToColor(availColors, -1);
		} catch (PatternMaker.ColorIndexOutOfBoundsException e) {
			ex = e;
		}
		assertNotNull("Exception was not thrown", ex);
		assertEquals("There cannot be a negative index in the color map.", ex.getMessage());
	}
	
	@Test
	public void testForErrorWhenAttemptingToGetColorFromTooHighColorIndex() {
		ArrayList<Color> availColors = new ArrayList<Color>();
		availColors.add(Color.WHITE);
		availColors.add(Color.BLUE);
		availColors.add(Color.BLACK);
		PatternMaker.ColorIndexOutOfBoundsException ex = null;
		try {
			PatternMaker.colorIndexToColor(availColors, 3);
		} catch (PatternMaker.ColorIndexOutOfBoundsException e) {
			ex = e;
		}
		assertNotNull("Exception was not thrown", ex);
		assertEquals("The index is larger than the color map.", ex.getMessage());
	}
	
	

}
