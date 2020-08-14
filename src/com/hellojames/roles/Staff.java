package com.hellojames.roles;

import com.hellojames.enums.Gender;
import com.hellojames.helpers.InputHelper;

public class Staff implements Role {
    private int id;
    private String name;
    private String designation;
    private Gender gender;
    private double salary;

    public Staff() {
    }

    public Staff(int id, String name, String designation, Gender gender, double salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.gender = gender;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void showRoleInfo() {
        System.out.printf("ID\t\t: %d\n" + "Name\t: %s\n" + "Gender\t: %s\n" +
                        "Designation\t\t: %s\n" + "Salary\t: %.2f\n",
                id, name, gender, designation, salary);
    }

    @Override
    public void setRoleInfo() {
        id = Integer.parseInt(InputHelper.askQuestion(
                "Please enter your ID: ",
                false));
        name = InputHelper.askQuestion(
                "Please enter your name: ",
                false);
        String _gender = InputHelper.askQuestion(
                "Please enter your gender (F/M): ",
                false);
        gender = Character.toLowerCase(_gender.charAt(0)) == 'f' ? Gender.FEMALE : Gender.MALE;
        String _designation = InputHelper.askQuestion(
                "Please enter your designation (default: Staff): ",
                true);
        designation = _designation.isEmpty() ? "Staff" : _designation;
        String _salary = InputHelper.askQuestion(
                "Please enter your salary (default: 0.00): ",
                true);
        salary = _salary.isEmpty() ? 0.00 : Double.parseDouble(_salary);
    }
}
