package com.galdovich.day1;

import com.galdovich.day1.model.entity.Appliance;
import com.galdovich.day1.model.entity.criteria.Criteria;
import com.galdovich.day1.model.entity.criteria.paramType.OvenParam;
import com.galdovich.day1.model.entity.criteria.paramType.RefrigeratorParam;
import com.galdovich.day1.service.ApplianceService;
import com.galdovich.day1.service.ServiceFactory;
import com.galdovich.day1.service.exception.ServiceException;
import com.galdovich.day1.view.PrintApplianceInfo;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Appliance> appliances;

        ServiceFactory factory = ServiceFactory.getInstance();
        ApplianceService service = factory.getApplianceService();

        //////////////////////////////////////////////////////////////////

        Criteria criteriaOven = new Criteria("Oven");
        criteriaOven.add(OvenParam.CAPACITY.getName(), 33);

        try {
            appliances = service.find(criteriaOven);
            PrintApplianceInfo.print(appliances);
        } catch (ServiceException ex) {
            System.out.println(ex.getMessage());
        }

        //////////////////////////////////////////////////////////////////

        Criteria criteriaTabletPC = new Criteria("Refrigerator");
        criteriaTabletPC.add(RefrigeratorParam.OVERALL_CAPACITY.getName(), 300);

        try {
            appliances = service.find(criteriaTabletPC);
            PrintApplianceInfo.print(appliances);
        } catch (ServiceException ex) {
            System.out.println(ex.getMessage());
        }
    }
}