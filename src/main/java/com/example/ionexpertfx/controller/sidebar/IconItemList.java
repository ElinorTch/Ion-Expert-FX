package com.example.ionexpertfx.controller.sidebar;

import java.util.HashMap;
import java.util.Map;

public class IconItemList {

    public class IconItem {
        private String iconPath;
        private String label;

        public IconItem(String iconPath, String label) {
            this.iconPath = iconPath;
            this.label = label;
        }

        public String getIconPath() {
            return iconPath;
        }

        public String getLabel() {
            return label;
        }
    }

    private final Map<String, String> iconItemList = new HashMap<>();

    public void addIconItemList(IconItem[] iconItems) {
        for (IconItem iconItem : iconItems) {
            iconItemList.put(iconItem.getIconPath(), iconItem.getLabel());
        }
    }
}
