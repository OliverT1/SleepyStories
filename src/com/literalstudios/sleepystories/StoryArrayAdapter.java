package com.literalstudios.sleepystories;

import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
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
		
		LayoutInflater inflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
		//inflate the list activity
		View view = inflater.inflate(R.layout.story_list_item, null);
		
		//instantiate the text views
		TextView authorTV = (TextView) view.findViewById(R.id.authorTextView);
		TextView titleTV = (TextView) view.findViewById(R.id.titleTextView);
		//TODO add genre TextView storyTV = (TextView) view.findViewById(R.id.storyTextView);
	
		authorTV.setText("By " + story.getAuthor());
		titleTV.setText(story.getTitle());
		
		return view;
	}
}
