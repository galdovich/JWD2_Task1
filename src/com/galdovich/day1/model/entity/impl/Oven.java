package com.galdovich.day1.model.entity.impl;

import com.galdovich.day1.model.entity.KitchenAppliance;

public class Oven extends KitchenAppliance {
    private int capacity;
    private int depth;

    public Oven() {
        super(Oven.class.getSimpleName());
    }

    public Oven(int powerСonsumption, int weight, int capacity, int depth, double height, double width) {
        super(Oven.class.getSimpleName(), powerСonsumption, weight, height, width);
        this.capacity = capacity;
        this.depth = depth;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Oven oven = (Oven) o;

        if (capacity != oven.capacity) return false;
        return depth == oven.depth;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + capacity;
        result = 31 * result + depth;
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString());
        sb.append(", capacity=").append(capacity);
        sb.append(", depth=").append(depth);
        sb.append('}');
        return sb.toString();
    }
}
