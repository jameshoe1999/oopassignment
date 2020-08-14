package com.hellojames;

import com.hellojames.components.MyTableView;
import com.hellojames.roles.Role;
import com.hellojames.seeders.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.List;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage)  {
        TabPane tabPane = renderTabPane();
        VBox vbox = new VBox(tabPane);
        Scene scene = new Scene(vbox);
        stage.setScene(scene);
        stage.show();
    }

    public TabPane renderTabPane() {
        TabPane tabPane = new TabPane();
        Tab doctors = new Tab("Doctors", new Label("All doctors"));
        Tab patients = new Tab("Patients", new Label("All patient"));

        doctors.setContent(renderTableView(new DoctorSeeder(), new String[] {
                "id", "name", "specialist", "workTime", "qualification", "room"
        }));
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
