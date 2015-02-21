package com.example.campuscoffeeapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class BasicWithDescription extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_basic_with_description);
		Intent intent = getIntent();
		// get the 12oz, 16oz, and title information from the coffee menu class
		String message12 = intent.getStringExtra(ClemensPerkMenu.EXTRA_MESSAGE12);
		String message16 = intent.getStringExtra(ClemensPerkMenu.EXTRA_MESSAGE16);
		String messageDescription = intent.getStringExtra(ClemensPerkMenu.EXTRA_MESSAGE_DESCRIPTION);
		String messageTitle = intent
				.getStringExtra(ClemensPerkMenu.EXTRA_MESSAGE_TITLE);
		// place 12oz price in app display
		Button button12 = (Button) findViewById(R.id.button_12oz_price);
		// if there is a 12oz price for the drink:
		if (!message12.equals("N/A")) {
			button12.setText(message12);
		}
		// if there is not, remove the 12oz price for the drink:
		else {
			button12.setVisibility(View.INVISIBLE);
			Button button12oz = (Button) findViewById(R.id.button_12oz);
			button12oz.setVisibility(View.INVISIBLE);
		}
		// place 16oz price in app display
		Button button16 = (Button) findViewById(R.id.button_16oz_price);
		// if there is a 16oz price for the drink:
		if (!message16.equals("N/A")) {
			button16.setText(message16);
		}
		// if there is not, remove the 16oz price for the drink:
		else {
			button16.setVisibility(View.INVISIBLE);
			Button button16oz = (Button) findViewById(R.id.button_16oz);
			button16oz.setVisibility(View.INVISIBLE);
		}
		Button buttonDescription = (Button) findViewById(R.id.button_description);
		buttonDescription.setText(messageDescription);
		// place title in app display
		Button buttonTitle = (Button) findViewById(R.id.button_title);
		buttonTitle.setText(messageTitle);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.basic_with_description, menu);
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
}
