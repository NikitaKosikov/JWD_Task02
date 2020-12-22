package by.epam_training.homework02.dao.impl;

import by.epam_training.homework02.dao.ApplianceDAO;
import by.epam_training.homework02.entity.*;
import by.epam_training.homework02.entity.criteria.Criteria;
import by.epam_training.homework02.factory.impl.ApplianceSimpleFactory;

import java.io.IOException;
import java.util.*;


public class ApplianceDAOImpl implements ApplianceDAO {

    @Override
    public List<Appliance> find(Criteria criteria) throws IOException {
        ApplianceReader applianceReader = new ApplianceReader();
        ApplianceSearchFilter applianceSearchFilter = new ApplianceSearchFilter();
        ApplianceSimpleFactory factory = new ApplianceSimpleFactory();

        String filteredApplianceData;
        Appliance appliance;
        List<Appliance> foundAppliances = new ArrayList<>();
        String applianceDataBlock;

        Iterator<String> applianceDataIterator = applianceReader.iterator(30);
        while (applianceDataIterator.hasNext()){
            applianceDataBlock = applianceDataIterator.next();
            filteredApplianceData = applianceSearchFilter.filter(criteria, applianceDataBlock);
            if (!"".equals(filteredApplianceData)){
                appliance = factory.createAppliance(new ApplianceDataParser(filteredApplianceData));
                foundAppliances.add(appliance);
            }
        }

        return foundAppliances;
    }
   // you may add your own code here
}


//you may add your own new classes