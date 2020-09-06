package com.galdovich.day1.model.entity;

public abstract class KitchenAppliance extends ElectricalAppliance {
    private double weight;
    private double height;
    private double width;

    public KitchenAppliance(String name) {
        super(name);
    }

    public KitchenAppliance(String name, double powerConsumption, double weight, double height, double width) {
        super(name, powerConsumption);
        this.weight = weight;
        this.height = height;
        this.width = width;
    }

    public KitchenAppliance(String name, double powerConsumption) {
        super(name, powerConsumption);
    }

    @Override
    public double getPowerConsumption() {
        return super.getPowerConsumption();
    }

    @Override
    public void setPowerConsumption(double powerConsumption) {
        super.setPowerConsumption(powerConsumption);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        KitchenAppliance that = (KitchenAppliance) o;

        if (Double.compare(that.weight, weight) != 0) return false;
        if (Double.compare(that.height, height) != 0) return false;
        return Double.compare(that.width, width) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(width);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString());
        sb.append(", weight=").append(weight);
        sb.append(", height=").append(height);
        sb.append(", width=").append(width);
        return sb.toString();
    }
}
