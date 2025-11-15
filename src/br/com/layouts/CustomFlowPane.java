package br.com.layouts;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.layout.FlowPane;

public class CustomFlowPane extends FlowPane {
    public CustomFlowPane() {
        Square squareOne = new Square();
        Square squareTwo = new Square();
        Square squareThree = new Square();
        Square squareFour = new Square();
        Square squareFive = new Square();

        setHgap(10.0);
        setVgap(10.0);
        setPadding(new Insets(20.0));
        setOrientation(Orientation.VERTICAL);
        setAlignment(Pos.CENTER_RIGHT);

        getChildren().addAll(squareOne, squareTwo, squareThree, squareFour, squareFive);
    }
}
