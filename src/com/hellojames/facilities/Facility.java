package com.hellojames.facilities;

import com.hellojames.helpers.InputHelper;

public class Facility {
    private String facility;

    public Facility() {
    }

    public Facility(String facility) {
        this.facility = facility;
    }

    public String getFacility() {
        return facility;
    }

    public void setFacility(String facility) {
        this.facility = facility;
    }

    public void newFacility() {
        facility = InputHelper.askQuestion("Please enter the facility name: ", false);
    }

    public void showList() {
        System.out.printf("%s\n", facility);
    }
}
