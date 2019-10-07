package model.activities;

import java.util.HashSet;

public class Revitalize implements Activities {
    String name;
    String status;
    HashSet<Activities> selectiondata;
    HashSet<Activities> homepagedata;


    public Revitalize() {
        this.name = "Revitalize";
        this.status = "today";
        System.out.println("Boost your energy with some fruits and snacks!");

    }

    // getters
    public String getActivityName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public HashSet<Activities> getSelectionData() {
        return selectiondata;
    }

    public  HashSet<Activities> getHomepageData() {
        return homepagedata;
    }

    @Override
    public void addActivity() {

    }

    @Override
    public void checkIn() {

    }

    // REQUIRES: method has not been called yet today
    // MODIFIES: this
    // EFFECTS: creates new "revitalize" activity, adds to list,
    // calls check-in and prints out statement
}
