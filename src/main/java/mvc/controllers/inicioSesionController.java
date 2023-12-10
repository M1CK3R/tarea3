package mvc.controllers;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import mvc.application;

public class inicioSesionController {
    @FXML
    private Label textoUsuario, textoContra;
    @FXML
    private TextField campoUsuario, campoContra;
    @FXML
    private Button botonConectar;
    application main;

    String usuario, contrasena;

    public inicioSesionController(Label textoUsuario, Label textoContra, TextField campoUsuario, TextField campoContra, Button botonConectar) {
        this.textoUsuario = textoUsuario;
        this.textoContra = textoContra;
        this.campoUsuario = campoUsuario;
        this.campoContra = campoContra;
        this.botonConectar = botonConectar;
    }

    public inicioSesionController() {
    }

    public Label getTextoUsuario() {
        return textoUsuario;
    }

    public void setTextoUsuario(Label textoUsuario) {
        this.textoUsuario = textoUsuario;
    }

    public Label getTextoContra() {
        return textoContra;
    }

    public void setTextoContra(Label textoContra) {
        this.textoContra = textoContra;
    }

    public TextField getCampoUsuario() {
        return campoUsuario;
    }

    public void setCampoUsuario(TextField campoUsuario) {
        this.campoUsuario = campoUsuario;
    }

    public TextField getCampoContra() {
        return campoContra;
    }

    public void setCampoContra(TextField campoContra) {
        this.campoContra = campoContra;
    }

    public Button getBotonConectar() {
        return botonConectar;
    }

    public void setBotonConectar(Button botonConectar) {
        this.botonConectar = botonConectar;
    }


    @FXML
    protected void ingresarUsuario(ActionEvent actionEvent) {
        usuario = campoUsuario.getText();
    }

    @FXML
    protected void ingresarContrasena(ActionEvent actionEvent) {
        contrasena = campoContra.getText();
    }

    @FXML
    protected void clicConectar(ActionEvent actionEvent) {
        usuario = campoUsuario.getText();
        contrasena = campoContra.getText();
        System.out.println(usuario + " " + contrasena);
    }

    @FXML
    public void initialize() {

    }

    public void setMain(application application) {
        this.main = application;
    }

}