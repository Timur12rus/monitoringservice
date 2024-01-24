package com.timgapps.monitoringservice.models;

public class User extends Entity{
    private long accountId;  // лицевой счет

    public User() {
        super(TypeOfEntity.USER);
    }
}
