package com.galdovich.day1.service;

import com.galdovich.day1.model.entity.Appliance;
import com.galdovich.day1.model.entity.criteria.Criteria;
import com.galdovich.day1.service.exception.ServiceException;

import java.util.List;

public interface ApplianceService {

    List<Appliance> find(Criteria criteria) throws ServiceException;
}
