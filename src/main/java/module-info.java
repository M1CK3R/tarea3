module com.tarea3.tarea3 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens mvc to javafx.fxml;
    exports mvc;
    exports mvc.controllers;
    opens mvc.controllers to javafx.fxml;
}