package org.hugo.ejercicioj;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/**
 * Controlador de la interfaz gráfica que permite cambiar el color de un coche y activar o desactivar la luz.
 */
public class CocheController implements Initializable {

    @FXML
    private ImageView imgAzulClaro;

    @FXML
    private ImageView imgAzulOscuro;

    @FXML
    private ImageView imgBlanco;

    @FXML
    private ImageView imgCoche;

    @FXML
    private ImageView imgGris;

    @FXML
    private ImageView imgGrisOscuro;

    @FXML
    private ImageView imgLuz;

    @FXML
    private ImageView imgMarron;

    @FXML
    private ImageView imgNegro;

    @FXML
    private ImageView imgRojo;

    @FXML
    private ImageView logoLuz;

    /**
     * Indicador del estado de la luz (encendida o apagada).
     */
    private boolean bEncendido;

    /**
     * Cambia el estado de la luz al hacer clic en el icono.
     *
     * @param event Evento de clic en el ratón.
     */
    @FXML
    void mod_luz(MouseEvent event) {
        if (!bEncendido) {
            bEncendido = true;
            logoLuz.setImage(new Image(getClass().getResourceAsStream("/Imagenes/lucesOn.png")));
        } else {
            bEncendido = false;
            logoLuz.setImage(new Image(getClass().getResourceAsStream("/Imagenes/lucesOff.png")));
        }
        imgLuz.setVisible(bEncendido);
    }

    /**
     * Cambia el color del coche a azul claro.
     *
     * @param event Evento de clic en el ratón.
     */
    @FXML
    void cambioColorAzulC(MouseEvent event) {
        imgCoche.setImage(new Image(getClass().getResourceAsStream("/Imagenes/miniElectricBlue.png")));
    }

    /**
     * Cambia el color del coche a azul oscuro.
     *
     * @param event Evento de clic en el ratón.
     */
    @FXML
    void cambioColorAzulO(MouseEvent event) {
        imgCoche.setImage(new Image(getClass().getResourceAsStream("/Imagenes/miniLapisluxuryBlue.png")));
    }

    /**
     * Cambia el color del coche a blanco.
     *
     * @param event Evento de clic en el ratón.
     */
    @FXML
    void cambioColorBlanco(MouseEvent event) {
        imgCoche.setImage(new Image(getClass().getResourceAsStream("/Imagenes/miniPepperWhite.png")));
    }

    /**
     * Cambia el color del coche a gris.
     *
     * @param event Evento de clic en el ratón.
     */
    @FXML
    void cambioColorGris(MouseEvent event) {
        imgCoche.setImage(new Image(getClass().getResourceAsStream("/Imagenes/miniMoonwalkGrey.png")));
    }

    /**
     * Cambia el color del coche a gris oscuro.
     *
     * @param event Evento de clic en el ratón.
     */
    @FXML
    void cambioColorGrisO(MouseEvent event) {
        imgCoche.setImage(new Image(getClass().getResourceAsStream("/Imagenes/miniThunderGray.png")));
    }

    /**
     * Cambia el color del coche a marrón.
     *
     * @param event Evento de clic en el ratón.
     */
    @FXML
    void cambioColorMarron(MouseEvent event) {
        imgCoche.setImage(new Image(getClass().getResourceAsStream("/Imagenes/miniVolcaninOrange.png")));
    }

    /**
     * Cambia el color del coche a negro.
     *
     * @param event Evento de clic en el ratón.
     */
    @FXML
    void cambioColorNegro(MouseEvent event) {
        imgCoche.setImage(new Image(getClass().getResourceAsStream("/Imagenes/miniMidnightBlack.png")));
    }

    /**
     * Cambia el color del coche a rojo.
     *
     * @param event Evento de clic en el ratón.
     */
    @FXML
    void cambioColorRojo(MouseEvent event) {
        imgCoche.setImage(new Image(getClass().getResourceAsStream("/Imagenes/miniBlazingRed.png")));
    }

    /**
     * Inicializa el controlador, estableciendo el color inicial del coche en rojo y la luz apagada.
     *
     * @param url URL de ubicación utilizada para resolver rutas relativas para el objeto raíz, o null si no se conoce.
     * @param resourceBundle Recurso de localización utilizado para localizar el objeto raíz, o null si no se especifica.
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        imgCoche.setImage(new Image(getClass().getResourceAsStream("/Imagenes/miniBlazingRed.png")));
        logoLuz.setImage(new Image(getClass().getResourceAsStream("/Imagenes/lucesOff.png")));
    }
}
