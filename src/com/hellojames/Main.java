package com.hellojames;

import com.hellojames.views.RoleView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage)  {
        RoleView roleView = new RoleView();
        VBox vbox = new VBox(roleView.render());
        Scene scene = new Scene(vbox);
        stage.setScene(scene);
        stage.show();
    }

}
