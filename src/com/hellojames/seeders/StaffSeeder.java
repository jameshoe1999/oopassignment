package com.hellojames.seeders;

import com.hellojames.enums.Gender;
import com.hellojames.roles.Role;
import com.hellojames.roles.Staff;

import java.util.ArrayList;

public class StaffSeeder implements Seeder {
    @Override
    public ArrayList<Role> seed() {
        ArrayList<Role> staffs = new ArrayList<>();
        String[] names = {"James", "Nicole", "Harry"};
        String[] designations = {"Executive", "Nurse", "Pharmacist"};
        int[] ages = { 19, 25, 31 };
        double[] salaries = { 3600.0, 3500.0, 5600.0 };
        Gender[] genders = { Gender.MALE, Gender.FEMALE, Gender.MALE};

        for (int i = 0; i < names.length; i++) {
            staffs.add(new Staff(i+1, names[i], designations[i], genders[i], salaries[i]));
        }

        return staffs;
    }
}
