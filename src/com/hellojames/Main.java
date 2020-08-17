package com.hellojames;

import com.hellojames.components.MyInputBuilder;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage)  {
//        RoleView roleView = new RoleView();

        Insets stdInsets = new Insets(5, 10, 5, 10);
        Button enter = new Button("Enter");
        TextField textField = new TextField();
        textField.setPadding(stdInsets);
        textField.setEditable(true);
        textField.setMinWidth(100);
        textField.setOnKeyPressed(keyEvent -> {
            if (keyEvent.getCode().equals(KeyCode.ENTER)) {
                System.out.println("Value in the text field: " + textField.getText());
            }
        });

        enter.setPadding(stdInsets);
        enter.setOnAction(actionEvent -> {
            System.out.println("Value in the text field: " + textField.getText());
        });

        Label label = new Label("Name: ");
        label.setPadding(stdInsets);

        HBox hBox = new HBox();
        hBox.setPadding(new Insets(5, 10, 5, 10));
        hBox.setSpacing(10);

        MyInputBuilder myInputBuilder = new MyInputBuilder(hBox);
        myInputBuilder.addNode(label);
        myInputBuilder.addNode(textField);
        myInputBuilder.addNode(enter);

        Scene scene = new Scene(myInputBuilder.render());
        stage.setScene(scene);
        stage.show();
    }

}
