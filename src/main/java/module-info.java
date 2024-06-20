module org.example.hellofx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;
    requires java.desktop;

    opens org.example.hellofx to javafx.graphics,javafx.fxml;
    opens org.example.hellofx.controller to javafx.graphics,javafx.fxml;
    exports org.example.hellofx;
}