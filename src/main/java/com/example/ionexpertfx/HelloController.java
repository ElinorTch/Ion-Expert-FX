package com.example.ionexpertfx;

import atlantafx.base.theme.Styles;
import com.example.ionexpertfx.controller.ButtonController;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML private ButtonController btn1 = new ButtonController( );

    @FXML
    private Label welcomeText;

    @FXML
    protected void initialize() {
        btn1.setText("Accueil");
        btn1.getStyleClass().addAll(Styles.BUTTON_OUTLINED, Styles.ACCENT);
        btn1.setMnemonicParsing(true);
    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}