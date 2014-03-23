package com.tvtracker.model;

import java.util.ArrayList;

public class MediaList {
	private ArrayList<Media> list;

	public MediaList() {
		this.list = new ArrayList<Media>();
	}

	public void addMedia(Media media) {
		this.list.add(media);
	}
	
	public MediaList getMediaList() {
		return this;
	}
	
}
