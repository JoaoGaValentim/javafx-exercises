package br.com.exercises;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FirstAppFX extends Application {
    private double value = 0.0;

    @Override
    public void start(Stage stage) throws Exception {
        GridPane gridPane = new GridPane();
        gridPane.setStyle("-fx-background-color: #252424;");

        VBox vBox = new VBox();
        HBox hBox = new HBox();

        hBox.setPadding(new Insets(20.0));
        hBox.setSpacing(10);

        vBox.setStyle("""
                    -fx-border-width: 2;
                """);

        hBox.setStyle("""
                    -fx-border-width: 2;
                """);

        Label label = new Label("Valor: 0.0");

        Button buttonPlus = new Button("+");
        Button buttonDecrement = new Button("-");

        label.setStyle("""
                    -fx-font-size: 20px;
                    -fx-font-weight: bolder;
                    -fx-text-fill: #f17;
                    -fx-border-width: 2px;
                    -fx-border-style: solid;
                    -fx-border-color: #1f7;
                    -fx-padding: 20px;
                """);

        buttonPlus.setStyle("""
                    -fx-background: none;
                    -fx-background-color: #71f;
                    -fx-text-fill: #fff;
                    -fx-font-size: 20px;
                    -fx-border-width: 2px;
                    -fx-focus-color: transparent;
                    -fx-faint-focus-color: transparent;
                    -fx-background-insets: 0; /* Remove any insets that might create a border effect */
                    -fx-border-style: solid;
                    -fx-border-color: #1f7;
                     -fx-background-radius: 100%;
                    -fx-border-radius: 100%;
                """);

        buttonDecrement.setStyle("""
                    -fx-background: none;
                    -fx-background-color: #71f;
                    -fx-text-fill: #fff;
                    -fx-font-size: 20px;
                    -fx-focus-color: transparent;
                    -fx-faint-focus-color: transparent;
                    -fx-background-insets: 0; /* Remove any insets that might create a border effect */
                    -fx-border-width: 2px;
                    -fx-border-style: solid;
                    -fx-border-color: #1f7;
                    -fx-radius: 100px;
                    -fx-background-radius: 100%;
                    -fx-border-radius: 100%;
                """);

        gridPane.setAlignment(Pos.CENTER);
        gridPane.setVgap(20);

        vBox.getChildren().addAll(label);
        hBox.getChildren().addAll(buttonPlus);
        hBox.getChildren().addAll(buttonDecrement);

        gridPane.addRow(1, vBox);
        gridPane.addRow(2, hBox);

        Scene scene = new Scene(gridPane, 400, 300);

        buttonPlus.setOnAction(e -> {
            value += 1;
            label.setText("Valor: " + value);
        });

        buttonDecrement.setOnAction(e -> {
            if (value == 0) {
                return;
            }

            value -= 1;
            label.setText("Valor: " + value);
        });

        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
