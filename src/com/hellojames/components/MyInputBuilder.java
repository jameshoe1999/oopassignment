package com.hellojames.components;

import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class MyInputBuilder {

    private final HBox hbox;

    public MyInputBuilder(HBox hbox) {
        this.hbox = hbox;
    }

    public void putLabel(String text) {
//        Label label = new Label(text);
//        label.setPadding(new Insets(5, 10, 5, 10));
//        hbox.getChildren().add(label);
    }

    public void putTextField() {
        TextField textField = new TextField();
        textField.setEditable(true);
        textField.setMinWidth(100);
        textField.setPadding(new Insets(5, 10, 5, 10));
        hbox.getChildren().add(textField);
    }

    public void addNode(Node node) {
        hbox.getChildren().add(node);
    }

    public HBox render() {
        return hbox;
    }
}
