module com.example.javafxmedia {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;


    opens com.example.javafxmedia to javafx.fxml;
    exports com.example.javafxmedia;
}