package by.epam_training.homework02.service.impl;

import by.epam_training.homework02.dao.ApplianceDAO;
import by.epam_training.homework02.dao.DAOFactory;
import by.epam_training.homework02.entity.Appliance;
import by.epam_training.homework02.entity.criteria.Criteria;
import by.epam_training.homework02.service.ApplianceService;
import by.epam_training.homework02.service.validation.Validator;

import java.io.IOException;
import java.util.List;

public class ApplianceServiceImpl implements ApplianceService {

    @Override
    public List<Appliance> find(Criteria criteria) throws IOException {
        if (!Validator.criteriaValidator(criteria)) {
            return null;
        }

        DAOFactory factory = DAOFactory.getInstance();
        ApplianceDAO applianceDAO = factory.getApplianceDAO();

        List<Appliance> appliance = applianceDAO.find(criteria);

        // you may add your own code here
        return appliance;
    }
}

//you may add your own new classes
