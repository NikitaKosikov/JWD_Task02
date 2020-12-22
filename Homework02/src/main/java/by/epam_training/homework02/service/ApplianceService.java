package by.epam_training.homework02.service;

import by.epam_training.homework02.entity.Appliance;
import by.epam_training.homework02.entity.criteria.Criteria;

import java.io.IOException;
import java.util.List;

public interface ApplianceService {

    List<Appliance> find(Criteria criteria) throws IOException;

}
