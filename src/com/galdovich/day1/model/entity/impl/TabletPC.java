package com.galdovich.day1.model.entity.impl;

import com.galdovich.day1.model.entity.ComputerAppliance;
import com.galdovich.day1.model.entity.type.Color;

public class TabletPC extends ComputerAppliance {
    private double displayInches;
    private int flashMemoryCapacity;
    private Color color;

    public TabletPC() {
        super(TabletPC.class.getSimpleName());
    }

    public TabletPC(int batteryCapacity, double displayInches, int memoryRom, int flashMemoryCapacity, Color color) {
        super(TabletPC.class.getSimpleName(), batteryCapacity, memoryRom);
        this.displayInches = displayInches;
        this.flashMemoryCapacity = flashMemoryCapacity;
        this.color = color;
    }

    public double getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(double displayInches) {
        this.displayInches = displayInches;
    }

    public int getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public void setFlashMemoryCapacity(int flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        TabletPC tabletPC = (TabletPC) o;

        if (Double.compare(tabletPC.displayInches, displayInches) != 0) return false;
        if (flashMemoryCapacity != tabletPC.flashMemoryCapacity) return false;
        return color == tabletPC.color;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(displayInches);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + flashMemoryCapacity;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString());
        sb.append(", displayInches=").append(displayInches);
        sb.append(", flashMemoryCapacity=").append(flashMemoryCapacity);
        sb.append(", color=").append(color);
        sb.append('}');
        return sb.toString();
    }
}