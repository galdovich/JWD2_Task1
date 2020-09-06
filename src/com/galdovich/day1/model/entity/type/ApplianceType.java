package com.galdovich.day1.model.entity.type;

import com.galdovich.day1.model.entity.criteria.paramType.*;

public enum ApplianceType {
    OVEN("Oven", OvenParam.values()),
    LAPTOP("Laptop", LaptopParam.values()),
    REFRIGERATOR("Refrigerator", RefrigeratorParam.values()),
    VACUUMCLEANER("VacuumCleaner", VacuumCleanerParam.values()),
    TABLETPC("TabletPC", TabletPCParam.values()),
    SPEAKERS("Speakers", SpeakersParam.values());

    private String name;
    private Object[] param;

    ApplianceType(String name, Object[] param) {
        this.name = name;
        this.param = param;
    }

    public String getName() {
        return name;
    }

    public Object[] getParam() {
        return param;
    }
}