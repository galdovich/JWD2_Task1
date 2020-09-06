package com.galdovich.day1.model.entity.type;

public enum Color {
    BLUE("blue"), RED("red"), GREEN("green");

    private String name;

    Color(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}