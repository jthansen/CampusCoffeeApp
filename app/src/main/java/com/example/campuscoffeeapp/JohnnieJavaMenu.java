package com.example.campuscoffeeapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class JohnnieJavaMenu extends ActionBarActivity {

	public static final String EXTRA_MESSAGE12 = "12ozPrice";
	public static String EXTRA_MESSAGE16 = "16ozPrice";
	public static final String EXTRA_MESSAGE_DESCRIPTION = "Description";
	public static String EXTRA_MESSAGE_TITLE = "Title";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_johnnie_java_menu);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_johnnie_java, menu);
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

    public void coffeePage(View view){
        //create next activity
        Intent intent = new Intent(this, JohnnieJavaBasic.class);
        //prices for 12oz and 16oz and the title
        String price12 = "$1.40  ";
        String price16 = "$1.85  ";
        String title = "COFFEE";
        //send data to next page
        intent.putExtra(EXTRA_MESSAGE12, price12);
        intent.putExtra(EXTRA_MESSAGE16, price16);
        intent.putExtra(EXTRA_MESSAGE_TITLE, title);
        //start next activity
        startActivity(intent);
    }

    public void teaPage(View view){
        //create next activity
        Intent intent = new Intent(this, JohnnieJavaBasic.class);
        //prices for 12oz and 16oz and the title
        String price12 = "$1.40  ";
        String price16 = "$1.85  ";
        String title = "TEA";
        //send data to next page
        intent.putExtra(EXTRA_MESSAGE12, price12);
        intent.putExtra(EXTRA_MESSAGE16, price16);
        intent.putExtra(EXTRA_MESSAGE_TITLE, title);
        //start next activity
        startActivity(intent);
    }

    public void espressoDrinksPage(View view){
        //create new activity
        Intent intent = new Intent(this, JohnnieJavaDrinks.class);
        //start next activity
        startActivity(intent);
    }

    public void specialtyDrinksPage(View view){
        //create new activity
        Intent intent = new Intent(this, JohnnieJavaSpecialtyDrinks.class);
        //start next activity
        startActivity(intent);
    }

    public void smoothiesPage(View view){
        //create new activity
        Intent intent = new Intent(this, JohnnieJavaSmoothies.class);
        //start next activity
        startActivity(intent);
    }

    /*public void nonespressoDrinksPage(View view){
        //create new activity
        Intent intent = new Intent(this, .class);
        //start next activity
        startActivity(intent);
    }*/

    public void chillerzPage(View view){
        //create new activity
        Intent intent = new Intent(this, JohnnieJavaChillers.class);
        //start next activity
        startActivity(intent);
    }

    public void homePage(View view){
        //create new activity
        Intent intent = new Intent(this, MainActivity.class);
        //start next activity
        startActivity(intent);
    }
}
