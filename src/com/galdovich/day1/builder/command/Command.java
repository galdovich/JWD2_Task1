package com.galdovich.day1.builder.command;

import com.galdovich.day1.model.entity.Appliance;

import java.util.List;

public interface Command {

    List<Appliance> execute(List<String> parameters);
}
