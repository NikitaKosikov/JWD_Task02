package by.epam_training.homework02.main;

import by.epam_training.homework02.entity.Appliance;
import by.epam_training.homework02.entity.criteria.Criteria;
import by.epam_training.homework02.entity.criteria.SearchCriteria;
import by.epam_training.homework02.service.ApplianceService;
import by.epam_training.homework02.service.ServiceFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static by.epam_training.homework02.entity.criteria.SearchCriteria.*;

public class Main {

    public static void main(String[] args) throws IOException {
        List<Appliance> appliance;

        ServiceFactory factory = ServiceFactory.getInstance();
        ApplianceService service = factory.getApplianceService();

        //////////////////////////////////////////////////////////////////

        Criteria criteriaOven = new Criteria(Oven.class.getSimpleName());//"Oven"
        criteriaOven.add(Oven.CAPACITY.toString(), 21);

        appliance = service.find(criteriaOven);

        PrintApplianceInfo.print(appliance);

        //////////////////////////////////////////////////////////////////

        Criteria criteriaSpeaker = new Criteria(Speakers.class.getSimpleName());//"Oven"
        criteriaSpeaker.add(Speakers.CORD_LENGTH.toString(), 4);
        criteriaSpeaker.add(Speakers.FREQUENCY_RANGE.toString(), "2-3.5");

        appliance = service.find(criteriaSpeaker);

        PrintApplianceInfo.print(appliance);

        //////////////////////////////////////////////////////////////////

        criteriaOven = new Criteria(Oven.class.getSimpleName());
        criteriaOven.add(Oven.DEPTH.toString(), 60);

        appliance = service.find(criteriaOven);

        PrintApplianceInfo.print(appliance);

        //////////////////////////////////////////////////////////////////

        Criteria criteriaTabletPC = new Criteria(TabletPC.class.getSimpleName());
        criteriaTabletPC.add(TabletPC.COLOR.toString(), "BLUE");
        criteriaTabletPC.add(TabletPC.DISPLAY_INCHES.toString(), 14.5);
        criteriaTabletPC.add(TabletPC.MEMORY_ROM.toString(), 8000);

        appliance = service.find(criteriaTabletPC);// find(Object...obj)

        PrintApplianceInfo.print(appliance);

        //////////////////////////////////////////////////////////////////

        Criteria criteriaLapTop = new Criteria(SearchCriteria.Laptop.class.getSimpleName());
        criteriaLapTop.add(SearchCriteria.Laptop.BATTERY_CAPACITY.toString(), 1.5);
        criteriaLapTop.add(SearchCriteria.Laptop.OS.toString(), "Linux");
        criteriaLapTop.add(SearchCriteria.Laptop.CPU.toString(), 2);
        criteriaLapTop.add(SearchCriteria.Laptop.MEMORY_ROM.toString(),8000);
        criteriaLapTop.add(SearchCriteria.Laptop.SYSTEM_MEMORY.toString(),1000);

        appliance = service.find(criteriaLapTop);

        PrintApplianceInfo.print(appliance);

        Criteria criteriaLapTop2 = new Criteria(SearchCriteria.Laptop.class.getSimpleName());
        criteriaLapTop2.add(SearchCriteria.Laptop.OS.toString(), "Windows");

        appliance = service.find(criteriaLapTop2);

        PrintApplianceInfo.print(appliance);

        //////////////////////////////////////////////////////////////////////////////////

        Criteria criteriaVacuumCleaner= new Criteria(SearchCriteria.VacuumCleaner.class.getSimpleName());
        criteriaVacuumCleaner.add(VacuumCleaner.WAND_TYPE.toString(), "all-in-one");

        appliance = service.find(criteriaVacuumCleaner);

        PrintApplianceInfo.print(appliance);

        //////////////////////////////////////////////////////////////////////////////////

        Criteria criteria= new Criteria(null);
        criteria.add(Refrigerator.POWER_CONSUMPTION.toString(), 15);
        criteria.add(Oven.WEIGHT.toString(), 11);

        appliance = service.find(criteria);

        PrintApplianceInfo.print(appliance);
    }

}
