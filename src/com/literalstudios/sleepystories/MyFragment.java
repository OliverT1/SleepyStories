package com.literalstudios.sleepystories;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MyFragment extends Fragment{
	
	public MyFragment(){}
	public void onCreate(Bundle savedInstanceState) {super.onCreate(savedInstanceState);}
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		
		View rootView = inflater.inflate(R.layout.my_fragment, container, false);
		return rootView;
	}
	
}
