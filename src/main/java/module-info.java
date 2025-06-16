module com.example.ionexpertfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires atlantafx.base;
    requires org.kordamp.ikonli.feather;

    opens com.example.ionexpertfx to javafx.fxml;
    exports com.example.ionexpertfx;

    opens com.example.ionexpertfx.controller to javafx.fxml;
    exports com.example.ionexpertfx.controller;
}