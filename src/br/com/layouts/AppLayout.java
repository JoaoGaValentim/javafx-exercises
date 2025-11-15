package br.com.layouts;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AppLayout extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox box = new VBox();

        Scene scene = new Scene(box, 800, 600);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Layouts");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
