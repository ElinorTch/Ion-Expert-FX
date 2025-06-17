package com.example.ionexpertfx.controller.sidebar;

import com.example.ionexpertfx.controller.shared.ComboboxController;
import com.example.ionexpertfx.controller.shared.LinkController;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class SidebarController extends VBox implements Initializable{
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        IconItem[] linkItems = {
                new IconItem("HOME", "Accueil"),
                new IconItem("FILE_TEXT", "Nouveau"),
                new IconItem("FOLDER", "Ouvrir")
        };

        IconItem[] comboboxItems = {
                new IconItem("/icons/flags/english.png", "English"),
                new IconItem("/icons/flags/french.png", "Français"),
                new IconItem("/icons/flags/german.png", "Deutsch"),
                new IconItem("/icons/flags/spanish.png", "Español")
        };


        sidebarLinkList = new LinkController(linkItems);
        sideBarCombobox = new ComboboxController(comboboxItems);
    }

    @FXML
    private LinkController sidebarLinkList;

    @FXML
    private ComboboxController sideBarCombobox;

    public SidebarController() {

    }
}
