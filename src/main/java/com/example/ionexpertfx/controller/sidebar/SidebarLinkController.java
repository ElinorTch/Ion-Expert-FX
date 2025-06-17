package com.example.ionexpertfx.controller.sidebar;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListCell;
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

//        sidebarLink.setCellFactory(listView -> new ListCell<>() {
//            @Override
//            protected void updateItem(String item, boolean empty) {
//                super.updateItem(item, empty);
//                if (empty || item == null) {
//                    setText(null);
//                    setHover(false);
//                } else {
//                    setText(item);
//                }
//            }
//        });
    }
}
