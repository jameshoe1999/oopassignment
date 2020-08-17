package com.hellojames.menu;

import com.hellojames.roles.Role;
import com.hellojames.seeders.DoctorSeeder;
import com.hellojames.seeders.StaffSeeder;

import java.util.ArrayList;

public class StaffMenu implements Menu {
    private ArrayList<Role> staffs;

    public StaffMenu() {
        // seeding default doctor list
        staffs = new StaffSeeder().seed();
    }

    public StaffMenu(ArrayList<Role> staffs) {
        this.staffs = staffs;
    }
    @Override
    public void display() {
        System.out.print("---------- Staffs Menu ----------\n");
        System.out.println("ID\tName\t\tDesignation\t\t\tGender\t\tSalary\n");
        staffs.forEach(Role::showRoleInfo);
    }
}
