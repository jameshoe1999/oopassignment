package com.hellojames.facilities;

import com.hellojames.helpers.InputHelper;

public class Medical {
    private String name;
    private String manufacturer;
    private String expiryDate;
    private double cost;
    private int count;

    public Medical(String name, String manufacturer, String expiryDate, int cost, int count) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.expiryDate = expiryDate;
        this.cost = cost;
        this.count = count;
    }

    public Medical(String name, String manufacturer, String expiryDate) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.expiryDate = expiryDate;
    }

    public Medical() { }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void newMedical() {
        name = InputHelper.askQuestion(
                "Please enter the name: ",
                false);
        manufacturer = InputHelper.askQuestion(
                "Please enter the manufacturer name: ",
                false);
        expiryDate = InputHelper.askQuestion(
                "Please enter the expiry date (DD/MM/YYYY): ",
                false);
        cost = Double.parseDouble(InputHelper.askQuestion(
                "Please enter the lab cost: ",
                false));
    }

    public void showMedical() {
        System.out.printf("%s\t %s\t %s\t %.2f\n", name, manufacturer, expiryDate, cost);
    }
}
