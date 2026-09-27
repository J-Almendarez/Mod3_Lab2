package com.example.mod3_lab2;

import javafx.animation.PauseTransition;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        Parent splash = FXMLLoader.load(MainApp.class.getResource("Splash.fxml"));
        stage.setTitle("Mod3 Lab2");
        stage.setScene(new Scene(splash, 1000, 700));
        stage.setResizable(true);
        stage.setMinWidth(800);
        stage.setMinHeight(600);
        stage.show();


        PauseTransition delay = new PauseTransition(Duration.seconds(3));
        delay.setOnFinished(e -> {
            try {
                stage.getScene().setRoot(FXMLLoader.load(MainApp.class.getResource("Login.fxml")));
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });
        delay.play();
    }


    public static void switchTo(Node anyNodeOnScreen, String fxml) throws IOException {
        Parent root = FXMLLoader.load(MainApp.class.getResource(fxml));
        anyNodeOnScreen.getScene().setRoot(root);
    }
}