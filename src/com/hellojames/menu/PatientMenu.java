package com.hellojames.menu;

import com.hellojames.roles.Role;
import com.hellojames.seeders.PatientSeeder;

import java.util.ArrayList;

public class PatientMenu implements Menu {
    private ArrayList<Role> patients;

    public PatientMenu() {
        patients = new PatientSeeder().seed();
    }

    public PatientMenu(ArrayList<Role> patients) {
        this.patients = patients;
    }

    @Override
    public void display() {
        System.out.print("---------- Patients Menu ----------\n");
        System.out.println("ID\tName\t\tGender\t\tAge\t\tDisease\t\t\tAdmit Status\n");
        patients.forEach(Role::showRoleInfo);
    }
}
