package com.galdovich.day1.model.entity.criteria.paramType;

public enum RefrigeratorParam {
    POWER_CONSUMPTION("POWER_CONSUMPTION"),
    WEIGHT("WEIGHT"),
    FREEZER_CAPACITY("FREEZER_CAPACITY"),
    OVERALL_CAPACITY("OVERALL_CAPACITY"),
    HEIGHT("HEIGHT"),
    WIDTH("WIDTH");

    private String name;

    RefrigeratorParam(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}