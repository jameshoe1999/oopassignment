package com.hellojames.views;

import com.hellojames.components.MyTableView;
import com.hellojames.roles.Role;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.List;

public class RoleView {

    List<Role> roles;
    String[] columns;

    public RoleView(List<Role> roles) {
        this.roles = roles;
    }

    public RoleView(List<Role> roles, String[] columns) {
        this.roles = roles;
        this.columns = columns;
    }

    public void setColumns(String[] columns) {
        this.columns = columns;
    }

    public Scene render() {
        MyTableView myTableView = new MyTableView();
        VBox vbox = new VBox(myTableView.render(columns, roles));
        return new Scene(vbox);
    }
}
