package com.galdovich.day1.builder.command.impl;

import com.galdovich.day1.builder.command.Command;
import com.galdovich.day1.model.entity.Appliance;
import com.galdovich.day1.model.entity.criteria.paramType.LaptopParam;

import java.util.ArrayList;
import java.util.List;

public class Refrigerator implements Command {

    @Override
    public List<Appliance> execute(List<String> parameters) {
        List<Appliance> result = new ArrayList<>();
        List<String[]> list;
        if (parameters == null || parameters.isEmpty()) {
            return result;
        }
        if (parameters.size() > LaptopParam.values().length) {
            list = createList(parameters);
        } else {
            list = new ArrayList<>();
            String[] arr = parameters.toArray(new String[parameters.size()]);
            list.add(arr);
        }
        for (int i = 0; i < list.size(); i++) {
            String[] array = list.get(i);
            int powerConsumption = Integer.parseInt(array[0]);
            double weight = Double.parseDouble(array[1]);
            int freezerCapacity = Integer.parseInt(array[2]);
            double overallCapacity = Double.parseDouble(array[3]);
            double height = Double.parseDouble(array[4]);
            double width = Double.parseDouble(array[5]);
            result.add(new com.galdovich.day1.model.entity.impl.Refrigerator(powerConsumption, weight,
                    freezerCapacity, overallCapacity, height, width));
        }
        return result;
    }

    private List<String[]> createList(List<String> parameters) {
        int paramCount = LaptopParam.values().length;
        int count = parameters.size() / paramCount;
        List<String[]> list = new ArrayList<>();
        int j = 0;
        for (int i = 0; i < count; i++) {
            String[] array = new String[paramCount];
            for (int a = j; a < paramCount + j; a++) {
                array[a - j] = parameters.get(a);
            }
            list.add(array);
            j += paramCount;
        }
        return list;
    }
}
