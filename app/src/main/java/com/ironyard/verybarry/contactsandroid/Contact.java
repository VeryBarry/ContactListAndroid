package com.ironyard.verybarry.contactsandroid;

/**
 * Created by VeryBarry on 9/28/16.
 */

public class Contact {
    String name;
    String number;

    public Contact(String name, String number) {
        this.name = name;
        this.number = number;
    }
    @Override
    public String toString() {
        return String.format("%s (%s)", name, number);
    }
}
