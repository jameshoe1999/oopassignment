package com.hellojames.facilities;

import com.hellojames.helpers.InputHelper;

public class Lab {
    private String lab;
    private double cost;

    public Lab() {
    }

    public Lab(String lab, int facilityCost) {
        this.lab = lab;
        this.cost = facilityCost;
    }

    public String getLab() {
        return lab;
    }

    public void setLab(String lab) {
        this.lab = lab;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void newLab() {
        lab = InputHelper.askQuestion(
                "Please enter the lab name: ",
                false);
        cost = Double.parseDouble(InputHelper.askQuestion(
                "Please enter the lab cost: ",
                false));
    }

    public void showList() {
        System.out.printf("%s\t%.2f\n", lab, cost);
    }
}
