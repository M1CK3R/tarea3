package mvc;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import mvc.controllers.inicioSesionController;
import javafx.application.Application;
import mvc.controllers.sesionActivaController;

import java.io.IOException;

public class application extends Application {

    Stage datosStage;
    inicioSesionController inicioSesion;
    sesionActivaController sesionActiva;
    @Override
    public void start(Stage stage) throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("inicioSesionView.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 500);
            inicioSesion = fxmlLoader.getController();
            inicioSesion.setMain(this);
            datosStage = new Stage();
            datosStage.setTitle("Hello!");
            datosStage.setScene(scene);
            datosStage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}