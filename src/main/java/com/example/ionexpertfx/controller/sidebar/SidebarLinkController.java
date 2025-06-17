package com.example.ionexpertfx.controller.sidebar;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class SidebarLinkController extends VBox implements Initializable {

    @FXML
    ListView<String> sidebarLink;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        sidebarLink.getItems().addAll("Analyse", "Nouveau", "Ouvrir");
    }
}
