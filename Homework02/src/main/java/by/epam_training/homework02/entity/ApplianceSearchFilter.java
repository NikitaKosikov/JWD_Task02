package by.epam_training.homework02.entity;

import by.epam_training.homework02.entity.criteria.Criteria;

import java.util.Map;

public class ApplianceSearchFilter {

    private static final String COLON;
    private static final String COMMA;
    private static final String EQUAL;

    static {
        COLON = " : ";
        EQUAL = "=";
        COMMA = ", ";
    }


    public String filter(Criteria requiredCriteria, String device){
        ApplianceDataParser dataParser = new ApplianceDataParser();
        Map<String, Object> mapDevice;
        if (!"".equals(device)){
            mapDevice = dataParser.parserString(device);
        }else {
            return "";
        }
        int numberOfMatchedCriteria = 0;

            if (mapDevice.get("Name").toString().equalsIgnoreCase(requiredCriteria.getGroupSearchName())
                    || requiredCriteria.getGroupSearchName()==null) {
                boolean outputFromCycle = false;
                    for (Map.Entry<String, Object> criteria : requiredCriteria.getCriteria().entrySet()) {
                        for (Map.Entry<String, Object> criteriaFromFile : mapDevice.entrySet()) {
                            if (criteria.getKey().equals(criteriaFromFile.getKey())) {
                                if (criteria.getValue().toString().equalsIgnoreCase(criteriaFromFile.getValue().toString())) {
                                    numberOfMatchedCriteria++;
                                } else {
                                    outputFromCycle = true;
                                }
                                break;
                            }
                        }
                        if (outputFromCycle) {
                            break;
                        }
                    }
                }
            return numberOfMatchedCriteria==requiredCriteria.getCriteria().size() ? device : "";
    }
}
