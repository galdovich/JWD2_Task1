package com.galdovich.day1.model.entity.criteria.paramType;

public enum LaptopParam {
    BATTERY_CAPACITY("BATTERY_CAPACITY"),
    OS("OS"),
    MEMORY_ROM("MEMORY_ROM"),
    SYSTEM_MEMORY("SYSTEM_MEMORY"),
    CPU("CPU"),
    DISPLAY_INCHS("DISPLAY_INCHS");

    private String name;

    LaptopParam(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
