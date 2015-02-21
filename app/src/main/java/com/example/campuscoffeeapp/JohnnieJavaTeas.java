package com.example.campuscoffeeapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class JohnnieJavaTeas extends ActionBarActivity {
	
	public static String EXTRA_MESSAGE12 = "12ozPrice";
	public static String EXTRA_MESSAGE16 = "16ozPrice";
	public static String EXTRA_MESSAGE_TITLE = "Title";
	public static String EXTRA_MESSAGE_DESCRIPTION = "Description";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_johnnie_java_teas);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	public void hibiscusPunchPage(View view){
		//create next activity
		Intent intent = new Intent(this, JohnnieJavaBasic.class);
		//prices for 12oz and 16oz and the title
		String price12 = "N/A";
		String price16 = "$1.25  ";
		String title = "HIBISCUS PUNCH";
		//send data to next page
		intent.putExtra(EXTRA_MESSAGE12, price12);
		intent.putExtra(EXTRA_MESSAGE16, price16);
		intent.putExtra(EXTRA_MESSAGE_TITLE, title);
		//start next activity
		startActivity(intent);
	}
	
	public void earlGreyPage(View view){
		//create next activity
		Intent intent = new Intent(this, JohnnieJavaBasic.class);
		//prices for 12oz and 16oz and the title
		String price12 = "N/A";
		String price16 = "$1.25  ";
		String title = "EARL GREY";
		//send data to next page
		intent.putExtra(EXTRA_MESSAGE12, price12);
		intent.putExtra(EXTRA_MESSAGE16, price16);
		intent.putExtra(EXTRA_MESSAGE_TITLE, title);
		//start next activity
		startActivity(intent);
	}
	
	public void montanaGoldPage(View view){
		//create next activity
		Intent intent = new Intent(this, JohnnieJavaBasic.class);
		//prices for 12oz and 16oz and the title
		String price12 = "N/A";
		String price16 = "$1.25  ";
		String title = "MONTANA GOLD";
		//send data to next page
		intent.putExtra(EXTRA_MESSAGE12, price12);
		intent.putExtra(EXTRA_MESSAGE16, price16);
		intent.putExtra(EXTRA_MESSAGE_TITLE, title);
		//start next activity
		startActivity(intent);
	}
	
	public void sweetGingerGreenPage(View view){
		//create next activity
		Intent intent = new Intent(this, JohnnieJavaBasic.class);
		//prices for 12oz and 16oz and the title
		String price12 = "N/A";
		String price16 = "$1.25  ";
		String title = "SWEET GINGER GREEN";
		//send data to next page
		intent.putExtra(EXTRA_MESSAGE12, price12);
		intent.putExtra(EXTRA_MESSAGE16, price16);
		intent.putExtra(EXTRA_MESSAGE_TITLE, title);
		//start next activity
		startActivity(intent);
	}
	
	public void pomegranateGreenPage(View view){
		//create next activity
		Intent intent = new Intent(this, JohnnieJavaBasic.class);
		//prices for 12oz and 16oz and the title
		String price12 = "N/A";
		String price16 = "$1.25  ";
		String title = "POMEGRANATE GREEN";
		//send data to next page
		intent.putExtra(EXTRA_MESSAGE12, price12);
		intent.putExtra(EXTRA_MESSAGE16, price16);
		intent.putExtra(EXTRA_MESSAGE_TITLE, title);
		//start next activity
		startActivity(intent);
	}
	
	public void homePage(View view){
		//create next activity
		Intent intent = new Intent(this, JohnnieJavaHome.class);
		//start next activity
		startActivity(intent);
	}
}
