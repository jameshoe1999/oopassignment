package com.hellojames.menu;

import com.hellojames.roles.Role;
import com.hellojames.seeders.DoctorSeeder;

import java.util.ArrayList;

public class DoctorMenu implements Menu {

    private ArrayList<Role> doctors;

    public DoctorMenu() {
        // seeding default doctor list
        doctors = new DoctorSeeder().seed();
    }

    public DoctorMenu(ArrayList<Role> doctors) {
        this.doctors = doctors;
    }

    @Override
    public void display() {
        System.out.print("---------- Doctors Menu ----------\n");
        System.out.println("ID\tName\t\tSpecialist\t\tQualification\t\tWorking Hour\tRoom No.\n");
        doctors.forEach(Role::showRoleInfo);
    }
}
