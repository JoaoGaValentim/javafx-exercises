package br.com.layouts;

import java.util.Arrays;
import java.util.List;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

public class Box extends HBox {
    private static int i = 0; // não está preso a uma instância
    private final List<String> colors = Arrays.asList(
            "#c33c5e", "#39aac6", "#28d79a",
            "#fb750e", "#6657a8", "#f9060e");

    public Box() {
        this(100, 100);
    }

    public Box(double width, double height) {
        setAlignment(Pos.CENTER);

        setMinWidth(width);
        setMinHeight(height);

        BackgroundFill fill = new BackgroundFill(Color.web(colors.get(i++)), CornerRadii.EMPTY, Insets.EMPTY);
        setBackground(new Background(fill));

        if (i == 6) {
            i = 0;
        }
    }

    public Box withText(String text) {
        Label label = new Label(text);
        label.setStyle("-fx-font-size: 20px");
        getChildren().add(label);
        return this;
    }
}
