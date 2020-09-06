package com.galdovich.day1.service.validator;

import com.galdovich.day1.model.entity.criteria.Criteria;
import com.galdovich.day1.model.entity.type.ApplianceType;

import java.util.Arrays;
import java.util.Map;

public class ServiceValidator {

    public boolean criteriaValidator(Criteria criteria) {
        boolean result = false;
        if (criteria.getCriteria().isEmpty()) {
            return false;
        }
        if (applianceTypeValidate(criteria.getGroupSearchName()) && applianceParamValidate(criteria)) {
            result = true;
        }
        return result;
    }

    private boolean applianceTypeValidate(String type) {
        boolean result = false;
        if (type != null && !type.isEmpty()) {
            result = Arrays.stream(ApplianceType.values())
                    .anyMatch(s -> s.name().equals(type.toUpperCase()));
        }
        return result;
    }

    private boolean applianceParamValidate(Criteria criteria) {
        boolean result;
        Map<String, Object> map = criteria.getCriteria();
        String keySet = map.keySet().toString();
        String param = keySet.substring(1, keySet.length() - 1);
        Object[] params = ApplianceType.valueOf(criteria.getGroupSearchName().toUpperCase()).getParam();
        result = Arrays.stream(params)
                .anyMatch(s -> s.toString().equals(param.toUpperCase()));
        return result;
    }
}
