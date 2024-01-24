package com.timgapps.monitoringservice.models;

public class Entity {
    protected TypeOfEntity typeOfEntity;

    protected String login;

    protected String password;

    public Entity(String login, String password, TypeOfEntity typeOfEntity) {
        this.typeOfEntity = typeOfEntity;
    }
}
