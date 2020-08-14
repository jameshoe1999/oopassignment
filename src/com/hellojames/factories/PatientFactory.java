package com.hellojames.factories;

import com.hellojames.roles.Patient;
import com.hellojames.roles.Role;

public class PatientFactory implements RoleFactory {

    @Override
    public Role createRole() {
        Patient patient = new Patient();
        patient.setRoleInfo();
        return patient;
    }
}
