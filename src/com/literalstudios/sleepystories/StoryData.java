package com.literalstudios.sleepystories;

import java.util.ArrayList;
import java.util.List;

public class StoryData {
	
	//array list to store the stories (dynamic)
	private List<Story> storiesList = new ArrayList<Story>();
	public List<Story> getStories(){return storiesList;}
	
	//populates the arraylist with the stories from the database
	public StoryData(){
		
	}
	
}
