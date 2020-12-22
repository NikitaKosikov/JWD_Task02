package by.epam_training.homework02.factory.impl;

import by.epam_training.homework02.entity.*;

import java.util.Map;

public class ApplianceSimpleFactory {
    public Appliance createAppliance(ApplianceDataParser parserDataAppliance){
        
        Map<String, Object> applianceInfo = parserDataAppliance.parserString(parserDataAppliance.getDevice());

            switch (applianceInfo.get("Name").toString()){
                case "Laptop" ->{
                    return new Laptop(applianceInfo);
                }
                case "Oven" -> {
                    return new Oven(applianceInfo);
                }
                case "Refrigerator" ->{
                    return new Refrigerator(applianceInfo);
                }
                case "Speakers" ->{
                    return new Speakers(applianceInfo);
                }
                case "TabletPC" -> {
                    return new TabletPC(applianceInfo);
                }
                case "VacuumCleaner" ->{
                    return new VacuumCleaner(applianceInfo);
                }
                default -> throw new IllegalStateException("Unexpected value: " + applianceInfo.get("Name").toString());
            }
    }

}
