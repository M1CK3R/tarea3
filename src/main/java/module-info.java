module com.tarea3.tarea3 {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
            requires com.dlsc.formsfx;
                    requires org.kordamp.bootstrapfx.core;
            
    opens com.tarea3.tarea3 to javafx.fxml;
    exports com.tarea3.tarea3;
}