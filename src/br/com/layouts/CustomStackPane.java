package br.com.layouts;

import javafx.application.Platform;
import javafx.scene.layout.StackPane;

public class CustomStackPane extends StackPane {
    public CustomStackPane() {
        Box boxOne = new Box().withText("1");
        Box boxTwo = new Box().withText("2");
        Box boxThree = new Box().withText("3");
        Box boxFour = new Box().withText("4");
        Box boxFive = new Box().withText("5");
        Box boxSix = new Box().withText("6");

        getChildren().addAll(boxTwo, boxThree, boxFour, boxFive, boxSix, boxOne);

        setOnMouseClicked(e -> {
            if (e.getSceneX() > getScene().getWidth() / 2) {
                getChildren().get(0).toFront();
            }

            if (e.getSceneX() < getScene().getWidth() / 2) {
                getChildren().get(5).toBack();
            }
        });

        Thread slideThread = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(3000);
                    // thread no javafx Platform::runLater
                    Platform.runLater(() -> getChildren().get(0).toFront());
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        });

        slideThread.setDaemon(true);
        slideThread.start();
    }
}
