package com.hellojames.views;

import com.hellojames.components.MyTableView;
import com.hellojames.roles.Role;
import com.hellojames.seeders.DoctorSeeder;
import com.hellojames.seeders.PatientSeeder;
import com.hellojames.seeders.Seeder;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableView;

import java.util.List;

public class RoleView {

    public TabPane render() {
        TabPane tabPane = new TabPane();
        Tab doctors = new Tab("Doctors", new Label("All doctors"));
        Tab patients = new Tab("Patients", new Label("All patient"));
        doctors.setClosable(false);
        doctors.setContent(renderTableView(new DoctorSeeder(), new String[] {
                "id", "name", "specialist", "workTime", "qualification", "room"
        }));
        patients.setClosable(false);
        patients.setContent(renderTableView(new PatientSeeder(), new String[] {
                "id", "name", "gender", "age", "disease", "admitStatus"
        }));

        tabPane.getTabs().addAll(doctors, patients);
        return tabPane;
    }

    public TableView renderTableView(Seeder seeder, String[] columns) {
        List<Role> roles = seeder.seed();
        MyTableView myTableView = new MyTableView();
        return myTableView.render(columns, roles);
    }
}
