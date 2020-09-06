package com.galdovich.day1.model.entity.impl;

import com.galdovich.day1.model.entity.ElectricalAppliance;

public class Speakers extends ElectricalAppliance {
    private int numberOfSpeakers;
    private String frequencyRange;
    private int cordLength;

    public Speakers() {
        super(Speakers.class.getSimpleName());
    }

    public Speakers(int powerConsumption, int numberOfSpeakers, String frequencyRange, int cordLength) {
        super(Speakers.class.getSimpleName(), powerConsumption);
        this.numberOfSpeakers = numberOfSpeakers;
        this.frequencyRange = frequencyRange;
        this.cordLength = cordLength;
    }

    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(int numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public String getFrequencyRange() {
        return frequencyRange;
    }

    public void setFrequencyRange(String frequencyRange) {
        this.frequencyRange = frequencyRange;
    }

    public int getCordLength() {
        return cordLength;
    }

    public void setCordLength(int cordLength) {
        this.cordLength = cordLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Speakers speakers = (Speakers) o;

        if (numberOfSpeakers != speakers.numberOfSpeakers) return false;
        if (cordLength != speakers.cordLength) return false;
        return frequencyRange != null ? frequencyRange.equals(speakers.frequencyRange) : speakers.frequencyRange == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + numberOfSpeakers;
        result = 31 * result + (frequencyRange != null ? frequencyRange.hashCode() : 0);
        result = 31 * result + cordLength;
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString());
        sb.append(", numberOfSpeakers=").append(numberOfSpeakers);
        sb.append(", frequencyRange='").append(frequencyRange).append('\'');
        sb.append(", cordLength=").append(cordLength);
        sb.append('}');
        return sb.toString();
    }
}
