package com.literalstudios.sleepystories;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MyFragment extends ListFragment{
	
	//empty constructor must be created for all fragments
	public MyFragment(){}
	public void onCreate(Bundle savedInstanceState) {super.onCreate(savedInstanceState);}
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		
		// inflates the view of the fragment
		View rootView = inflater.inflate(R.layout.my_fragment, container, false);
		return rootView;
	}
	
}
