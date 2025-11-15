module javafx.exercises {
    requires javafx.controls;
    requires javafx.graphics;

    opens br.com.exercises to javafx.graphics;
    opens br.com.exercises.counter to javafx.graphics;
    opens br.com.exercises.wizard to javafx.graphics;
    opens br.com.layouts to javafx.graphics;
}
