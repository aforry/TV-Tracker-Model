package com.tvtracker.model;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author Austin Forry
 *
 */

public class MediaProgressTest {

	private Media testMedia, testMedia2;
	private MediaProgress testMediaProgress;
	private Map<Media, Boolean> testMap;
	
	@Before
	public void setup() {
		testMedia = new Media("Forry");
		testMedia2 = new Media("Austin");
		testMap = new HashMap<Media, Boolean>();
		testMap.put(testMedia, true);
		testMediaProgress = new MediaProgress(testMap);
	}
	
	@Test
	public void testGetProgress() {
		assertEquals(true, testMediaProgress.getProgress(testMedia));
	}
	
	@Test
	public void testAddMedia() {
		testMediaProgress.addMedia(testMedia2, false);
		assertEquals(false, testMediaProgress.getProgress(testMedia2));
	}
	
}
