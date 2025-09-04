package com.example.masodfokujavafx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;

public class masodfokController {
    @FXML
    public TextField textfield_a;
    @FXML
    public TextField textfield_b;
    @FXML
    public TextField textfield_c;
    @FXML
    public Button button_solve;
    @FXML
    public ListView listwiev_sol;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onSolveButtonClick() {

        double a = Double.parseDouble(textfield_a.getText());
        double b = Double.parseDouble(textfield_b.getText());
        double c = Double.parseDouble(textfield_c.getText());

        double d = b * b - 4.0 * a * c;

        double x1 = (-b + Math.sqrt(d)) / (2.0 * a);
        double x2 = (-b - Math.sqrt(d)) / (2.0 * a);

        String line1 = "x1 = " + Math.round(x1 * 100.0) / 100.0;
        String line2 = "x2 = " + Math.round(x2 * 100.0) / 100.0;

        List<String> lines = new ArrayList<>();
        lines.add(line1);
        lines.add(line2);
        ObservableList<String> linesFX = FXCollections.observableList(lines);

        listwiev_sol.setItems(linesFX);
    }
}