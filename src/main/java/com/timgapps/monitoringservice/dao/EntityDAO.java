package com.timgapps.monitoringservice.dao;

import com.timgapps.monitoringservice.models.Entity;

import java.util.List;

public class EntityDAO {
    protected List<Entity> entities;

    public List<Entity> getAllEntities() {
        return entities;
    }

    public void addEntity(Entity entity) {
        entities.add(entity);
    }
}
