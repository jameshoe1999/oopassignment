package com.hellojames.roles;

import com.hellojames.enums.Gender;
import com.hellojames.helpers.InputHelper;

public class Patient implements Role {
    private int id;
    private int age;
    private String name;
    private String disease;
    private Gender gender;
    private AdmitStatus admitStatus;

    public Patient() {
    }

    public Patient(int id, int age, String name, Gender gender) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.gender = gender;
        admitStatus = AdmitStatus.ADMITTED;
        disease = "Under supervision";
    }

    public Patient(int id, int age, String name, String disease, Gender gender, AdmitStatus admitStatus) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.disease = disease;
        this.gender = gender;
        this.admitStatus = admitStatus;
    }

    private enum AdmitStatus { // since only patient needs this
        ADMITTED, NOT_ADMITTED
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public AdmitStatus getAdmitStatus() {
        return admitStatus;
    }

    public void setAdmitStatus(boolean isAdmitted) {
        this.admitStatus = isAdmitted ? AdmitStatus.ADMITTED : AdmitStatus.NOT_ADMITTED;
    }

    @Override
    public void showRoleInfo() {
        System.out.printf("%d\t%s\t\t%s\t\t%d\t\t%s\t\t%s\n",
                id, name, gender, age, disease, admitStatus);
    }

    @Override
    public void showRoleProperties() {
        System.out.print("-------------------- Patients Menu --------------------\n");
        System.out.print("ID\tName\t\tGender\t\tAge\t\tDisease\t\t\tAdmit Status\n");
    }

    @Override
    public void setRoleInfo() {
        id = Integer.parseInt(InputHelper.askQuestion(
                "Please enter your ID: ",
                false));
        name = InputHelper.askQuestion(
                "Please enter your name: ",
                false);
        age = Integer.parseInt(InputHelper.askQuestion(
                "Please enter your age: ",
                false));

        String _gender = InputHelper.askQuestion(
                "Please enter your gender (F/M): ",
                false);
        gender = Character.toLowerCase(_gender.charAt(0)) == 'f' ? Gender.FEMALE : Gender.MALE;

        String _disease = InputHelper.askQuestion(
                "Provide the disease description: ",
                false);
        disease = _disease.isEmpty() ? "Under supervision" : _disease;

        String admitStatus = InputHelper.askQuestion(
                "Patient Admission Status (true/false, default: true): ",
                true);
        setAdmitStatus(admitStatus.isEmpty() || admitStatus.compareToIgnoreCase("false") != -1);
    }
}
