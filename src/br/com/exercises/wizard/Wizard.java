package br.com.exercises.wizard;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Wizard extends Application {
    private Stage window;
    private Scene stepOne;
    private Scene stepTwo;
    private Scene stepThree;

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        primaryStage.setTitle("Wizard");
        window.setScene(createSceneOne());
        primaryStage.show();
    }

    private Scene createSceneOne() {
        window.setTitle("wizard :: passo 1");
        Button nextStep = new Button("Próximo passo");
        HBox horizontalBox = new HBox();

        horizontalBox.getChildren().add(nextStep);
        horizontalBox.setAlignment(Pos.CENTER);

        stepOne = new Scene(horizontalBox, 400, 400);

        nextStep.setOnAction(e -> window.setScene(createSceneTwo()));

        return stepOne;
    }

    private Scene createSceneTwo() {
        window.setTitle("wizard :: passo 2");
        Button nextStep = new Button("Próximo passo");
        Button backStep = new Button("Voltar");
        HBox horizontalBox = new HBox();

        horizontalBox.getChildren().add(backStep);
        horizontalBox.getChildren().add(nextStep);
        horizontalBox.setAlignment(Pos.CENTER);

        stepTwo = new Scene(horizontalBox, 400, 400);

        nextStep.setOnAction(e -> window.setScene(createSceneThree()));
        backStep.setOnAction(e -> window.setScene(createSceneOne()));

        return stepTwo;
    }

    private Scene createSceneThree() {
        window.setTitle("wizard :: passo 3");
        Button backStep = new Button("Voltar");
        HBox horizontalBox = new HBox();

        horizontalBox.getChildren().add(backStep);
        horizontalBox.setAlignment(Pos.CENTER);

        stepThree = new Scene(horizontalBox, 400, 400);

        backStep.setOnAction(e -> window.setScene(createSceneTwo()));

        return stepThree;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
