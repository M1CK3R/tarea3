package com.tarea3.application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {

    Stage datosStage;
    @Override
    public void start(Stage stage) throws IOException {
        this.datosStage = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("inicioSesionView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public void cargarNuevoIngreso() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("inicioSesionView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        Stage nuevoIngresoStage = new Stage();
        nuevoIngresoStage.setTitle("Hello!");
        nuevoIngresoStage.setScene(scene);
        nuevoIngresoStage.initOwner(datosStage);
        nuevoIngresoStage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}