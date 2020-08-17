package com.hellojames.menu;

import com.hellojames.helpers.InputHelper;

public class MainMenu implements Menu {
    private Menu menu;

    public void display() {
        String[] menuList = { "Doctors", "Patients", "Staffs", "Medicals", "Labs", "Facilities" };
        System.out.print("---------- Hospital Management System ----------\n");
        for (int i = 0; i < menuList.length; i++) {
            System.out.printf("%d. %s\t", i+1, menuList[i]);
        }
        System.out.println();
        int input = InputHelper.menuInput();
        switch (input) {
            case 0:
                System.out.println("Good bye!");
                System.exit(0);
                break;
            case 1:
                break;
            default:
        }
    }

}
