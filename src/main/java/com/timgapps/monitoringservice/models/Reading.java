package com.timgapps.monitoringservice.models;

import java.util.UUID;

// модель "Показания"
public abstract class Reading {
    protected int value;

    protected User owner;

    // TODO accountId (лицевой счет)

    public Reading(User owner, int value) {
        this.owner = owner;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
