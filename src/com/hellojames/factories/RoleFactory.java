package com.hellojames.factories;

import com.hellojames.roles.Role;

/**
 * Factory method
 * To hide the implementation of creating
 * new role
 * Since this is a single abstract method,
 * lambda expression can be applied
 */
public interface RoleFactory {
    Role createRole();
}
