package com.example.masodfokujavafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class masodfokController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}