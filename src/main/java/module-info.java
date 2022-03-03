module com.example.mytetris {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mytetris to javafx.fxml;
    exports com.example.mytetris;
}