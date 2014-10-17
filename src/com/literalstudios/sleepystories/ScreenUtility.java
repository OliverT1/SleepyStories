package com.literalstudios.sleepystories;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.view.Display;

public class ScreenUtility {

	private Activity activity;
	private float dpWidth;
	private float dpHeight;
	
	public ScreenUtility(Activity activity){
		this.activity = activity;
		
		//finds pixels of current device
		Display display = activity.getWindowManager().getDefaultDisplay();
		DisplayMetrics outMetrics = new DisplayMetrics();
		display.getMetrics(outMetrics);
		
		//finds the device independent pixels
		float density = activity.getResources().getDisplayMetrics().density;
		dpHeight = outMetrics.heightPixels / density;
		dpWidth = outMetrics.widthPixels / density;
		
	}
	
	//getters for device independent pixels
	public float getWidth() {return dpWidth; }
	
	public float getHeight() {return dpHeight; }
	
}
