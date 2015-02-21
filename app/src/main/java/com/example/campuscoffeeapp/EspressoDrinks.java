package com.example.campuscoffeeapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class EspressoDrinks extends ActionBarActivity {
	public static String EXTRA_MESSAGE12 = "12ozPrice";
	public static String EXTRA_MESSAGE16 = "16ozPrice";
	public static String EXTRA_MESSAGE_TITLE = "Title";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_espresso_drinks);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.espresso_drinks, menu);
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
	public void lattePage(View view){
		//create next activity
		Intent intent = new Intent(this, Basic.class);
		//prices for 12oz and 16oz and the title
		String price12 = "$2.25  ";
		String price16 = "$3.00  ";
		String title = "LATTE";
		//send data to next page
		intent.putExtra(EXTRA_MESSAGE12, price12);
		intent.putExtra(EXTRA_MESSAGE16, price16);
		intent.putExtra(EXTRA_MESSAGE_TITLE, title);
		//start next activity
		startActivity(intent);
	}
	
	public void cappuccinoPage(View view){
		//create next activity
		Intent intent = new Intent(this, Basic.class);
		//prices for 12oz and 16oz and the title
		String price12 = "$2.25  ";
		String price16 = "$3.00  ";
		String title = "CAPPUCCINO";
		//send data to next page
		intent.putExtra(EXTRA_MESSAGE12, price12);
		intent.putExtra(EXTRA_MESSAGE16, price16);
		intent.putExtra(EXTRA_MESSAGE_TITLE, title);
		//start next activity
		startActivity(intent);
	}
	
	public void americanoPage(View view){
		//create next activity
		Intent intent = new Intent(this, Basic.class);
		//prices for 12oz and 16oz and the title
		String price12 = "$1.50  ";
		String price16 = "$2.00  ";
		String title = "AMERICANO";
		//send data to next page
		intent.putExtra(EXTRA_MESSAGE12, price12);
		intent.putExtra(EXTRA_MESSAGE16, price16);
		intent.putExtra(EXTRA_MESSAGE_TITLE, title);
		//start next activity
		startActivity(intent);
	}
	
	public void depthChargePage(View view){
		//create next activity
		Intent intent = new Intent(this, Basic.class);
		//prices for 12oz and 16oz and the title
		String price12 = "$1.75  ";
		String price16 = "$2.50  ";
		String title = "DEPTH CHARGE";
		//send data to next page
		intent.putExtra(EXTRA_MESSAGE12, price12);
		intent.putExtra(EXTRA_MESSAGE16, price16);
		intent.putExtra(EXTRA_MESSAGE_TITLE, title);
		//start next activity
		startActivity(intent);
	}
	
	public void mochaPage(View view){
		//create next activity
		Intent intent = new Intent(this, Basic.class);
		//prices for 12oz and 16oz and the title
		String price12 = "$2.75  ";
		String price16 = "$3.50  ";
		String title = "MOCHA";
		//send data to next page
		intent.putExtra(EXTRA_MESSAGE12, price12);
		intent.putExtra(EXTRA_MESSAGE16, price16);
		intent.putExtra(EXTRA_MESSAGE_TITLE, title);
		//start next activity
		startActivity(intent);
	}
	
	public void coldPressPage(View view){
		//create next activity
		Intent intent = new Intent(this, Basic.class);
		//prices for 12oz and 16oz and the title
		String price12 = "N/A";
		String price16 = "$2.50  ";
		String title = "COLD PRESS";
		//send data to next page
		intent.putExtra(EXTRA_MESSAGE12, price12);
		intent.putExtra(EXTRA_MESSAGE16, price16);
		intent.putExtra(EXTRA_MESSAGE_TITLE, title);
		//start next activity
		startActivity(intent);
	}
	
	public void homePage(View view){
		//create new activity
		Intent intent = new Intent(this, ClemensPerkHome.class);
		//start next activity
		startActivity(intent);
	}
}
