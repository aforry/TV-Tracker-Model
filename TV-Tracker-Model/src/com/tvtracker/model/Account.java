package com.tvtracker.model;

public class Account {
	private String name;
	private MediaListProgress progress;
	private String pwdHash;

	public MediaListProgress getMediaListProgress() {
		return this.progress;
	}

	public void setMediaListProgress(MediaListProgress newProgress) {
		this.progress = newProgress;
	}
}
