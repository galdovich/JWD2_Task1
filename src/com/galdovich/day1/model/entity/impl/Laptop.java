package com.galdovich.day1.model.entity.impl;

import com.galdovich.day1.model.entity.ComputerAppliance;
import com.galdovich.day1.model.entity.type.OsType;

public class Laptop extends ComputerAppliance {
    private OsType osType;
    private int systemMemory;
    private double cpu;
    private double displayInchs;

    public Laptop() {
        super(Laptop.class.getSimpleName());
    }

    public Laptop(double batteryCapacity, OsType osType, int memoryRom, int systemMemory, double cpu, double displayInchs) {
        super(Laptop.class.getSimpleName(), batteryCapacity, memoryRom);
        this.osType = osType;
        this.systemMemory = systemMemory;
        this.cpu = cpu;
        this.displayInchs = displayInchs;
    }

    public OsType getOsType() {
        return osType;
    }

    public void setOsType(OsType osType) {
        this.osType = osType;
    }

    public int getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(int systemMemory) {
        this.systemMemory = systemMemory;
    }

    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public double getDisplayInchs() {
        return displayInchs;
    }

    public void setDisplayInchs(double displayInchs) {
        this.displayInchs = displayInchs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Laptop laptop = (Laptop) o;

        if (systemMemory != laptop.systemMemory) return false;
        if (Double.compare(laptop.cpu, cpu) != 0) return false;
        if (Double.compare(laptop.displayInchs, displayInchs) != 0) return false;
        return osType == laptop.osType;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        result = 31 * result + (osType != null ? osType.hashCode() : 0);
        result = 31 * result + systemMemory;
        temp = Double.doubleToLongBits(cpu);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(displayInchs);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString());
        sb.append(", osType=").append(osType);
        sb.append(", systemMemory=").append(systemMemory);
        sb.append(", cpu=").append(cpu);
        sb.append(", displayInchs=").append(displayInchs);
        sb.append('}');
        return sb.toString();
    }
}
