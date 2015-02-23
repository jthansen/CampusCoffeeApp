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
    private DrinksDatabase db;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_johnnie__java__specialty__drinks);
        db = new DrinksDatabase();
        db.onCreate(savedInstanceState);
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
        DrinkDBEntry drink = db.getDrink("JOHNNIE AUTUMN");
		//create next activity
		Intent intent = new Intent(this, JohnnieJavaBasicDescription.class);
		//prices for 12oz and 16oz and the title
		String price12 = drink.get12ozPrice();
		String price16 = drink.get12ozPrice();
		String title = drink.getName();
		String description = drink.getDescription();
		//send data to next 
		intent.putExtra(EXTRA_MESSAGE12, price12);
		intent.putExtra(EXTRA_MESSAGE16, price16);
		intent.putExtra(EXTRA_MESSAGE_TITLE, title);
		intent.putExtra(EXTRA_MESSAGE_DESCRIPTION, description);
		//start next activity
		startActivity(intent);
	}
	
	public void theLink(View view){
        DrinkDBEntry drink = db.getDrink("THE LINK");
		//create next activity
		Intent intent = new Intent(this, JohnnieJavaBasicDescription.class);
		//prices for 12oz and 16oz and the title
        String price12 = drink.get12ozPrice();
        String price16 = drink.get12ozPrice();
        String title = drink.getName();
        String description = drink.getDescription();
		//send data to next 
		intent.putExtra(EXTRA_MESSAGE12, price12);
		intent.putExtra(EXTRA_MESSAGE16, price16);
		intent.putExtra(EXTRA_MESSAGE_TITLE, title);
		intent.putExtra(EXTRA_MESSAGE_DESCRIPTION, description);
		//start next activity
		startActivity(intent);
	}
	
	public void turtleMocha(View view){
        DrinkDBEntry drink = db.getDrink("TURTLE MOCHA");
		//create next activity
		Intent intent = new Intent(this, JohnnieJavaBasicDescription.class);
		//prices for 12oz and 16oz and the title
        String price12 = drink.get12ozPrice();
        String price16 = drink.get12ozPrice();
        String title = drink.getName();
        String description = drink.getDescription();
		//send data to next 
		intent.putExtra(EXTRA_MESSAGE12, price12);
		intent.putExtra(EXTRA_MESSAGE16, price16);
		intent.putExtra(EXTRA_MESSAGE_TITLE, title);
		intent.putExtra(EXTRA_MESSAGE_DESCRIPTION, description);
		//start next activity
		startActivity(intent);
	}
	
	public void sextonSunrise(View view){
        DrinkDBEntry drink = db.getDrink("SEXTON SUNRISE");
		//create next activity
		Intent intent = new Intent(this, JohnnieJavaBasicDescription.class);
		//prices for 12oz and 16oz and the title
        String price12 = drink.get12ozPrice();
        String price16 = drink.get12ozPrice();
        String title = drink.getName();
        String description = drink.getDescription();
		//send data to next 
		intent.putExtra(EXTRA_MESSAGE12, price12);
		intent.putExtra(EXTRA_MESSAGE16, price16);
		intent.putExtra(EXTRA_MESSAGE_TITLE, title);
		intent.putExtra(EXTRA_MESSAGE_DESCRIPTION, description);
		//start next activity
		startActivity(intent);
	}
	
	public void chapelWalk(View view){
        DrinkDBEntry drink = db.getDrink("CHAPEL WALK");
		//create next activity
		Intent intent = new Intent(this, JohnnieJavaBasicDescription.class);
		//prices for 12oz and 16oz and the title
        String price12 = drink.get12ozPrice();
        String price16 = drink.get12ozPrice();
        String title = drink.getName();
        String description = drink.getDescription();
		//send data to next 
		intent.putExtra(EXTRA_MESSAGE12, price12);
		intent.putExtra(EXTRA_MESSAGE16, price16);
		intent.putExtra(EXTRA_MESSAGE_TITLE, title);
		intent.putExtra(EXTRA_MESSAGE_DESCRIPTION, description);
		//start next activity
		startActivity(intent);
	}
	
	public void abbyRoad(View view){
        DrinkDBEntry drink = db.getDrink("ABBY ROAD");
		//create next activity
		Intent intent = new Intent(this, JohnnieJavaBasicDescription.class);
		//prices for 12oz and 16oz and the title
        String price12 = drink.get12ozPrice();
        String price16 = drink.get12ozPrice();
        String title = drink.getName();
        String description = drink.getDescription();
		//send data to next 
		intent.putExtra(EXTRA_MESSAGE12, price12);
		intent.putExtra(EXTRA_MESSAGE16, price16);
		intent.putExtra(EXTRA_MESSAGE_TITLE, title);
		intent.putExtra(EXTRA_MESSAGE_DESCRIPTION, description);
		//start next activity
		startActivity(intent);
	}
	
	public void theEcho(View view){
        DrinkDBEntry drink = db.getDrink("THE ECHO");
		//create next activity
		Intent intent = new Intent(this, JohnnieJavaBasicDescription.class);
		//prices for 12oz and 16oz and the title
        String price12 = drink.get12ozPrice();
        String price16 = drink.get12ozPrice();
        String title = drink.getName();
        String description = drink.getDescription();
		//send data to next 
		intent.putExtra(EXTRA_MESSAGE12, price12);
		intent.putExtra(EXTRA_MESSAGE16, price16);
		intent.putExtra(EXTRA_MESSAGE_TITLE, title);
		intent.putExtra(EXTRA_MESSAGE_DESCRIPTION, description);
		//start next activity
		startActivity(intent);
	}
	
	public void andesMintExtreme(View view){
        DrinkDBEntry drink = db.getDrink("ANDES MINT EXTREME");
		//create next activity
		Intent intent = new Intent(this, JohnnieJavaBasicDescription.class);
		//prices for 12oz and 16oz and the title
        String price12 = drink.get12ozPrice();
        String price16 = drink.get12ozPrice();
        String title = drink.getName();
        String description = drink.getDescription();
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
