module com.example.mod3_lab2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mod3_lab2 to javafx.fxml;
    exports com.example.mod3_lab2;
}