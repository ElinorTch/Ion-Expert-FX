package com.example.ionexpertfx.controller.shared;

import com.example.ionexpertfx.controller.sidebar.IconItem;
import javafx.fxml.FXML;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import org.kordamp.ikonli.feather.Feather;
import org.kordamp.ikonli.javafx.FontIcon;
import javafx.scene.paint.Color;

public class LinkController extends VBox {

    @FXML
    ListView<IconItem> linkList = new ListView<>();

    public LinkController() {}

    public LinkController(IconItem[] iconItems) {
        for (IconItem item : iconItems) {
            linkList.getItems().add(item);
        }

        linkList.setCellFactory(listView -> new ListCell<>() {
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
