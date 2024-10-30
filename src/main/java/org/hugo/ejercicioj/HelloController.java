package org.hugo.ejercicioj;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class HelloController implements Initializable {

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

    private boolean bEncendido;

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

    @FXML
    void cambioColorAzulC(MouseEvent event) {
        imgCoche.setImage(new Image(getClass().getResourceAsStream("/Imagenes/miniElectricBlue.png")));
    }

    @FXML
    void cambioColorAzulO(MouseEvent event) {
        imgCoche.setImage(new Image(getClass().getResourceAsStream("/Imagenes/miniLapisluxuryBlue.png")));
    }

    @FXML
    void cambioColorBlanco(MouseEvent event) {
        imgCoche.setImage(new Image(getClass().getResourceAsStream("/Imagenes/miniPepperWhite.png")));
    }
    @FXML
    void cambioColorGris(MouseEvent event) {
        imgCoche.setImage(new Image(getClass().getResourceAsStream("/Imagenes/miniMoonwalkGrey.png")));
    }

    @FXML
    void cambioColorGrisO(MouseEvent event) {
        imgCoche.setImage(new Image(getClass().getResourceAsStream("/Imagenes/miniThunderGray.png")));
    }
    @FXML
    void cambioColorMarron(MouseEvent event) {
        imgCoche.setImage(new Image(getClass().getResourceAsStream("/Imagenes/miniVolcaninOrange.png")));
    }
    @FXML
    void cambioColorNegro(MouseEvent event) {
        imgCoche.setImage(new Image(getClass().getResourceAsStream("/Imagenes/miniMidnightBlack.png")));
    }
    @FXML
    void cambioColorRojo(MouseEvent event) {
        imgCoche.setImage(new Image(getClass().getResourceAsStream("/Imagenes/miniBlazingRed.png")));
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        imgCoche.setImage(new Image(getClass().getResourceAsStream("/Imagenes/miniBlazingRed.png")));
        logoLuz.setImage(new Image(getClass().getResourceAsStream("/Imagenes/lucesOff.png")));
    }
}