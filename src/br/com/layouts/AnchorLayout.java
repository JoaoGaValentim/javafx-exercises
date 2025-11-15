package br.com.layouts;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AnchorLayout extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Scene scene = new Scene(new AnchorCustom(), 800, 600);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Layouts");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
