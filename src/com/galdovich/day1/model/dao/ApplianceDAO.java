package com.galdovich.day1.model.dao;

import com.galdovich.day1.model.entity.Appliance;
import com.galdovich.day1.model.entity.criteria.Criteria;
import com.galdovich.day1.model.exception.DAOException;

import java.util.List;

public interface ApplianceDAO {

    List<Appliance> find(Criteria criteria) throws DAOException;
}