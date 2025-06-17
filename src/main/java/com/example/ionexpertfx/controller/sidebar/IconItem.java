package com.example.ionexpertfx.controller.sidebar;

public class IconItem {
    private String iconPath;
    private String title;

    public IconItem(String iconPath, String label) {
        this.iconPath = iconPath;
        this.title = label;
    }

    public String getIconPath() {
        return iconPath;
    }

    public String getTitle() {
        return title;
    }
    
}
