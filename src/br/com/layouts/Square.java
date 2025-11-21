package br.com.layouts;

import java.util.Arrays;
import java.util.List;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Square extends Rectangle {
    private static int i = 0; // não está preso a uma instância
    private final List<String> colors = Arrays.asList(
            "#c33c5e", "#39aac6", "#28d79a",
            "#fb750e", "#6657a8", "#f9060e");

    public Square() {
        this(100);
    }

    public Square(double height) {

        setWidth(height);
        setHeight(height);

        setFill(Color.web(colors.get(i++)));
        if (i == 6) {
            i = 0;
        }
    }
}
