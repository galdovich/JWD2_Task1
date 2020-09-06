package com.galdovich.day1.model.entity.criteria.paramType;

public enum TabletPCParam {
    BATTERY_CAPACITY("BATTERY_CAPACITY"),
    DISPLAY_INCHES("DISPLAY_INCHES"),
    MEMORY_ROM("MEMORY_ROM"),
    FLASH_MEMORY_CAPACITY("FLASH_MEMORY_CAPACITY"),
    COLOR("COLOR");

    private String name;

    TabletPCParam(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}