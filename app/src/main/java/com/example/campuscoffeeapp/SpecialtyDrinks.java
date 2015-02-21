package com.example.campuscoffeeapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.example.campuscoffeeapp.FeedReaderContract.*;

public class SpecialtyDrinks extends ActionBarActivity {
	public static String EXTRA_MESSAGE12 = "12ozPrice";
	public static String EXTRA_MESSAGE16 = "16ozPrice";
	public static String EXTRA_MESSAGE_TITLE = "Title";
	public static String EXTRA_MESSAGE_DESCRIPTION = "Description";

    SpecialtyDrinks(){}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_specialty_drinks);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.specialty_drinks, menu);
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
	
	public void johnnieAutumnPage(View view){
		//create next activity
		Intent intent = new Intent(this, BasicWithDescription.class);
		//prices for 12oz and 16oz and the title
		String price12 = "$2.99  ";
		String price16 = "$3.75  ";
		String title = "JOHNNIE AUTUMN";
		String description = "Latte with Cinnamon and Honey";
		//send data to next page
		intent.putExtra(EXTRA_MESSAGE12, price12);
		intent.putExtra(EXTRA_MESSAGE16, price16);
		intent.putExtra(EXTRA_MESSAGE_TITLE, title);
		intent.putExtra(EXTRA_MESSAGE_DESCRIPTION, description);
		//start next activity
		startActivity(intent);
	}
	
	public void bennieDreamPage(View view){
		//create next activity
		Intent intent = new Intent(this, BasicWithDescription.class);
		//prices for 12oz and 16oz and the title
		String price12 = "$2.99  ";
		String price16 = "$3.75  ";
		String title = "BENNIE DREAM";
		String description = "Dark Chocolate Mocha with Cherry";
		//send data to next page
		intent.putExtra(EXTRA_MESSAGE12, price12);
		intent.putExtra(EXTRA_MESSAGE16, price16);
		intent.putExtra(EXTRA_MESSAGE_TITLE, title);
		intent.putExtra(EXTRA_MESSAGE_DESCRIPTION, description);
		//start next activity
		startActivity(intent);
	}
	
	public void theLinkPage(View view){
		//create next activity
		Intent intent = new Intent(this, BasicWithDescription.class);
		//prices for 12oz and 16oz and the title
		String price12 = "$2.99  ";
		String price16 = "$3.75  ";
		String title = "THE LINK";
		String description = "White Chocolate and Dark Chocolate Mocha";
		//send data to next page
		intent.putExtra(EXTRA_MESSAGE12, price12);
		intent.putExtra(EXTRA_MESSAGE16, price16);
		intent.putExtra(EXTRA_MESSAGE_TITLE, title);
		intent.putExtra(EXTRA_MESSAGE_DESCRIPTION, description);
		//start next activity
		startActivity(intent);
	}
	
	public void turtleMochaPage(View view){
		//create next activity
		Intent intent = new Intent(this, BasicWithDescription.class);
		//prices for 12oz and 16oz and the title
		String price12 = "$2.99  ";
		String price16 = "$3.75  ";
		String title = "TURTLE MOCHA";
		String description = "Dark Chocolate Mocha with Caramel";
		//send data to next page
		intent.putExtra(EXTRA_MESSAGE12, price12);
		intent.putExtra(EXTRA_MESSAGE16, price16);
		intent.putExtra(EXTRA_MESSAGE_TITLE, title);
		intent.putExtra(EXTRA_MESSAGE_DESCRIPTION, description);
		//start next activity
		startActivity(intent);
	}
	
	public void theEchoPage(View view){
		//create next activity
		Intent intent = new Intent(this, BasicWithDescription.class);
		//prices for 12oz and 16oz and the title
		String price12 = "$2.99  ";
		String price16 = "$3.75  ";
		String title = "THE ECHO";
		String description = "White Chocolate Mocha with Vanilla and Almond";
		//send data to next page
		intent.putExtra(EXTRA_MESSAGE12, price12);
		intent.putExtra(EXTRA_MESSAGE16, price16);
		intent.putExtra(EXTRA_MESSAGE_TITLE, title);
		intent.putExtra(EXTRA_MESSAGE_DESCRIPTION, description);
		//start next activity
		startActivity(intent);
	}
	
	public void CSBSenatePage(View view){
		//create next activity
		Intent intent = new Intent(this, BasicWithDescription.class);
		//prices for 12oz and 16oz and the title
		String price12 = "$2.99  ";
		String price16 = "$3.75  ";
		String title = "CSB SENATE";
		String description = "Dark Chocolate Mocha with Caramel and English Toffee";
		//send data to next page
		intent.putExtra(EXTRA_MESSAGE12, price12);
		intent.putExtra(EXTRA_MESSAGE16, price16);
		intent.putExtra(EXTRA_MESSAGE_TITLE, title);
		intent.putExtra(EXTRA_MESSAGE_DESCRIPTION, description);
		//start next activity
		startActivity(intent);
	}
	
	public void mochaLovePage(View view){
		//create next activity
		Intent intent = new Intent(this, BasicWithDescription.class);
		//prices for 12oz and 16oz and the title
		String price12 = "$2.99  ";
		String price16 = "$3.75  ";
		String title = "MOCHA LOVE ANGEL";
		String description = "White Chocolate Mocha with Vanilla and Blackberry";
		//send data to next page
		intent.putExtra(EXTRA_MESSAGE12, price12);
		intent.putExtra(EXTRA_MESSAGE16, price16);
		intent.putExtra(EXTRA_MESSAGE_TITLE, title);
		intent.putExtra(EXTRA_MESSAGE_DESCRIPTION, description);
		//start next activity
		startActivity(intent);
	}
	
	public void andesMintExtremePage(View view){
		//create next activity
		Intent intent = new Intent(this, BasicWithDescription.class);
		//prices for 12oz and 16oz and the title
		String price12 = "$2.99  ";
		String price16 = "$3.75  ";
		String title = "ANDES MINT EXTREME";
		String description = "Dark Chocolate Mocha with Peppermint";
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
		Intent intent = new Intent(this, ClemensPerkHome.class);
		//start next activity
		startActivity(intent);
	}
}
