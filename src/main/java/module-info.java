module org.hugo.ejercicioj {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.hugo.ejercicioj to javafx.fxml;
    exports org.hugo.ejercicioj;
}