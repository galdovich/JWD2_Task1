package com.galdovich.day1.builder.command.impl;

import com.galdovich.day1.builder.command.Command;
import com.galdovich.day1.model.entity.Appliance;
import com.galdovich.day1.model.entity.criteria.paramType.LaptopParam;
import com.galdovich.day1.model.entity.type.OsType;

import java.util.ArrayList;
import java.util.List;

public class Laptop implements Command {

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
            double batteryCapacity = Double.parseDouble(array[0]);
            OsType osType = OsType.valueOf(array[1].toUpperCase());
            int memoryRom = Integer.parseInt(array[2]);
            int systemMemory = Integer.parseInt(array[3]);
            double cpu = Double.parseDouble(array[4]);
            double displayInchs = Double.parseDouble(array[5]);
            result.add(new com.galdovich.day1.model.entity.impl.Laptop(batteryCapacity, osType,
                    memoryRom, systemMemory, cpu, displayInchs));
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
