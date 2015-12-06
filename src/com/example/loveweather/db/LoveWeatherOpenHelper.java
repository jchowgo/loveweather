package com.example.loveweather.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class LoveWeatherOpenHelper extends SQLiteOpenHelper {

	/*
	 * 分别建立省，市，县的表
	 */
	public static final String CREATE_PROVINCE="creat table Province("
			+ "id integer primary key autoincrement,"
			+ "province_name text,"
			+ "province_code text),";
	public static final String CREATE_CITY="creat table City("
			+ "id integer primary key autoincrement,"
			+ "city_name text,"
			+ "city_code text)"
			+ "province_id integer)";
	public static final String CREATE_COUNTRY="creat table Country("
			+ "id integer primary key autoincrement,"
			+ "country_name text,"
			+ "country_code text,"
			+ "city_id integer)";
			
	
	
	public LoveWeatherOpenHelper(Context context, String name, CursorFactory factory, int version) {
		super(context, name, factory, version);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		//创建三个表
		db.execSQL(CREATE_PROVINCE); 
		db.execSQL(CREATE_CITY);
		db.execSQL(CREATE_COUNTRY);

	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		
	}

}
