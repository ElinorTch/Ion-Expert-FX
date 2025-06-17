package com.example.ionexpertfx.controller.sidebar;

public class IconItem {
    private String iconName;
    private String title;

    public IconItem(String iconPath, String label) {
        this.iconName = iconPath;
        this.title = label;
    }

    public String getIconPath() {
        return iconName;
    }

    public String getTitle() {
        return title;
    }
    
}
