package ru.javarush.ivanov.island.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    @FXML
    private Button exitButton;

    @FXML
    void onPressExitButton() {
        Stage stage = (Stage) exitButton.getScene().getWindow();
        stage.close();
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void onPressStopButton(ActionEvent actionEvent) {
    }

    public void onPressEndlessButton(ActionEvent actionEvent) {
    }

    public void onPressNextTurn(ActionEvent actionEvent) {
    }
}