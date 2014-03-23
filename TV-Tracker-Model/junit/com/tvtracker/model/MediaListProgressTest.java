package com.tvtracker.model;

import static org.junit.Assert.*;

import java.util.Map;
import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author Austin Forry
 *
 */

public class MediaListProgressTest {
	
	private Media testMedia, testMedia2;
	private MediaListProgress testMediaListProgress;
	private MediaList testMediaList;
	private MediaProgress testMediaProgress;
	private Map<Media, Boolean> testMap;
	
	@Before
	public void setup() {
		testMedia = new Media("Forry");
		testMedia2 = new Media("Austin");
		testMap = new HashMap<Media, Boolean>();
		testMap.put(testMedia, true);
		testMediaList = new MediaList();
		testMediaProgress = new MediaProgress(testMap);
		testMediaListProgress = new MediaListProgress(testMediaList, testMediaProgress);
		
	}
	
	@Test
	public void testIsCompleted() {
		assertEquals(true, testMediaListProgress.isCompleted(testMedia));
	}
	
	@Test
	public void testAddMedia() {
		testMediaListProgress.addMedia(testMedia2);
		assertEquals(false, testMediaListProgress.isCompleted(testMedia2));
		assertEquals(true, testMediaListProgress.isCompleted(testMedia));
	}
}
