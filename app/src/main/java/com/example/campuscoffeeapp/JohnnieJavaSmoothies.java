package com.example.campuscoffeeapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class JohnnieJavaSmoothies extends ActionBarActivity {

	public static String EXTRA_MESSAGE12 = "12ozPrice";
	public static String EXTRA_MESSAGE16 = "16ozPrice";
	public static String EXTRA_MESSAGE_TITLE = "Title";
	public static String EXTRA_MESSAGE_DESCRIPTION = "Description";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_johnnie_java_smoothies);
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
	
	public void bennieBerryPage(View view){
		//create next activity
		Intent intent = new Intent(this, JohnnieJavaBasicDescription.class);
		//prices for 12oz and 16oz and the title
		String price12 = "N/A";
		String price16 = "$4.00  ";
		String title = "BENNIE BERRY";
		String description = "Blueberries, Raspberry, and Strawberries";
		//send data to next page
		intent.putExtra(EXTRA_MESSAGE12, price12);
		intent.putExtra(EXTRA_MESSAGE16, price16);
		intent.putExtra(EXTRA_MESSAGE_TITLE, title);
		intent.putExtra(EXTRA_MESSAGE_DESCRIPTION, description);
		//start next activity
		startActivity(intent);
	}
	
	public void tropicalSunsetPage(View view){
		//create next activity
		Intent intent = new Intent(this, JohnnieJavaBasicDescription.class);
		//prices for 12oz and 16oz and the title
		String price12 = "N/A";
		String price16 = "$4.00  ";
		String title = "TROPICAL SUNSET";
		String description = "Peaches, Strawberries, and Bananas";
		//send data to next page
		intent.putExtra(EXTRA_MESSAGE12, price12);
		intent.putExtra(EXTRA_MESSAGE16, price16);
		intent.putExtra(EXTRA_MESSAGE_TITLE, title);
		intent.putExtra(EXTRA_MESSAGE_DESCRIPTION, description);
		//start next activity
		startActivity(intent);
	}
	
	public void mangoTangoPage(View view){
		//create next activity
		Intent intent = new Intent(this, JohnnieJavaBasicDescription.class);
		//prices for 12oz and 16oz and the title
		String price12 = "N/A";
		String price16 = "$4.00  ";
		String title = "MANGO TANGO";
		String description = "Mangos, Strawberries, and Peaches";
		//send data to next page
		intent.putExtra(EXTRA_MESSAGE12, price12);
		intent.putExtra(EXTRA_MESSAGE16, price16);
		intent.putExtra(EXTRA_MESSAGE_TITLE, title);
		intent.putExtra(EXTRA_MESSAGE_DESCRIPTION, description);
		//start next activity
		startActivity(intent);
	}
	
	public void homePage(View view){
		//create new activity
		Intent intent = new Intent(this, JohnnieJavaHome.class);
		//start next activity
		startActivity(intent);
	}
}
