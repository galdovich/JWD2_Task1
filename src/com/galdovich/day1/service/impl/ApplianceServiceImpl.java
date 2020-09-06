package com.galdovich.day1.service.impl;

import com.galdovich.day1.model.dao.ApplianceDAO;
import com.galdovich.day1.model.dao.DAOFactory;
import com.galdovich.day1.model.entity.Appliance;
import com.galdovich.day1.model.entity.criteria.Criteria;
import com.galdovich.day1.model.exception.DAOException;
import com.galdovich.day1.service.ApplianceService;
import com.galdovich.day1.service.exception.ServiceException;
import com.galdovich.day1.service.validator.ServiceValidator;

import java.util.List;

public class ApplianceServiceImpl implements ApplianceService {

    @Override
    public List<Appliance> find(Criteria criteria) throws ServiceException {
        ServiceValidator validator = new ServiceValidator();
        if (!validator.criteriaValidator(criteria)) {
            throw new ServiceException("Criteria error");
        }
        List<Appliance> appliance;
        DAOFactory daoFactory = DAOFactory.getInstance();
        ApplianceDAO applianceDAO = daoFactory.getApplianceDAO();
        try {
            appliance = applianceDAO.find(criteria);
        } catch (DAOException exc) {
            throw new ServiceException(exc);
        }
        return appliance;
    }
}