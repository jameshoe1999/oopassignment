package com.hellojames.factories;

import com.hellojames.roles.Doctor;
import com.hellojames.roles.Role;

public class DoctorFactory implements RoleFactory {

    @Override
    public Role createRole() {
        Doctor doc = new Doctor();
        doc.setRoleInfo();
        return doc;
    }
}
