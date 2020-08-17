package com.hellojames;

import com.hellojames.helpers.InputHelper;
import com.hellojames.views.Menu;
import com.hellojames.roles.Role;
import com.hellojames.seeders.DoctorSeeder;
import com.hellojames.seeders.PatientSeeder;
import com.hellojames.seeders.StaffSeeder;

import java.util.ArrayList;

public class Program {
    private Menu menu;

    public Program(Menu menu) {
        this.menu = menu;
    }

    public void switchMenu(Menu menu) {
        this.menu = menu;
        this.menu.display();
    }

    private void display() {
        this.menu.display();
    }

    public static void main(String[] args) {
        ArrayList<Role> doctors = new DoctorSeeder().seed();
        ArrayList<Role> patients = new PatientSeeder().seed();
        ArrayList<Role> staffs = new StaffSeeder().seed();
        Menu menu = new Menu();
        while (true) {
            int input = InputHelper.menuInput();fa
            switch (input) {
                case 1 -> menu.switchRole(doctors);
                case 2 -> menu.switchRole(patients);
                case 3 -> menu.switchRole(staffs);
                default -> {
                    System.out.println("Good Bye!");
                    System.exit(0);
                }
            }
        }
    }
}
