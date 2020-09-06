package com.galdovich.day1.model.entity.impl;

import com.galdovich.day1.model.entity.KitchenAppliance;

public class Refrigerator extends KitchenAppliance {
    private int freezerCapacity;
    private double overallCapacity;

    public Refrigerator() {
        super(Refrigerator.class.getSimpleName());
    }

    public Refrigerator(int powerConsumption, double weight, int freezerCapacity, double overallCapacity, double height, double width) {
        super(Refrigerator.class.getSimpleName(), powerConsumption, weight, height, width);
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;
    }

    public int getFreezerCapacity() {
        return freezerCapacity;
    }

    public void setFreezerCapacity(int freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public double getOverallCapacity() {
        return overallCapacity;
    }

    public void setOverallCapacity(double overallCapacity) {
        this.overallCapacity = overallCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Refrigerator that = (Refrigerator) o;

        if (freezerCapacity != that.freezerCapacity) return false;
        return Double.compare(that.overallCapacity, overallCapacity) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        result = 31 * result + freezerCapacity;
        temp = Double.doubleToLongBits(overallCapacity);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString());
        sb.append(", freezerCapacity=").append(freezerCapacity);
        sb.append(", overallCapacity=").append(overallCapacity);
        sb.append('}');
        return sb.toString();
    }
}
