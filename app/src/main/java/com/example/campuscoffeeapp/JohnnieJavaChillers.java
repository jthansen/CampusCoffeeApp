package com.example.campuscoffeeapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class JohnnieJavaChillers extends ActionBarActivity {

	public static String EXTRA_MESSAGE12 = "12ozPrice";
	public static String EXTRA_MESSAGE16 = "16ozPrice";
	public static String EXTRA_MESSAGE_TITLE = "Title";
	public static String EXTRA_MESSAGE_DESCRIPTION = "Description";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_johnnie_java_chillers);
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

	public void mochaPage(View view) {
		// create next activity
		Intent intent = new Intent(this, JohnnieJavaBasic.class);
		// prices for 12oz and 16oz and the title
		String price12 = "N/A";
		String price16 = "$4.00  ";
		String title = "MOCHA";
		// send data to next page
		intent.putExtra(EXTRA_MESSAGE12, price12);
		intent.putExtra(EXTRA_MESSAGE16, price16);
		intent.putExtra(EXTRA_MESSAGE_TITLE, title);
		// start next activity
		startActivity(intent);
	}

	public void whiteChocolatePage(View view) {
		// create next activity
		Intent intent = new Intent(this, JohnnieJavaBasic.class);
		// prices for 12oz and 16oz and the title
		String price12 = "N/A";
		String price16 = "$4.00  ";
		String title = "WHITE CHOCOLATE";
		// send data to next page
		intent.putExtra(EXTRA_MESSAGE12, price12);
		intent.putExtra(EXTRA_MESSAGE16, price16);
		intent.putExtra(EXTRA_MESSAGE_TITLE, title);
		// start next activity
		startActivity(intent);
	}

	public void turtleMochaPage(View view) {
		// create next activity
		Intent intent = new Intent(this, JohnnieJavaBasic.class);
		// prices for 12oz and 16oz and the title
		String price12 = "N/A";
		String price16 = "$4.00  ";
		String title = "TURTLE MOCHA";
		// send data to next page
		intent.putExtra(EXTRA_MESSAGE12, price12);
		intent.putExtra(EXTRA_MESSAGE16, price16);
		intent.putExtra(EXTRA_MESSAGE_TITLE, title);
		// start next activity
		startActivity(intent);
	}

	public void oreoPage(View view) {
		// create next activity
		Intent intent = new Intent(this, JohnnieJavaBasic.class);
		// prices for 12oz and 16oz and the title
		String price12 = "N/A";
		String price16 = "$4.00  ";
		String title = "OREO";
		// send data to next page
		intent.putExtra(EXTRA_MESSAGE12, price12);
		intent.putExtra(EXTRA_MESSAGE16, price16);
		intent.putExtra(EXTRA_MESSAGE_TITLE, title);
		// start next activity
		startActivity(intent);
	}

	public void vanillaPage(View view) {
		// create next activity
		Intent intent = new Intent(this, JohnnieJavaBasic.class);
		// prices for 12oz and 16oz and the title
		String price12 = "N/A";
		String price16 = "$4.00  ";
		String title = "VANILLA";
		// send data to next page
		intent.putExtra(EXTRA_MESSAGE12, price12);
		intent.putExtra(EXTRA_MESSAGE16, price16);
		intent.putExtra(EXTRA_MESSAGE_TITLE, title);
		// start next activity
		startActivity(intent);
	}

	public void caramelPage(View view) {
		// create next activity
		Intent intent = new Intent(this, JohnnieJavaBasic.class);
		// prices for 12oz and 16oz and the title
		String price12 = "N/A";
		String price16 = "$4.00  ";
		String title = "CARAMEL";
		// send data to next page
		intent.putExtra(EXTRA_MESSAGE12, price12);
		intent.putExtra(EXTRA_MESSAGE16, price16);
		intent.putExtra(EXTRA_MESSAGE_TITLE, title);
		// start next activity
		startActivity(intent);
	}

	public void hazelnutPage(View view) {
		// create next activity
		Intent intent = new Intent(this, JohnnieJavaBasic.class);
		// prices for 12oz and 16oz and the title
		String price12 = "N/A";
		String price16 = "$4.00  ";
		String title = "HAZELNUT";
		// send data to next page
		intent.putExtra(EXTRA_MESSAGE12, price12);
		intent.putExtra(EXTRA_MESSAGE16, price16);
		intent.putExtra(EXTRA_MESSAGE_TITLE, title);
		// start next activity
		startActivity(intent);
	}

	public void chaiPage(View view) {
		// create next activity
		Intent intent = new Intent(this, JohnnieJavaBasic.class);
		// prices for 12oz and 16oz and the title
		String price12 = "N/A";
		String price16 = "$4.00  ";
		String title = "CHAI";
		// send data to next page
		intent.putExtra(EXTRA_MESSAGE12, price12);
		intent.putExtra(EXTRA_MESSAGE16, price16);
		intent.putExtra(EXTRA_MESSAGE_TITLE, title);
		// start next activity
		startActivity(intent);
	}

	public void buildYourOwnPage(View view) {
		// create next activity
		Intent intent = new Intent(this, JohnnieJavaBasic.class);
		// prices for 12oz and 16oz and the title
		String price12 = "N/A";
		String price16 = "$4.00  ";
		String title = "BUILD YOUR OWN";
		// send data to next page
		intent.putExtra(EXTRA_MESSAGE12, price12);
		intent.putExtra(EXTRA_MESSAGE16, price16);
		intent.putExtra(EXTRA_MESSAGE_TITLE, title);
		// start next activity
		startActivity(intent);
	}

	public void homePage(View view) {
		// create next activity
		Intent intent = new Intent(this, JohnnieJavaHome.class);
		// start next activity
		startActivity(intent);
	}
}
