package com.hellojames.factories;

import com.hellojames.roles.Role;
import com.hellojames.roles.Staff;

public class StaffFactory implements RoleFactory{
    @Override
    public Role createRole() {
        Staff patient = new Staff();
        patient.setRoleInfo();
        return patient;
    }
}
