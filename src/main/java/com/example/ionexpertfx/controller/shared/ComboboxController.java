package com.example.ionexpertfx.controller.shared;

import com.example.ionexpertfx.controller.sidebar.IconItem;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;

public class ComboboxController extends VBox {
    @FXML
    private ComboBox<String> combobox = new ComboBox<>();

    public ComboboxController() {
        // Default constructor
    }

    public ComboboxController(IconItem[] iconItems) {
        for (IconItem iconItem : iconItems) {
            combobox.getItems().add(iconItem.getTitle());
        }
    }

//    @Override
//    public void initialize(URL url, ResourceBundle resourceBundle) {
//        combobox.getItems().addAll(
//                new IconItem("/icons/flags/english.png", "English").getTitle(),
//                new IconItem("/icons/flags/french.png", "Français").getTitle(),
//                new IconItem("/icons/flags/german.png", "Deutsch").getTitle(),
//                new IconItem("/icons/flags/spanish.png", "Español").getTitle()
//        );
//    }
}
