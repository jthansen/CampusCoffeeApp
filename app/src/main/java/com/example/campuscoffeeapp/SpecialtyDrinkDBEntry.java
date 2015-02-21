package com.example.campuscoffeeapp;

/**
 * Created by jthansen on 2/11/15.
 */
public class SpecialtyDrinkDBEntry {
    //private variables
    String _name;
    String _size;
    String _price;

    // Empty constructor
    public SpecialtyDrinkDBEntry(){

    }
    // constructor
    public SpecialtyDrinkDBEntry(String name, String size, String price){
        this._name = name;
        this._size = size;
        this._price = price;
    }

    // getting name
    public String getName(){
        return this._name;
    }

    // setting name
    public void setName(String name){
        this._name = name;
    }

    // setting size
    public void setSize(String size) {
        this._size = size;
    }

    // getting size
    public String getSize() {
        return this._size;
    }

    // setting price
    public String setPrice(String price) {
        this._price = price;
    }
    // getting price
    public String getPrice() {
        return this._price;
    }

}
