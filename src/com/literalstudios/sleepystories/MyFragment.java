package com.literalstudios.sleepystories;

import java.util.List;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MyFragment extends ListFragment{
	
	//gets story list
	List<Story> stories = new StoryData().getStories();
	
	//empty constructor must be created for all fragments
	public MyFragment(){}
	public void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		
		StoryArrayAdapter adapter = new StoryArrayAdapter(getActivity(), R.layout.story_list_item, stories);
		
		setListAdapter(adapter);
	}
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		
		// inflates the view of the fragment
		View rootView = inflater.inflate(R.layout.my_fragment, container, false);
		return rootView;
	}
	
}
