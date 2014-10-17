package com.literalstudios.sleepystories;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // creates a reference to the my_fragment fragment
        MyFragment frag = new MyFragment();
        
        // adds the fragments to this activity
        getFragmentManager().beginTransaction()
        	.add(R.id.myFrame, frag)
        	.commit();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            
        	ScreenUtility utility = new ScreenUtility(this);
        	String output = "Width: " + utility.getWidth() + ", "
        			+ "Height: " + utility.getHeight();
        	
        	AlertDialog.Builder builder = new AlertDialog.Builder(this);
        	
        	builder.setMessage(output)
        			.setTitle("Dimensions")
        			.create()
        			.show();
        	
        	return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
