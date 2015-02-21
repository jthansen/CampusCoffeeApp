package com.example.campuscoffeeapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class JohnnieJavaDrinks extends ActionBarActivity {

	public static String EXTRA_MESSAGE12 = "12ozPrice";
	public static String EXTRA_MESSAGE16 = "16ozPrice";
	public static String EXTRA_MESSAGE_TITLE = "Title";
	public static String EXTRA_MESSAGE_DESCRIPTION = "Description";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_johnnie_java_drinks);
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
	
	public void lattePage(View view){
		//create next activity
		Intent intent = new Intent(this, JohnnieJavaBasic.class);
		//prices for 12oz and 16oz and the title
		String price12 = "$2.50  ";
		String price16 = "$3.25  ";
		String title = "LATTE";
		//send data to next page
		intent.putExtra(EXTRA_MESSAGE12, price12);
		intent.putExtra(EXTRA_MESSAGE16, price16);
		intent.putExtra(EXTRA_MESSAGE_TITLE, title);
		//start next activity
		startActivity(intent);
	}
	
	public void mochaPage(View view){
		//create next activity
		Intent intent = new Intent(this, JohnnieJavaBasic.class);
		//prices for 12oz and 16oz and the title
		String price12 = "$3.00  ";
		String price16 = "$3.75  ";
		String title = "MOCHA";
		//send data to next page
		intent.putExtra(EXTRA_MESSAGE12, price12);
		intent.putExtra(EXTRA_MESSAGE16, price16);
		intent.putExtra(EXTRA_MESSAGE_TITLE, title);
		//start next activity
		startActivity(intent);
	}
	
	public void cappuccinoPage(View view){
		//create next activity
		Intent intent = new Intent(this, JohnnieJavaBasic.class);
		//prices for 12oz and 16oz and the title
		String price12 = "$2.50  ";
		String price16 = "$3.25  ";
		String title = "CAPPUCCINO";
		//send data to next page
		intent.putExtra(EXTRA_MESSAGE12, price12);
		intent.putExtra(EXTRA_MESSAGE16, price16);
		intent.putExtra(EXTRA_MESSAGE_TITLE, title);
		//start next activity
		startActivity(intent);
	}
	
	public void macchiatoPage(View view){
		//create next activity
		Intent intent = new Intent(this, JohnnieJavaBasic.class);
		//prices for 12oz and 16oz and the title
		String price12 = "$2.50  ";
		String price16 = "$3.25  ";
		String title = "MACCHIATO";
		//send data to next page
		intent.putExtra(EXTRA_MESSAGE12, price12);
		intent.putExtra(EXTRA_MESSAGE16, price16);
		intent.putExtra(EXTRA_MESSAGE_TITLE, title);
		//start next activity
		startActivity(intent);
	}
	
	public void americanoPage(View view){
		//create next activity
		Intent intent = new Intent(this, JohnnieJavaBasic.class);
		//prices for 12oz and 16oz and the title
		String price12 = "$1.75  ";
		String price16 = "$2.25  ";
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
		Intent intent = new Intent(this, JohnnieJavaBasic.class);
		//prices for 12oz and 16oz and the title
		String price12 = "$2.00  ";
		String price16 = "$2.75  ";
		String title = "DEPTH CHARGE";
		//send data to next page
		intent.putExtra(EXTRA_MESSAGE12, price12);
		intent.putExtra(EXTRA_MESSAGE16, price16);
		intent.putExtra(EXTRA_MESSAGE_TITLE, title);
		//start next activity
		startActivity(intent);
	}
	
	public void chaiTeaLattePage(View view){
		//create next activity
		Intent intent = new Intent(this, JohnnieJavaBasic.class);
		//prices for 12oz and 16oz and the title
		String price12 = "$3.25  ";
		String price16 = "$3.75  ";
		String title = "CHAI TEA LATTE";
		//send data to next page
		intent.putExtra(EXTRA_MESSAGE12, price12);
		intent.putExtra(EXTRA_MESSAGE16, price16);
		intent.putExtra(EXTRA_MESSAGE_TITLE, title);
		//start next activity
		startActivity(intent);
	}
	
	public void steamersPage(View view){
		//create next activity
		Intent intent = new Intent(this, JohnnieJavaBasic.class);
		//prices for 12oz and 16oz and the title
		String price12 = "$2.00  ";
		String price16 = "$2.50  ";
		String title = "STEAMERS";
		//send data to next page
		intent.putExtra(EXTRA_MESSAGE12, price12);
		intent.putExtra(EXTRA_MESSAGE16, price16);
		intent.putExtra(EXTRA_MESSAGE_TITLE, title);
		//start next activity
		startActivity(intent);
	}
	
	public void hotChocolatePage(View view){
		//create next activity
		Intent intent = new Intent(this, JohnnieJavaBasic.class);
		//prices for 12oz and 16oz and the title
		String price12 = "$2.00  ";
		String price16 = "$2.50  ";
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
		Intent intent = new Intent(this, JohnnieJavaBasic.class);
		//prices for 12oz and 16oz and the title
		String price12 = "$2.25  ";
		String price16 = "$2.75  ";
		String title = "APPLE CIDER";
		//send data to next page
		intent.putExtra(EXTRA_MESSAGE12, price12);
		intent.putExtra(EXTRA_MESSAGE16, price16);
		intent.putExtra(EXTRA_MESSAGE_TITLE, title);
		//start next activity
		startActivity(intent);
	}
	
	public void italianSodaPage(View view){
		//create next activity
		Intent intent = new Intent(this, JohnnieJavaBasic.class);
		//prices for 12oz and 16oz and the title
		String price12 = "$2.00  ";
		String price16 = "N/A";
		String title = "ITALIAN SODA";
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
