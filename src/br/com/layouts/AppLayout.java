package br.com.layouts;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppLayout extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = null;

        root = new AnchorCustom();
        root = new CustomBorderPane();
        root = new CustomFlowPane();
        root = new CustomGridPane();
        // root = new CustomStackPane();
        root = new CustomTilePane();

        Scene scene = new Scene(root, 800, 600);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Layouts");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
