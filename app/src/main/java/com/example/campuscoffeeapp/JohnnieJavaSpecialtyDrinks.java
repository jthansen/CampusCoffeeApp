package com.example.campuscoffeeapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class JohnnieJavaSpecialtyDrinks extends ActionBarActivity {

	public static String EXTRA_MESSAGE12 = "12ozPrice";
	public static String EXTRA_MESSAGE16 = "16ozPrice";
	public static String EXTRA_MESSAGE_TITLE = "Title";
	public static String EXTRA_MESSAGE_DESCRIPTION = "Description";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_johnnie__java__specialty__drinks);
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
	
	public void johnnieAutumn(View view){
		//create next activity
		Intent intent = new Intent(this, JohnnieJavaBasicDescription.class);
		//prices for 12oz and 16oz and the title
		String price12 = "$3.25  ";
		String price16 = "$4.00  ";
		String title = "JOHNNIE AUTUMN";
		String description = "Honey and Cinnamon Latte";
		//send data to next 
		intent.putExtra(EXTRA_MESSAGE12, price12);
		intent.putExtra(EXTRA_MESSAGE16, price16);
		intent.putExtra(EXTRA_MESSAGE_TITLE, title);
		intent.putExtra(EXTRA_MESSAGE_DESCRIPTION, description);
		//start next activity
		startActivity(intent);
	}
	
	public void theLink(View view){
		//create next activity
		Intent intent = new Intent(this, JohnnieJavaBasicDescription.class);
		//prices for 12oz and 16oz and the title
		String price12 = "$3.25  ";
		String price16 = "$4.00  ";
		String title = "THE LINK";
		String description = "White Chocolate and Chocolate Mocha";
		//send data to next 
		intent.putExtra(EXTRA_MESSAGE12, price12);
		intent.putExtra(EXTRA_MESSAGE16, price16);
		intent.putExtra(EXTRA_MESSAGE_TITLE, title);
		intent.putExtra(EXTRA_MESSAGE_DESCRIPTION, description);
		//start next activity
		startActivity(intent);
	}
	
	public void turtleMocha(View view){
		//create next activity
		Intent intent = new Intent(this, JohnnieJavaBasicDescription.class);
		//prices for 12oz and 16oz and the title
		String price12 = "$3.25  ";
		String price16 = "$4.00  ";
		String title = "TURTLE MOCHA";
		String description = "Chocolate and Caramel Mocha";
		//send data to next 
		intent.putExtra(EXTRA_MESSAGE12, price12);
		intent.putExtra(EXTRA_MESSAGE16, price16);
		intent.putExtra(EXTRA_MESSAGE_TITLE, title);
		intent.putExtra(EXTRA_MESSAGE_DESCRIPTION, description);
		//start next activity
		startActivity(intent);
	}
	
	public void sextonSunrise(View view){
		//create next activity
		Intent intent = new Intent(this, JohnnieJavaBasicDescription.class);
		//prices for 12oz and 16oz and the title
		String price12 = "$3.25  ";
		String price16 = "$4.00  ";
		String title = "SEXTON SUNRISE";
		String description = "Caramel and Vanilla Late";
		//send data to next 
		intent.putExtra(EXTRA_MESSAGE12, price12);
		intent.putExtra(EXTRA_MESSAGE16, price16);
		intent.putExtra(EXTRA_MESSAGE_TITLE, title);
		intent.putExtra(EXTRA_MESSAGE_DESCRIPTION, description);
		//start next activity
		startActivity(intent);
	}
	
	public void chapelWalk(View view){
		//create next activity
		Intent intent = new Intent(this, JohnnieJavaBasicDescription.class);
		//prices for 12oz and 16oz and the title
		String price12 = "$3.25  ";
		String price16 = "$4.00  ";
		String title = "CHAPEL WALK";
		String description = "Hazelnut and Caramel Latte";
		//send data to next 
		intent.putExtra(EXTRA_MESSAGE12, price12);
		intent.putExtra(EXTRA_MESSAGE16, price16);
		intent.putExtra(EXTRA_MESSAGE_TITLE, title);
		intent.putExtra(EXTRA_MESSAGE_DESCRIPTION, description);
		//start next activity
		startActivity(intent);
	}
	
	public void abbyRoad(View view){
		//create next activity
		Intent intent = new Intent(this, JohnnieJavaBasicDescription.class);
		//prices for 12oz and 16oz and the title
		String price12 = "$3.25  ";
		String price16 = "$4.00  ";
		String title = "ABBY ROAD";
		String description = "Chocolate and Raspberry Mocha";
		//send data to next 
		intent.putExtra(EXTRA_MESSAGE12, price12);
		intent.putExtra(EXTRA_MESSAGE16, price16);
		intent.putExtra(EXTRA_MESSAGE_TITLE, title);
		intent.putExtra(EXTRA_MESSAGE_DESCRIPTION, description);
		//start next activity
		startActivity(intent);
	}
	
	public void theEcho(View view){
		//create next activity
		Intent intent = new Intent(this, JohnnieJavaBasicDescription.class);
		//prices for 12oz and 16oz and the title
		String price12 = "$3.25  ";
		String price16 = "$4.00  ";
		String title = "THE ECHO";
		String description = "White Chocolate, Vanilla, and Almond Mocha";
		//send data to next 
		intent.putExtra(EXTRA_MESSAGE12, price12);
		intent.putExtra(EXTRA_MESSAGE16, price16);
		intent.putExtra(EXTRA_MESSAGE_TITLE, title);
		intent.putExtra(EXTRA_MESSAGE_DESCRIPTION, description);
		//start next activity
		startActivity(intent);
	}
	
	public void andesMintExtreme(View view){
		//create next activity
		Intent intent = new Intent(this, JohnnieJavaBasicDescription.class);
		//prices for 12oz and 16oz and the title
		String price12 = "$3.25  ";
		String price16 = "$4.00  ";
		String title = "ANDES MINT EXTREME";
		String description = "Chocolate Mocha with Peppermint";
		//send data to next 
		intent.putExtra(EXTRA_MESSAGE12, price12);
		intent.putExtra(EXTRA_MESSAGE16, price16);
		intent.putExtra(EXTRA_MESSAGE_TITLE, title);
		intent.putExtra(EXTRA_MESSAGE_DESCRIPTION, description);
		//start next activity
		startActivity(intent);
	}
	
	public void home(View view){
		//create new activity
		Intent intent = new Intent(this, JohnnieJavaHome.class);
		//start next activity
		startActivity(intent);
	}
}
