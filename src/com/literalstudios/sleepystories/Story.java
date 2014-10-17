package com.literalstudios.sleepystories;

import android.os.Bundle;

public class Story {

	//story class to contain data for each story entry taken from sqlite db
	
	//constants for field references
	public static final String TITLE = "title";
	public static final String AUTHOR = "author";
	public static final String GENRE = "genre";
	public static final String TEXT_FILE = "textFile";

	//private field
	private String title;
	private String author;
	private String genre;
	private String textFile;
	
	// getters and setters
	public String getTitle() { return title; }
	public void setTitle(String title) { this.title = title; }
	
	public String getAuthor() { return author; }
	public void setAuthor(String author) { this.author = author; }
	
	public String getTextFile() { return textFile; }
	public void setTextFile(String textFile) { this.textFile = textFile; }
	
	public String getGenre() { return genre; }
	public void setGenre(String genre) { this.genre = genre; }
	
	//used to create story object
	public Story(String title, String author, String textFile, String genre){
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.textFile = textFile;
	}
	
	
	//used to create story from bundle
	public Story(Bundle b){
		if(b != null){
			this.title = b.getString(TITLE);
            this.author = b.getString(AUTHOR);
            this.genre = b.getString(GENRE);
            this.textFile = b.getString(TEXT_FILE);
		}
	}
	
	//package data for transfer between activities
	public Bundle toBundle(){
		Bundle b = new Bundle();
		b.putString(TITLE, this.title);
		b.putString(AUTHOR, this.author);
		b.putString(GENRE, this.genre);
		b.putString(TEXT_FILE, this.textFile);
		
		return b;
	}
	
	//toString method, returns story name
	public String toString(){
		return this.title;
	}
	
	
	
}
