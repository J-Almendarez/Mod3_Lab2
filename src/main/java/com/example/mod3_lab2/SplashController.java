package com.example.mod3_lab2;

import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.scene.layout.VBox;
import javafx.util.Duration;

public class SplashController {
    @FXML private VBox root;

    @FXML
    public void initialize() {
        FadeTransition fade = new FadeTransition(Duration.seconds(1.5), root);
        fade.setFromValue(0);
        fade.setToValue(1);
        fade.play();
    }
}