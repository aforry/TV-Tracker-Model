package com.tvtracker.model;

public class Account {
	private String name;
	private MediaListProgress progress;
	private String pwdHash;

	public MediaListProgress getMediaListProgress() {
		return this.progress;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setMediaListProgress(MediaListProgress newProgress) {
		this.progress = newProgress;
	}
}
