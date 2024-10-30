package org.hugo.ejercicioj;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Clase principal de la aplicación JavaFX que carga y muestra la interfaz gráfica.
 */
public class HelloApplication extends Application {

    /**
     * Método de inicio de la aplicación JavaFX.
     * Carga el archivo FXML y configura la escena principal de la aplicación.
     *
     * @param stage El escenario principal en el que se mostrará la interfaz.
     * @throws IOException si ocurre un error al cargar el archivo FXML.
     */
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("EjercicioJ.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1000, 800);
        stage.setTitle("MiniCooper");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Método principal de la aplicación. Inicia la aplicación JavaFX.
     *
     * @param args Argumentos de la línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        launch();
    }
}

