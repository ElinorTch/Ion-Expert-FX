package com.example.ionexpertfx.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class SidebarLinkController extends ListView<String> {

    @FXML
    private ListView<String> sidebarLink;

    public static final ObservableList<String> data = FXCollections.observableArrayList();

    public SidebarLinkController() {
        data.addAll("Site", "Ouvrir", "Nouveau");
        sidebarLink.setItems(data);
    }
}
