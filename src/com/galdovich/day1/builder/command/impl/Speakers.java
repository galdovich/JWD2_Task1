package com.galdovich.day1.builder.command.impl;

import com.galdovich.day1.builder.command.Command;
import com.galdovich.day1.model.entity.Appliance;
import com.galdovich.day1.model.entity.criteria.paramType.SpeakersParam;

import java.util.ArrayList;
import java.util.List;

public class Speakers implements Command {

    @Override
    public List<Appliance> execute(List<String> parameters) {
        List<Appliance> result = new ArrayList<>();
        List<String[]> list;
        if (parameters == null || parameters.isEmpty()) {
            return result;
        }
        if (parameters.size() > SpeakersParam.values().length) {
            list = createList(parameters);
        } else {
            list = new ArrayList<>();
            String[] arr = parameters.toArray(new String[parameters.size()]);
            list.add(arr);
        }
        for (int i = 0; i < list.size(); i++) {
            String[] array = list.get(i);
            int powerСonsumption = Integer.parseInt(array[0]);
            int numberOfSpeakers = Integer.parseInt(array[1]);
            String frequencyRange = array[2];
            int cordLength = Integer.parseInt(array[3]);
            result.add(new com.galdovich.day1.model.entity.impl.Speakers(powerСonsumption, numberOfSpeakers,
                    frequencyRange, cordLength));
        }
        return result;
    }

    private List<String[]> createList(List<String> parameters) {
        int paramCount = SpeakersParam.values().length;
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
