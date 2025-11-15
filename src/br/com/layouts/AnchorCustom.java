package br.com.layouts;

import javafx.geometry.Pos;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

public class AnchorCustom extends AnchorPane {
    public AnchorCustom() {
        Square squareOne = new Square();
        Square squareTwo = new Square();
        Square squareThree = new Square();
        Square squareFour = new Square();
        Square squareFive = new Square();

        setRightAnchor(squareOne, 10.0);
        setTopAnchor(squareOne, 10.0);

        setLeftAnchor(squareTwo, 10.0);
        setTopAnchor(squareTwo, 10.0);

        setBottomAnchor(squareThree, 10.0);
        setLeftAnchor(squareThree, 10.0);

        setBottomAnchor(squareFour, 10.0);
        setRightAnchor(squareFour, 10.0);

        setTopAnchor(squareFive, 250.0);
        setLeftAnchor(squareFive, 350.0);

        HBox centerBox = new HBox();
        setTopAnchor(centerBox, 110.0);
        setBottomAnchor(centerBox, 110.0);
        setLeftAnchor(centerBox, 110.0);
        setRightAnchor(centerBox, 110.0);

        centerBox.getChildren().add(squareFive);
        centerBox.setAlignment(Pos.CENTER);

        getChildren().addAll(squareOne, squareTwo, squareThree, squareFour, centerBox);
    }
}
