package com.example.campuscoffeeapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class JohnnieJavaHome extends ActionBarActivity {
 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_johnnie_java_home);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.johnnie_java_home, menu);
		return true;
	}
	
	
	//makes it so pages don't go back and forth?
		public void main(View v) {
		    	
		    	//Intent intent = new Intent(this, MainActivity.class);
		    	//startActivity(intent);
				finish();
				
		    	
		    	
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
		Intent intent = new Intent(this, JohnnieJavaMenu.class);
		//start next activity
		startActivity(intent);
	}
	
	public void dailyOffersPage(View view){
		//create next activity
		Intent intent = new Intent(this, JohnnieJavaOffers.class);
		//start next activity
		startActivity(intent);
	}
	
	public void specialsPage(View view){
		//create next activity
		Intent intent = new Intent(this, JohnnieJavaOffers.class);
		//start next activity
		startActivity(intent);
	}
	
	public void staffPage(View view){
		//create next activity
		Intent intent = new Intent(this, JohnnieJavaStaff.class);
		//start next activity
		startActivity(intent);
	}
	
	public void aboutPage(View view){
		//create next activity
		Intent intent = new Intent(this, JohnnieAbout.class);
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
