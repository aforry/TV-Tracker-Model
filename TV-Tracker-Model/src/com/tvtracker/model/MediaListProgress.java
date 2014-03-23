package com.tvtracker.model;

public class MediaListProgress {
	private MediaProgress mediaProgress;
	private MediaList mediaList;

	public MediaListProgress(MediaList mediaList, MediaProgress mediaProgress) {
		this.mediaList = mediaList;
		this.mediaProgress = mediaProgress;
	}

	public void addMedia(Media media) {
		mediaList.addMedia(media);
		mediaProgress.addMedia(media, false);
	}

	public Boolean isCompleted(Media media) {
		return mediaProgress.getProgress(media);
	}
}
