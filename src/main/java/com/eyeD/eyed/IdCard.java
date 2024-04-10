package com.eyeD.eyed;

import java.util.UUID;

public class IdCard {
    private UUID id;
    private Employee employee;

    public IdCard(Employee employee) {
        this.id = UUID.randomUUID();
        this.employee = employee;
    }

    // getters
}