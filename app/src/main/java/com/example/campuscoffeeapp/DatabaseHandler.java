package com.example.campuscoffeeapp;

import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHandler extends SQLiteOpenHelper {

    // All Static variables
    // Database Version
    private static final int DATABASE_VERSION = 1;

    // Database Name
    private static final String DATABASE_NAME = "Johnnie Java";

    // Contacts table name
    private static final String TABLE_SPECIALTY_DRINKS = "Specialty Drinks";

    // Contacts Table Columns names
    private static final String KEY_DRINK_NAME = "Drink Name";
    private static final String KEY_DRINK_SIZE = "Drink Size";
    private static final String KEY_Drink_DESCRIPTION = "Drink Description";
    private static final String KEY_DRINK_PRICE = "Drink Price";

    public DatabaseHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    // Creating Tables
    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_SPECIALTY_DRINKS_TABLE = "Create Table" + TABLE_SPECIALTY_DRINKS + "(Drink Name"
                + KEY_DRINK_NAME + " Drink Size," + KEY_DRINK_SIZE + " Drink Description,"
                + KEY_Drink_DESCRIPTION + " Drink Price" + KEY_DRINK_PRICE + ")";
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

    // Adding new specialty drink
    void addSpecialtyDrink(SpecialtyDrinkDBEntry specialtyDrink) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_DRINK_NAME, specialtyDrink.getName()); // Drink Name
        values.put(KEY_DRINK_SIZE, specialtyDrink.getSize()); // Drink Size

        // Inserting Row
        db.insert(TABLE_SPECIALTY_DRINKS, null, values);
        db.close(); // Closing database connection
    }

    // Getting single specialty drink
    SpecialtyDrinkDBEntry getSpecialtyDrink(String name) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(TABLE_SPECIALTY_DRINKS, new String[]{KEY_DRINK_NAME,
                        KEY_DRINK_SIZE, KEY_Drink_DESCRIPTION, KEY_DRINK_PRICE}, KEY_DRINK_NAME + "=?",
                new String[]{String.valueOf(name)}, null, null, null, null);
        if (cursor != null)
            cursor.moveToFirst();

        SpecialtyDrinkDBEntry specialtyDrinkEntry = new SpecialtyDrinkDBEntry((cursor.getString(0)),
                cursor.getString(1), cursor.getString(2));
        // return specialty drink
        return specialtyDrinkEntry;
    }

    // Getting All Specialty Drinks
    public List<SpecialtyDrinkDBEntry> getAllContacts() {
        List<SpecialtyDrinkDBEntry> specialtyDrinkList = new ArrayList<SpecialtyDrinkDBEntry>();
        // Select All Query
        String selectQuery = "SELECT  * FROM " + TABLE_SPECIALTY_DRINKS;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                SpecialtyDrinkDBEntry drink = new SpecialtyDrinkDBEntry();
                drink.setName(cursor.getString(0));
                drink.setSize(cursor.getString(1));
                drink.setPrice(cursor.getString(2));
                // Adding drink to list
                specialtyDrinkList.add(drink);
            } while (cursor.moveToNext());
        }
//new push
        // return contact list
        return specialtyDrinkList;
    }

    // Updating single Specialty Drink
    public int updateContact(SpecialtyDrinkDBEntry specialtyDrink) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_DRINK_NAME, specialtyDrink.getName());
        values.put(KEY_DRINK_SIZE, specialtyDrink.getSize());
        values.put(KEY_DRINK_PRICE, specialtyDrink.getPrice());


        // updating row
        return db.update(TABLE_SPECIALTY_DRINKS, values, KEY_ID + " = ?",
                new String[]{String.valueOf(specialtyDrink.getID())});
    }

    // Deleting single contact
    public void deleteContact(Contact contact) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_CONTACTS, KEY_ID + " = ?",
                new String[]{String.valueOf(contact.getID())});
        db.close();
    }


    // Getting contacts Count
    public int getContactsCount() {
        String countQuery = "SELECT  * FROM " + TABLE_CONTACTS;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        cursor.close();

        // return count
        return cursor.getCount();
    }

}