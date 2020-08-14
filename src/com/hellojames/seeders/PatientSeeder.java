package com.hellojames.seeders;

import com.hellojames.enums.Gender;
import com.hellojames.roles.Patient;
import com.hellojames.roles.Role;

import java.util.ArrayList;

public class PatientSeeder implements Seeder {
    @Override
    public ArrayList<Role> seed() {
        ArrayList<Role> patients = new ArrayList<>();
        String[] name = {"James", "Nicole", "Harry"};
        Gender gender = Gender.MALE;
        int age = 20;

        for (int i = 0; i < name.length; i++) {
            patients.add(new Patient(i+1, age, name[i], gender));
        }

        return patients;
    }
}
