package by.epam_training.homework02.entity;

import by.epam_training.homework02.entity.criteria.SearchCriteria;

import java.util.Map;
import java.util.Objects;

public class Refrigerator extends Appliance{
    private int powerConsumption;
    private int weight;
    private int freezerCapacity;
    private double overallCapacity;
    private int height;
    private int width;

    public Refrigerator(){}

    public Refrigerator(Map<String, Object> parameters){
        powerConsumption = Integer.parseInt((String) parameters.get(SearchCriteria.Refrigerator.POWER_CONSUMPTION.toString()));
        weight = Integer.parseInt((String) parameters.get(SearchCriteria.Refrigerator.WEIGHT.toString()));
        freezerCapacity = Integer.parseInt((String) parameters.get(SearchCriteria.Refrigerator.FREEZER_CAPACITY.toString()));
        overallCapacity = Double.parseDouble((String) parameters.get(SearchCriteria.Refrigerator.OVERALL_CAPACITY.toString()));
        height = Integer.parseInt((String) parameters.get(SearchCriteria.Refrigerator.HEIGHT.toString()));
        width = Integer.parseInt((String) parameters.get(SearchCriteria.Refrigerator.WIDTH.toString()));
}

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Refrigerator that = (Refrigerator) o;
        return powerConsumption == that.powerConsumption &&
                weight == that.weight &&
                freezerCapacity == that.freezerCapacity &&
                Double.compare(that.overallCapacity, overallCapacity) == 0 &&
                Double.compare(that.height, height) == 0 &&
                Double.compare(that.width, width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, weight, freezerCapacity, overallCapacity, height, width);
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "powerConsumption=" + powerConsumption +
                ", weight=" + weight +
                ", freezerCapacity=" + freezerCapacity +
                ", overallCapacity=" + overallCapacity +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
