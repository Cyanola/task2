module com.example.task2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.task2 to javafx.fxml;
    exports com.example.task2;
    exports models;
    opens models to javafx.fxml;
    exports Factory;
    opens Factory to javafx.fxml;

}