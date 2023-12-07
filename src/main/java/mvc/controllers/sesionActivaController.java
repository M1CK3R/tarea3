package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class sesionActivaController {
    @FXML
    private Label textoBienvenida;

    private void cambiarTexto(String nombre){
        textoBienvenida.setText("Bienvenido/a "+nombre);
    }
}
