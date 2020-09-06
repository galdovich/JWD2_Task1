package com.galdovich.day1.model.entity.impl;

import com.galdovich.day1.model.entity.ElectricalAppliance;
import com.galdovich.day1.model.entity.type.BagType;
import com.galdovich.day1.model.entity.type.FilterType;

public class VacuumCleaner extends ElectricalAppliance {
    private FilterType filterType;
    private BagType bagType;
    private String wandType;
    private int motorSpeedRegular;
    private int cleaningWidth;

    public VacuumCleaner() {
        super(VacuumCleaner.class.getSimpleName());
    }

    public VacuumCleaner(int powerConsumption, FilterType filterType, BagType bagType, String wandType,
                         int motorSpeedRegular, int cleaningWidth) {
        super(VacuumCleaner.class.getSimpleName(), powerConsumption);
        this.filterType = filterType;
        this.bagType = bagType;
        this.wandType = wandType;
        this.motorSpeedRegular = motorSpeedRegular;
        this.cleaningWidth = cleaningWidth;
    }

    public FilterType getFilterType() {
        return filterType;
    }

    public void setFilterType(FilterType filterType) {
        this.filterType = filterType;
    }

    public BagType getBagType() {
        return bagType;
    }

    public void setBagType(BagType bagType) {
        this.bagType = bagType;
    }

    public String getWandType() {
        return wandType;
    }

    public void setWandType(String wandType) {
        this.wandType = wandType;
    }

    public int getMotorSpeedRegular() {
        return motorSpeedRegular;
    }

    public void setMotorSpeedRegular(int motorSpeedRegular) {
        this.motorSpeedRegular = motorSpeedRegular;
    }

    public int getCleaningWidth() {
        return cleaningWidth;
    }

    public void setCleaningWidth(int cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        VacuumCleaner that = (VacuumCleaner) o;

        if (motorSpeedRegular != that.motorSpeedRegular) return false;
        if (cleaningWidth != that.cleaningWidth) return false;
        if (filterType != that.filterType) return false;
        if (bagType != that.bagType) return false;
        return wandType != null ? wandType.equals(that.wandType) : that.wandType == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (filterType != null ? filterType.hashCode() : 0);
        result = 31 * result + (bagType != null ? bagType.hashCode() : 0);
        result = 31 * result + (wandType != null ? wandType.hashCode() : 0);
        result = 31 * result + motorSpeedRegular;
        result = 31 * result + cleaningWidth;
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString());
        sb.append(", filterType=").append(filterType);
        sb.append(", bagType=").append(bagType);
        sb.append(", wandType=").append(wandType);
        sb.append(", motorSpeedRegular=").append(motorSpeedRegular);
        sb.append(", cleaningWidth=").append(cleaningWidth);
        sb.append('}');
        return sb.toString();
    }
}