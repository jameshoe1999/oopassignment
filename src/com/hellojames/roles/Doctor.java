package com.hellojames.roles;

import com.hellojames.helpers.InputHelper;

public class Doctor implements Role {
    private int id;
    private int room;
    private String name;
    private String specialist;
    private String workTime;
    private String qualification;

    public Doctor() {
    }

    public Doctor(int id, int room, String name, String specialist, String workTime, String qualification) {
        this.id = id;
        this.room = room;
        this.name = name;
        this.specialist = specialist;
        this.workTime = workTime;
        this.qualification = qualification;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialist() {
        return specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }

    public String getWorkTime() {
        return workTime;
    }

    public void setWorkTime(String workTime) {
        this.workTime = workTime;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    @Override
    public void showRoleInfo() {
        System.out.printf("ID\t\t\t\t: %d\n" + "Name\t\t\t: %s\n" + "Specialist\t\t: %s\n" +
                "Working Hour\t: %s\n" + "Qualification\t: %s\n" + "Room No.\t\t: %d\n",
                id, name, specialist, workTime, qualification, room);
    }

    @Override
    public void setRoleInfo() {
        id = Integer.parseInt(InputHelper.askQuestion(
                "Please enter your ID: ",
                false));
        name = InputHelper.askQuestion(
                "Please enter your name: ",
                false);
        specialist = InputHelper.askQuestion(
                "Please enter your specialist: ",
                false);
        // provide default working time
        String _workTime = InputHelper.askQuestion(
                "Please enter your working hour (default: 9AM - 6PM): ",
                true);
        workTime = _workTime.isBlank() ? "9AM - 6PM" : _workTime;

        qualification = InputHelper.askQuestion(
                "Please enter your qualification: ",
                false);
        room = Integer.parseInt(InputHelper.askQuestion(
                "Please enter your room No.: ",
                false));
    }
}
