package br.com.exercises.counter;

import br.com.exercises.counter.models.CounterObserver;
import br.com.exercises.counter.models.Observer;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class Counter extends Application implements Observer {
    VBox labelsBox = new VBox();
    HBox buttonsBox = new HBox();
    Label labelTitle = new Label("Contador");
    Label labelCounter = new Label("Valor: 0.0");

    @Override
    public void start(Stage primaryStage) throws Exception {
        CounterObserver counter = new CounterObserver();
        counter.registerObserver(this);

        primaryStage.setTitle("Counter");
        primaryStage.setResizable(false);

        GridPane container = new GridPane();

        buttonsBox.setSpacing(10.0);

        labelTitle.setTextAlignment(TextAlignment.CENTER);
        labelCounter.setTextAlignment(TextAlignment.CENTER);

        labelsBox.getChildren().addAll(labelTitle, labelCounter);

        Button buttonIncrement = new Button("+");

        buttonIncrement.setOnAction(e -> counter.increment());

        Button buttonDecrement = new Button("-");

        buttonDecrement.setOnAction(e -> counter.decrement());

        buttonsBox.getChildren().addAll(buttonIncrement, buttonDecrement);
        buttonsBox.setAlignment(Pos.CENTER);
        buttonsBox.setStyle("");

        container.addRow(1, labelsBox);
        container.addRow(2, buttonsBox);
        container.setAlignment(Pos.CENTER);

        Scene scene = new Scene(container, 400, 300);

        String css = getClass().getResource("counter.css").toExternalForm();

        scene.getStylesheets().add(css);

        primaryStage.setScene(scene);

        container.getStyleClass().addAll("sixtyfour-hack", "container");
        labelTitle.getStyleClass().addAll("label", "counter-title");
        labelCounter.getStyleClass().addAll("label", "counter-text");
        buttonsBox.getStyleClass().add("btn-box");
        buttonIncrement.getStyleClass().add("btn");
        buttonDecrement.getStyleClass().add("btn");

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void setState(double value) {
        if (value > 0.0) {
            labelCounter.setTextFill(Paint.valueOf("#1f7"));
        }

        if (value == 0.0) {
            labelCounter.setTextFill(Paint.valueOf("#faa"));
        }

        if (value < 0.0) {
            labelCounter.setTextFill(Paint.valueOf("#f01"));
        }

        labelCounter.setText("Valor: " + value);
    }
}
