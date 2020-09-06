package com.galdovich.day1.builder;

import com.galdovich.day1.builder.command.Command;

public class BuilderProvider {

    private BuilderProvider() {
    }

    public static Command defineBuilder(String request) {
        BuilderType type = BuilderType.valueOf(request.toUpperCase());
        return type.getCommand();
    }
}
