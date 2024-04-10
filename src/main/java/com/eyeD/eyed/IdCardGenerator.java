package com.eyeD.eyed;

import java.util.HashMap;
import java.util.Map;

public class IdCardGenerator {
    private Map<String, IdCard> idCards = new HashMap<>();

    public IdCard generateIdCard(Employee employee) {
        if (idCards.containsKey(employee.getName())) {
            return idCards.get(employee.getName());
        }

        IdCard idCard = new IdCard(employee);
        idCards.put(employee.getName(), idCard);
        return idCard;
    }
}