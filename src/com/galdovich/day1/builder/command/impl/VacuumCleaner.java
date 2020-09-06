package com.galdovich.day1.builder.command.impl;

import com.galdovich.day1.builder.command.Command;
import com.galdovich.day1.model.entity.Appliance;
import com.galdovich.day1.model.entity.criteria.paramType.VacuumCleanerParam;
import com.galdovich.day1.model.entity.type.BagType;
import com.galdovich.day1.model.entity.type.FilterType;

import java.util.ArrayList;
import java.util.List;

public class VacuumCleaner implements Command {

    @Override
    public List<Appliance> execute(List<String> parameters) {
        List<Appliance> result = new ArrayList<>();
        List<String[]> list;
        if (parameters == null || parameters.isEmpty()) {
            return result;
        }
        if (parameters.size() > VacuumCleanerParam.values().length) {
            list = createList(parameters);
        } else {
            list = new ArrayList<>();
            String[] arr = parameters.toArray(new String[parameters.size()]);
            list.add(arr);
        }
        for (int i = 0; i < list.size(); i++) {
            String[] array = list.get(i);
            int powerConsumption = Integer.parseInt(array[0]);
            FilterType filterType = FilterType.valueOf(array[1].toUpperCase());
            BagType bagType = BagType.valueOf(array[2]);
            String wandType = array[3];
            int motorSpeedRegular = Integer.parseInt(array[4]);
            int cleaningWidth = Integer.parseInt(array[5]);
            result.add(new com.galdovich.day1.model.entity.impl.VacuumCleaner(powerConsumption, filterType,
                    bagType, wandType, motorSpeedRegular, cleaningWidth));
        }
        return result;
    }

    private List<String[]> createList(List<String> parameters) {
        int paramCount = VacuumCleanerParam.values().length;
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