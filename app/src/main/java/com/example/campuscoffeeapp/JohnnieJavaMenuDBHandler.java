package com.example.campuscoffeeapp;

import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class JohnnieJavaMenuDBHandler extends SQLiteOpenHelper {

    // All Static variables
    // Database Version
    private static final int DATABASE_VERSION = 1;

    // Database Name
    private static final String DATABASE_NAME = "Johnnie Java";

    // Contacts table name
    private static final String TABLE_SPECIALTY_DRINKS = "Menu";

    // Contacts Table Columns names
    private static final String KEY_DRINK_NAME = "Drink Name";
    private static final String KEY_DRINK_TYPE = "Drink Type";
    private static final String KEY_DRINK_12oz_PRICE = "12oz Price";
    private static final String KEY_DRINK_16oz_PRICE = "16oz Price";
    private static final String KEY_DRINK_DESCRIPTION = "Drink Description";


    public JohnnieJavaMenuDBHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    // Creating Tables
    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_SPECIALTY_DRINKS_TABLE = "CREATE TABLE" + TABLE_SPECIALTY_DRINKS + "("
                + KEY_DRINK_NAME + " TEXT, " + KEY_DRINK_TYPE + " TEXT, " +KEY_DRINK_12oz_PRICE + " FLOAT, " + KEY_DRINK_16oz_PRICE + " FLOAT, "
                + KEY_DRINK_DESCRIPTION + " TEXT)";
        db.execSQL(CREATE_SPECIALTY_DRINKS_TABLE);
    }

    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_SPECIALTY_DRINKS);

        // Create tables again
        onCreate(db);
    }

    /**
     * All CRUD(Create, Read, Update, Delete) Operations
     */

    // Adding new drink
    void addDrink(DrinkDBEntry drink) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_DRINK_NAME, drink.getName()); // Drink Name
        values.put(KEY_DRINK_TYPE, drink.getType()); //Drink Type
        values.put(KEY_DRINK_12oz_PRICE, drink.get12ozPrice()); // Drink 12oz Price
        values.put(KEY_DRINK_16oz_PRICE, drink.get16ozPrice()); // Drink 16oz Price
        values.put(KEY_DRINK_DESCRIPTION, drink.getDescription()); //Drink Type

        // Inserting Row
        db.insert(TABLE_SPECIALTY_DRINKS, null, values);
        db.close(); // Closing database connection
    }

    // Getting single specialty drink
    DrinkDBEntry getDrink(String name) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(TABLE_SPECIALTY_DRINKS, new String[]{KEY_DRINK_NAME,
                        KEY_DRINK_TYPE, KEY_DRINK_12oz_PRICE, KEY_DRINK_16oz_PRICE, KEY_DRINK_DESCRIPTION, }, KEY_DRINK_NAME + "=?",
                new String[]{String.valueOf(name)}, null, null, null, null);
        if (cursor != null)
            cursor.moveToFirst();

        DrinkDBEntry drinkEntry = new DrinkDBEntry((cursor.getString(0)),cursor.getString(1),
                cursor.getString(2), cursor.getString(3), cursor.getString(2));
        // return drink
        return drinkEntry;
    }

    // Getting All Drinks
    public List<DrinkDBEntry> getAllDrinks() {
        List<DrinkDBEntry> drinkList = new ArrayList<DrinkDBEntry>();
        // Select All Query
        String selectQuery = "SELECT  * FROM " + TABLE_SPECIALTY_DRINKS;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                DrinkDBEntry drink = new DrinkDBEntry();
                drink.setName(cursor.getString(0));
                drink.setType(cursor.getString(1));
                drink.set12ozPrice(cursor.getString(2));
                drink.set16ozPrice(cursor.getString(3));
                drink.setDescription(cursor.getString(4));
                // Adding drink to list
                drinkList.add(drink);
            } while (cursor.moveToNext());
        }
//new push
        // return contact list
        return drinkList;
    }

    // Updating single Drink
    public int updateDrink(DrinkDBEntry drink) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_DRINK_NAME, drink.getName());
        values.put(KEY_DRINK_TYPE, drink.getType());
        values.put(KEY_DRINK_12oz_PRICE, drink.get12ozPrice());
        values.put(KEY_DRINK_16oz_PRICE, drink.get16ozPrice());
        values.put(KEY_DRINK_DESCRIPTION, drink.getDescription());

        // updating row
        return db.update(TABLE_SPECIALTY_DRINKS, values,KEY_DRINK_NAME + " = ?",
                new String[]{String.valueOf(drink.getName())});
    }

    // Deleting single drink
    public void deleteDrink(DrinkDBEntry drink) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_SPECIALTY_DRINKS, KEY_DRINK_NAME + " = ?",
                new String[]{String.valueOf(drink.getName())});
        db.close();
    }

    // Getting contacts drink
    public int getDrinksCount() {
        String countQuery = "SELECT  * FROM " + TABLE_SPECIALTY_DRINKS;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        cursor.close();

        // return count
        return cursor.getCount();
    }

}