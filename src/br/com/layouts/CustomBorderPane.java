package br.com.layouts;

import javafx.scene.layout.BorderPane;

public class CustomBorderPane extends BorderPane {
    public CustomBorderPane() {
        Box boxOne = new Box().withText("Top");
        setTop(boxOne);

        Box boxTwo = new Box().withText("Left");
        setLeft(boxTwo);

        Box boxThree = new Box().withText("Right");
        setRight(boxThree);

        Box boxFour = new Box().withText("Bottom");
        setBottom(boxFour);

        Box boxFive = new Box().withText("center");
        setCenter(boxFive);
    }
}
