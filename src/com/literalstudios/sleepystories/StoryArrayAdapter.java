package com.literalstudios.sleepystories;

import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class StoryArrayAdapter extends ArrayAdapter<Story>{
	
	private Context context;
	private List<Story> objects;
	
	public StoryArrayAdapter(Context context, int resource, List<Story> objects) {
		super(context, resource, objects);
		this.context = context;
		this.objects = objects;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		Story story = objects.get(position);
		
		LayoutInflater inflater = 
				(LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
		//TODO change to story list item View view = inflater.inflate(R.layout.flower_listitem, null);
		
		//TODO change ImageView image = (ImageView) view.findViewById(R.id.ivFlowerImage);
		image.setImageResource(story.getTextFile());
		
		TextView tv = (TextView) view.findViewById(R.id.tvFlowerName);
		tv.setText(story.getTitle());
		
		return view;
	}
}
