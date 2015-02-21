package com.example.campuscoffeeapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class JohnnieJavaSyrups extends ActionBarActivity {

	public static String EXTRA_MESSAGE12 = "12ozPrice";
	public static String EXTRA_MESSAGE16 = "16ozPrice";
	public static String EXTRA_MESSAGE_TITLE = "Title";
	public static String EXTRA_MESSAGE_DESCRIPTION = "Description";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_johnnie_java_syrups);
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

	public void flavoredSyrupsPage(View view) {
		// create next activity
		Intent intent = new Intent(this, JohnnieJavaFlavoredSyrups.class);
		// start next activity
		startActivity(intent);
	}
	
	public void sugarFreeSyrupsPage(View view) {
		// create next activity
		Intent intent = new Intent(this, JohnnieJavaSugarFreeSyrups.class);
		// start next activity
		startActivity(intent);
	}

	public void organicSyrupsPage(View view) {
		// create next activity
		Intent intent = new Intent(this, JohnnieJavaOrganicSyrups.class);
		// start next activity
		startActivity(intent);
	}
	
	public void homePage(View view) {
		// create next activity
		Intent intent = new Intent(this, JohnnieJavaMenu.class);
		// start next activity
		startActivity(intent);
	}
}
