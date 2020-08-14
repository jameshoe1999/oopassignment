package com.hellojames.seeders;

import com.hellojames.roles.Doctor;
import com.hellojames.roles.Role;

import java.util.ArrayList;

public class DoctorSeeder implements Seeder {

    @Override
    public ArrayList<Role> seed() {
        ArrayList<Role> doctors = new ArrayList<>();
        String[] name = {"James", "Nicole", "Harry"};
        String[] specialist = {"Allergist", "Cardiologist", "Immunologist"};
        String workTime = "9am - 6pm";
        String qualification = "Doctorate";

        for (int i = 0; i < name.length; i++) {
            doctors.add(new Doctor(i+1, 101+i, name[i], specialist[i], workTime, qualification));
        }

        return doctors;
    }
}
