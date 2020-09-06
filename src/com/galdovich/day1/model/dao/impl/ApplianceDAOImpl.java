package com.galdovich.day1.model.dao.impl;

import com.galdovich.day1.builder.BuilderProvider;
import com.galdovich.day1.builder.command.Command;
import com.galdovich.day1.file.ApplianceFileReader;
import com.galdovich.day1.file.exception.ApplianceFileReaderException;
import com.galdovich.day1.model.dao.ApplianceDAO;
import com.galdovich.day1.model.entity.Appliance;
import com.galdovich.day1.model.entity.criteria.Criteria;
import com.galdovich.day1.model.exception.DAOException;
import com.galdovich.day1.parser.ApplianceParser;

import java.util.List;

public class ApplianceDAOImpl implements ApplianceDAO {
    private static final String FILE_SOURCE = ".\\src\\resources\\appliances_db.txt";

    @Override
    public List<Appliance> find(Criteria criteria) throws DAOException {
        ApplianceFileReader reader = new ApplianceFileReader();
        ApplianceParser parser = new ApplianceParser();
        List<Appliance> appliance;
        List<String> list;
        try {
            list = reader.readLine(FILE_SOURCE, criteria);
            Command command = BuilderProvider.defineBuilder(criteria.getGroupSearchName());
            List<String> param = parser.createParamList(list);
            appliance = command.execute(param);
        } catch (ApplianceFileReaderException exc) {
            throw new DAOException(exc);
        }
        return appliance;
    }
}