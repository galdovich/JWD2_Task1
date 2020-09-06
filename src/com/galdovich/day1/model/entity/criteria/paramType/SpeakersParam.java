package com.galdovich.day1.model.entity.criteria.paramType;

public enum SpeakersParam {
    POWER_CONSUMPTION("POWER_CONSUMPTION"),
    NUMBER_OF_SPEAKERS("NUMBER_OF_SPEAKERS"),
    FREQUENCY_RANGE("FREQUENCY_RANGE"),
    CORD_LENGTH("CORD_LENGTH");

    private String name;

    SpeakersParam(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
