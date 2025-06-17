package com.example.ionexpertfx;

import atlantafx.base.theme.PrimerLight;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;

public class IonexpertFXApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        Font.loadFont(getClass().getResourceAsStream("/com/example/ionexpertfx/fonts/Poppins-Regular.ttf"), 10);
        Application.setUserAgentStylesheet(new PrimerLight().getUserAgentStylesheet());
        FXMLLoader fxmlLoader = new FXMLLoader(IonexpertFXApplication.class.getResource("components/sidebar/sidebar.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 285, 1000);
        scene.getStylesheets().add(getClass().getResource("/com/example/ionexpertfx/css/main.css").toExternalForm());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}