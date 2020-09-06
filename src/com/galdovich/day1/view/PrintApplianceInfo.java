package com.galdovich.day1.view;

import com.galdovich.day1.model.entity.Appliance;

import java.util.List;

public class PrintApplianceInfo {

    public static void print(Appliance appliances) {
        System.out.println(appliances);
    }

    public static void print(List<Appliance> appliances) {
        for (Appliance appliance : appliances) {
            System.out.println(appliance);
        }
    }
}
