package com.example.campuscoffeeapp;

import java.util.List;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
/**
 * Created by Ashley on 2/22/2015.
 */
public class DrinksDatabase extends Activity {

    private JohnnieJavaMenuDBHandler db;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_johnnie__java__specialty__drinks);

        db = new JohnnieJavaMenuDBHandler(this);

        /**
         * CRUD Operations
         * */
        // Inserting Contacts
        Log.d("Insert: ", "Inserting ..");
        db.addDrink(new DrinkDBEntry("JOHNNIE AUTUMN", "Specialty Drink", "$3.25  ", "$4.00  ", "Honey and Cinnamon Latte"));
        db.addDrink(new DrinkDBEntry("THE LINK", "Specialty Drink", "$3.25  ", "$4.00  ", "White Chocolate and Chocolate Mocha"));
        db.addDrink(new DrinkDBEntry("TURTLE MOCHA", "Specialty Drink", "$3.25  ", "$4.00  ", "Chocolate and Caramel Mocha"));
        db.addDrink(new DrinkDBEntry("SEXTON SUNRISE", "Specialty Drink", "$3.25 ", "$4.00  ", "Caramel and Vanilla Latte"));
        db.addDrink(new DrinkDBEntry("CHAPEL WALK", "Specialty Drink", "$3.25  ", "$4.00  ", "Hazelnut and Caramel Latte"));
        db.addDrink(new DrinkDBEntry("ABBY ROAD", "Specialty Drink", "$3.25  ", "$4.00  ", "Chocolate and Caramel Mocha"));
        db.addDrink(new DrinkDBEntry("THE ECHO", "Specialty Drink", "$3.25  ", "$4.00  ", "White Chocolate, Vanilla, and Almond Mocha"));
        db.addDrink(new DrinkDBEntry("ANDES MINT EXTREME", "Specialty Drink", "$3.25  ", "$4.00  ", "Chocolate Mocha with Peppermint"));

        // Reading all contacts
        Log.d("Reading: ", "Reading all contacts..");
        List<DrinkDBEntry> drinks = db.getAllDrinks();

        for (DrinkDBEntry d : drinks) {
            String log = "Name: " + d.getName() + " ,12ozPrice: " + d.get12ozPrice() + " ,16ozPrice: " + d.get16ozPrice() + " ,Description: " + d.getDescription();
            // Writing Contacts to log
            Log.d("Name: ", log);
        }
    }

    public DrinkDBEntry getDrink(String s) {
        return db.getDrink(s);
    }
}
