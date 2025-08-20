module com.example.exjava {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exjava to javafx.fxml;
    exports com.example.exjava;
}