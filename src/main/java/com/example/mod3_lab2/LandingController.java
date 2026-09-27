package com.example.mod3_lab2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.IOException;

public class LandingController {
    @FXML private Label welcomeLabel;

    @FXML
    public void initialize() {
        welcomeLabel.setText("Welcome, " + Session.username);
    }

    @FXML
    private void handleLogout() throws IOException {
        Session.username = null;
        MainApp.switchTo(welcomeLabel, "Login.fxml");
    }
}