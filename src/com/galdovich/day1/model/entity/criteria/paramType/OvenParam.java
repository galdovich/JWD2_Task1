package com.galdovich.day1.model.entity.criteria.paramType;

public enum OvenParam {
    POWER_CONSUMPTION("POWER_CONSUMPTION"),
    WEIGHT("WEIGHT"),
    CAPACITY("CAPACITY"),
    DEPTH("DEPTH"),
    HEIGHT("HEIGHT"),
    WIDTH("WIDTH");

    private String name;

    OvenParam(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
