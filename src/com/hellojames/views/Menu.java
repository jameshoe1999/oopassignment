package com.hellojames.views;

import com.hellojames.roles.Role;

import java.util.ArrayList;

public class Menu {
    private ArrayList<Role> people;

    public Menu() {
        mainMenu();
    }

    public Menu(ArrayList<Role> people) {
        this.people = people;
    }

    public void switchRole(ArrayList<Role> people) {
        this.people = people;
        display();
    }

    public void display() {
        if (people.isEmpty()) {
            mainMenu();
        } else {
            people.get(0).showRoleProperties();
            people.forEach(Role::showRoleInfo);
        }
    }

    public void mainMenu() {
        String[] menuList = { "Doctors", "Patients", "Staffs", "Medicals", "Labs", "Facilities" };
        System.out.print("---------- Hospital Management System ----------\n");
        for (int i = 0; i < menuList.length; i++) {
            System.out.printf("%d. %s\t", i+1, menuList[i]);
        }
    }
}
