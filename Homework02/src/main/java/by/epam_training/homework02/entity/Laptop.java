package by.epam_training.homework02.entity;

import by.epam_training.homework02.entity.criteria.SearchCriteria;

import java.util.Map;
import java.util.Objects;

public class Laptop extends Appliance{
    private double batteryCapacity;
    private String os;
    private int memoryROM;
    private int systemMemory;
    private double cpu;
    private int displayINCHS;

    public Laptop(){}

    public Laptop(Map<String, Object> parameters){
        batteryCapacity = Double.parseDouble((String) parameters.get(SearchCriteria.Laptop.BATTERY_CAPACITY.toString()));
        os = (String) parameters.get(SearchCriteria.Laptop.OS.toString());
        memoryROM = Integer.parseInt((String) parameters.get(SearchCriteria.Laptop.MEMORY_ROM.toString()));
        systemMemory = Integer.parseInt((String) parameters.get(SearchCriteria.Laptop.SYSTEM_MEMORY.toString()));
        cpu = Double.parseDouble((String) parameters.get(SearchCriteria.Laptop.CPU.toString()));
        displayINCHS = Integer.parseInt((String) parameters.get(SearchCriteria.Laptop.DISPLAY_INCHES.toString()));
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getMemoryROM() {
        return memoryROM;
    }

    public void setMemoryROM(int memoryROM) {
        this.memoryROM = memoryROM;
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

    public int getDisplayINCHS() {
        return displayINCHS;
    }

    public void setDisplayINCHS(int displayINCHS) {
        this.displayINCHS = displayINCHS;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop lapTop = (Laptop) o;
        return Double.compare(lapTop.batteryCapacity, batteryCapacity) == 0 &&
                memoryROM == lapTop.memoryROM &&
                systemMemory == lapTop.systemMemory &&
                Double.compare(lapTop.cpu, cpu) == 0 &&
                displayINCHS == lapTop.displayINCHS &&
                Objects.equals(os, lapTop.os);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batteryCapacity, os, memoryROM, systemMemory, cpu, displayINCHS);
    }

    @Override
    public String toString() {
        return "LapTop{" +
                "batteryCapacity=" + batteryCapacity +
                ", os='" + os + '\'' +
                ", memoryROM=" + memoryROM +
                ", systemMemory=" + systemMemory +
                ", cpu=" + cpu +
                ", displayINCHS=" + displayINCHS +
                '}';
    }
}
