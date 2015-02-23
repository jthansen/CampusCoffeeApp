package com.example.campuscoffeeapp;

/**
 * Created by jthansen on 2/11/15.
 */
public class DrinkDBEntry {
    //private variables
    String _name;
    String _type;
    String _12ozPrice;
    String _16ozPrice;
    String _description;

    // Empty constructor
    public DrinkDBEntry(){
    }
    // constructor
    public DrinkDBEntry(String name, String type, String smallPrice, String largePrice, String description){
        this._name = name;
        this._type = type;
        this._12ozPrice = smallPrice;
        this. _16ozPrice = largePrice;
        this._description = description;
    }

    public void setName(String _name) {
        this._name = _name;
    }

    public void setType(String _type) {
        this._type = _type;
    }

    public void set12ozPrice(String _12zPrice) {
        this._12ozPrice = _12zPrice;
    }

    public void set16ozPrice(String _16zPrice) {
        this._16ozPrice = _16zPrice;
    }

    public void setDescription(String _description) {
        this._description = _description;
    }

    public String getName() {
        return _name;
    }

    public String getType() {
        return _type;
    }

    public String get12ozPrice() {
        return _12ozPrice;
    }

    public String get16ozPrice() {
        return _16ozPrice;
    }

    public String getDescription() {
        return _description;
    }
}
