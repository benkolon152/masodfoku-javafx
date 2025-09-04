module com.example.masodfokujavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.masodfokujavafx to javafx.fxml;
    exports com.example.masodfokujavafx;
}