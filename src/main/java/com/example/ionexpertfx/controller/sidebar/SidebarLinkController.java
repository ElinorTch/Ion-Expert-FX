package com.example.ionexpertfx.controller.sidebar;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import org.kordamp.ikonli.feather.Feather;
import org.kordamp.ikonli.javafx.FontIcon;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ResourceBundle;

public class SidebarLinkController extends VBox implements Initializable {

    @FXML
    ListView<IconItem> sidebarLink;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        sidebarLink.getItems().addAll(new IconItem("HOME", "Accueil"),
                new IconItem("FILE_TEXT", "Nouveau"),
                new IconItem("FOLDER", "Ouvrir"));

        sidebarLink.setCellFactory(listView -> new ListCell<>() {
            @Override
            protected void updateItem(IconItem items, boolean empty) {
                super.updateItem(items, empty);
                if (empty || items == null) {
                    setText(null);
                } else {
                    FontIcon icon = new FontIcon(Feather.valueOf(items.getIconPath()));
                    icon.setIconColor(Color.ORANGE);
                    icon.setIconSize(18);
                    setGraphic(icon);
                    setText(items.getTitle());
                }
            }
        });
    }
}
