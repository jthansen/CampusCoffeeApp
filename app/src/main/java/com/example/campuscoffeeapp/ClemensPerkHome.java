package com.example.campuscoffeeapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class ClemensPerkHome extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_clemens_perk_home);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.clemens_perk_home, menu);
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
	
	public void menuPage(View view){
		//create next activity
		Intent intent = new Intent(this, ClemensPerkMenu.class);
		//start next activity
		startActivity(intent);
	}
	
	public void dailyOffersPage(View view){
		//create next activity
		Intent intent = new Intent(this, DailyOffersClemensPerk.class);
		//start next activity
		startActivity(intent);
	}
	
	public void perksPage(View view){
		//create next activity
		Intent intent = new Intent(this, DailyOffersClemensPerk.class);
		//start next activity
		startActivity(intent);
	}
	
	public void brewCrewPage(View view){
		//create next activity
		Intent intent = new Intent(this, BrewCrew.class);
		//start next activity
		startActivity(intent);
	}
	
	public void aboutPage(View view){
		//create next activity
		Intent intent = new Intent(this, ClemensAbout.class);
		//start next activity
		startActivity(intent);
	}
	
	public void homePage(View view){
		//create next activity
		Intent intent = new Intent(this, MainActivity.class);
		//start next activity
		startActivity(intent);
	}
}
