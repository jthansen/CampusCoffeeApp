package com.example.campuscoffeeapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class NonEspressoDrinks extends ActionBarActivity {
	public static String EXTRA_MESSAGE12 = "12ozPrice";
	public static String EXTRA_MESSAGE16 = "16ozPrice";
	public static String EXTRA_MESSAGE_TITLE = "Title";
	public static String EXTRA_MESSAGE_DESCRIPTION = "Description";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_non_espresso_drinks);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.non_espresso_drinks, menu);
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
	
	public void chaiTeaPage(View view){
		//create next activity
		Intent intent = new Intent(this, Basic.class);
		//prices for 12oz and 16oz and the title
		String price12 = "$2.95  ";
		String price16 = "$3.50  ";
		String title = "CHAI TEA";
		//send data to next page
		intent.putExtra(EXTRA_MESSAGE12, price12);
		intent.putExtra(EXTRA_MESSAGE16, price16);
		intent.putExtra(EXTRA_MESSAGE_TITLE, title);
		//start next activity
		startActivity(intent);
	}
	
	public void streamerPage(View view){
		//create next activity
		Intent intent = new Intent(this, BasicWithDescription.class);
		//prices for 12oz and 16oz and the title
		String price12 = "$1.75  ";
		String price16 = "$2.25  ";
		String title = "STREAMER";
		String description = "Steamed Milk with a Flavor Shot";
		//send data to next page
		intent.putExtra(EXTRA_MESSAGE12, price12);
		intent.putExtra(EXTRA_MESSAGE16, price16);
		intent.putExtra(EXTRA_MESSAGE_TITLE, title);
		intent.putExtra(EXTRA_MESSAGE_DESCRIPTION, description);
		//start next activity
		startActivity(intent);
	}
	
	public void hotChocolatePage(View view){
		//create next activity
		Intent intent = new Intent(this, Basic.class);
		//prices for 12oz and 16oz and the title
		String price12 = "$1.75  ";
		String price16 = "$2.25  ";
		String title = "HOT CHOCOLATE";
		//send data to next page
		intent.putExtra(EXTRA_MESSAGE12, price12);
		intent.putExtra(EXTRA_MESSAGE16, price16);
		intent.putExtra(EXTRA_MESSAGE_TITLE, title);
		//start next activity
		startActivity(intent);
	}
	
	public void appleCiderPage(View view){
		//create next activity
		Intent intent = new Intent(this, Basic.class);
		//prices for 12oz and 16oz and the title
		String price12 = "$2.00  ";
		String price16 = "$2.50  ";
		String title = "APPLE CIDER";
		//send data to next page
		intent.putExtra(EXTRA_MESSAGE12, price12);
		intent.putExtra(EXTRA_MESSAGE16, price16);
		intent.putExtra(EXTRA_MESSAGE_TITLE, title);
		//start next activity
		startActivity(intent);
	}
	
	public void energyDrinkPage(View view){
		//create next activity
		Intent intent = new Intent(this, Basic.class);
		//prices for 12oz and 16oz and the title
		String price12 = "N/A";
		String price16 = "$2.50  ";
		String title = "ENERGY DRINK";
		//send data to next page
		intent.putExtra(EXTRA_MESSAGE12, price12);
		intent.putExtra(EXTRA_MESSAGE16, price16);
		intent.putExtra(EXTRA_MESSAGE_TITLE, title);
		//start next activity
		startActivity(intent);
	}
	
	public void bottledPage(View view){
		//create next activity
		Intent intent = new Intent(this, BasicWithDescription.class);
		//prices for 12oz and 16oz and the title
		String price12 = "N/A";
		String price16 = "N/A";
		String title = "BOTTLED DRINKS";
		//send data to next page
		intent.putExtra(EXTRA_MESSAGE12, price12);
		intent.putExtra(EXTRA_MESSAGE16, price16);
		intent.putExtra(EXTRA_MESSAGE_DESCRIPTION, "All Bottled Drinks are $1.50");
		intent.putExtra(EXTRA_MESSAGE_TITLE, title);
		//start next activity
		startActivity(intent);
	}
	
	public void italianSodaPage(View view){
		//create next activity
		Intent intent = new Intent(this, Basic.class);
		//prices for 12oz and 16oz and the title
		String price12 = "N/A";
		String price16 = "$1.80  ";
		String title = "ITALIAN SODA";
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