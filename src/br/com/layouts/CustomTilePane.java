package br.com.layouts;

import java.util.ArrayList;
import java.util.List;

import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.layout.TilePane;

public class CustomTilePane extends TilePane {
    public CustomTilePane() {
        List<Square> squares = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            squares.add(new Square(i * 10));
        }

        setVgap(10.0);
        setHgap(10.0);
        setOrientation(Orientation.VERTICAL);
        setTileAlignment(Pos.BOTTOM_RIGHT);
        getChildren().addAll(squares);
    }
}
