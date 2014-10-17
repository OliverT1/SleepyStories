package com.literalstudios.sleepystories;

import java.util.ArrayList;
import java.util.List;

public class StoryData {
	
	//array list to store the stories (dynamic)
	private List<Story> storiesList = new ArrayList<Story>();
	public List<Story> getStories(){return storiesList;}
	
	//populates the arraylist with the stories from the database
	public StoryData(){
		storiesList.add(new Story("The little Mermaid", "Hans Christian Andersen", "little_mermaid.txt", "Fairy Tale"));
		storiesList.add(new Story("Random Book", "Some guy", "little_mermaid.txt", "Fairy Tale"));
		storiesList.add(new Story("The thousand summers of Jacob de Zoet", "David Mitchell", "little_mermaid.txt", "Fairy Tale"));
		storiesList.add(new Story("The little Mermaid", "Hans Christian Andersen", "little_mermaid.txt", "Fairy Tale"));
	}
	
}
