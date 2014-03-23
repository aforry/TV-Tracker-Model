package com.tvtracker.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author Austin Forry
 *
 */

public class MediaListTest {
	private Media testMedia;
	private MediaList testMediaList;
	
	@Before
	public void setup() {
		testMedia = new Media("Forry");
		testMediaList = new MediaList();
		testMediaList.addMedia(testMedia);
	}
	
	@Test
	public void testGetMediaList() {
		fail("implement this");
	}
}
