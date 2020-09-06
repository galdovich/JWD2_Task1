package com.galdovich.day1.model.entity.type;

public enum BagType {
    A2("A2"), AA89("AA-89"), XX00("XX00");

    private String name;

    BagType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}