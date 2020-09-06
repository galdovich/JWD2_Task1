package com.galdovich.day1.model.entity;

public abstract class ElectricalAppliance implements Appliance{
    private String name;
    private double powerConsumption;

    public ElectricalAppliance(String name) {
        this.name = name;
    }

    public ElectricalAppliance(String name, double powerConsumption) {
        this.name = name;
        this.powerConsumption = powerConsumption;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ElectricalAppliance that = (ElectricalAppliance) o;

        return Double.compare(that.powerConsumption, powerConsumption) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(powerConsumption);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(name).append("={");
        sb.append("powerConsumption=").append(powerConsumption);
        return sb.toString();
    }
}
