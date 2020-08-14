package com.hellojames.components;

import com.hellojames.roles.Role;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;
import java.util.List;

public class MyTableView {
    public TableView<Role> render(String[] columns, List<Role> roles) {
        TableView<Role> tableView = new TableView<>();
        List<TableColumn<Role, String>> tableColumnList = new ArrayList<>();
        for (String column: columns) {
            TableColumn<Role, String> tableColumn = new TableColumn<>(column.toUpperCase());
            tableColumn.setCellValueFactory(new PropertyValueFactory<>(column));
            tableColumnList.add(tableColumn);
        }
        tableView.getColumns().setAll(tableColumnList);
        tableView.getItems().addAll(roles);
        return tableView;
    }
}
