package com.literalstudios.sleepystories;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MySQLiteHelper extends SQLiteOpenHelper{
	
	//Database version
	private static final int DATABASE_VERSION = 1;
	//Database name
	private static final String DATABASE_NAME= "StoryDB";
	//Table name
	private static final String TABLE_NAME = "stories";
	//collumn names
	private static final String KEY_ID = "_id";
	private static final String KEY_AUTHOR = "author";
	private static final String KEY_TITLE = "title";
	private static final String KEY_TEXT_FILE = "textFile";
	private static final String KEY_GENRE = "genre";
	
	//Constructor 
	public MySQLiteHelper(Context context){
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}
	
	//creates table
	public void onCreate(SQLiteDatabase db){
		// SQL statement to create book table
		String CREATE_BOOK_TABLE = "CREATE TABLE " + TABLE_NAME + 
				"( " +
				KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
				KEY_TITLE + " TEXT NOT NULL, " +
				KEY_AUTHOR + " TEXT NOT NULL, " +
				KEY_TEXT_FILE+ " TEXT NOT NULL, " +
				KEY_GENRE + " TEXT)";
		db.execSQL(CREATE_BOOK_TABLE);	
	}
	
	//upgrading database
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
		//drop old table if existing
		db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
		
		//recreate updated table
		onCreate(db);
	}
	
	//DB manipulation methods
	
	//Adding new contact
	void addStory(Story story){
		SQLiteDatabase db = this.getWritableDatabase();
		
		ContentValues values = new ContentValues();
		values.put(KEY_TITLE, story.getTitle());
		values.put(KEY_AUTHOR, story.getAuthor());
		values.put(KEY_TEXT_FILE, story.getTextFile());
		values.put(KEY_GENRE, story.getGenre());
		
		//SQL insertion and closing DB
		db.insert(TABLE_NAME, null, values);
		db.close();
		}
}
