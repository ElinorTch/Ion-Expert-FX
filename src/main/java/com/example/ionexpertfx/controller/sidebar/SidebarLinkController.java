package com.example.ionexpertfx.controller.sidebar;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import org.kordamp.ikonli.feather.Feather;
import org.kordamp.ikonli.javafx.FontIcon;

import java.net.URL;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.ResourceBundle;

public class SidebarLinkController extends VBox implements Initializable {

    @FXML
    ListView<Map<String, FontIcon>> sidebarLink;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
//        sidebarLink.getItems().addAll();
//
//        sidebarLink.setCellFactory(listView -> new ListCell<>() {
//            @Override
//            protected void updateItem(String item, boolean empty) {
//                super.updateItem(item, empty);
//                if (empty || item == null) {
//                    setText(null);
//                } else {
//                    FontIcon icon = new FontIcon(Feather.CHECK);
//                    setGraphic(icon);
//                    setText(item);
//                }
//            }
//        });
    }
}
