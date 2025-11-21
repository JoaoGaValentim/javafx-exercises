package br.com.layouts;

import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;

public class CustomGridPane extends GridPane {
    public CustomGridPane() {
        Box boxOne = new Box().withText("1");
        Box boxTwo = new Box().withText("2");
        Box boxThree = new Box().withText("3");
        Box boxFour = new Box().withText("4");
        Box boxFive = new Box().withText("5");
        Box boxSix = new Box().withText("6");

        setGridLinesVisible(true);

        getColumnConstraints().addAll(
                columnConstraints(), columnConstraints(), columnConstraints(),
                columnConstraints(), columnConstraints());

        getRowConstraints().addAll(
                rowConstraints(), rowConstraints(), rowConstraints(),
                rowConstraints(), rowConstraints());

        add(boxOne, 0, 0, 2, 2);
        add(boxTwo, 1, 1, 2, 2);
        add(boxThree, 4, 3, 4, 4);
        add(boxFour, 3, 1);
        add(boxFive, 0, 4, 2, 1);
        add(boxSix, 3, 3);
    }

    private ColumnConstraints columnConstraints() {
        ColumnConstraints constraints = new ColumnConstraints();
        constraints.setPercentWidth(20);
        constraints.setFillWidth(true);
        return constraints;
    }

    private RowConstraints rowConstraints() {
        RowConstraints constraints = new RowConstraints();
        constraints.setPercentHeight(20);
        constraints.setFillHeight(true);
        return constraints;
    }
}
