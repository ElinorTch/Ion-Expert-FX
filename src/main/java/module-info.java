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
    requires java.desktop;

    opens com.example.ionexpertfx to javafx.fxml;
    exports com.example.ionexpertfx;

    exports com.example.ionexpertfx.controller.sidebar;
    opens com.example.ionexpertfx.controller.sidebar to javafx.fxml;
    exports com.example.ionexpertfx.controller.shared;
    opens com.example.ionexpertfx.controller.shared to javafx.fxml;
}