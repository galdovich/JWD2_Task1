package com.galdovich.day1.model.entity;

public abstract class ComputerAppliance implements Appliance{
    String name;
    private double batteryCapacity;
    private int memoryRom;

    public ComputerAppliance(String name) {
        this.name = name;
    }

    public ComputerAppliance(String name, double batteryCapacity, int memoryRom) {
        this.name = name;
        this.batteryCapacity = batteryCapacity;
        this.memoryRom = memoryRom;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(int memoryRom) {
        this.memoryRom = memoryRom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ComputerAppliance that = (ComputerAppliance) o;

        if (Double.compare(that.batteryCapacity, batteryCapacity) != 0) return false;
        return memoryRom == that.memoryRom;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(batteryCapacity);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + memoryRom;
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(name).append("={");
        sb.append("batteryCapacity=").append(batteryCapacity);
        sb.append(", memoryRom=").append(memoryRom);
        return sb.toString();
    }
}
