package com.galdovich.day1.model.entity.criteria.paramType;

public enum VacuumCleanerParam {
    POWER_CONSUMPTION("POWER_CONSUMPTION"),
    FILTER_TYPE("FILTER_TYPE"),
    BAG_TYPE("BAG_TYPE"),
    WAND_TYPE("WAND_TYPE"),
    MOTOR_SPEED_REGULATION("MOTOR_SPEED_REGULATION"),
    CLEANING_WIDTH("CLEANING_WIDTH");

    private String name;

    VacuumCleanerParam(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}