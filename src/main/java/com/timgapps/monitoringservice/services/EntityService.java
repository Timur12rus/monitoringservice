package com.timgapps.monitoringservice.services;

import com.timgapps.monitoringservice.dao.EntityDAO;
import com.timgapps.monitoringservice.in.InputConsole;
import com.timgapps.monitoringservice.models.Entity;
import com.timgapps.monitoringservice.models.User;
import com.timgapps.monitoringservice.out.OutputConsole;

public class EntityService {
    protected EntityDAO entityDAO;

    public EntityService(EntityDAO entityDAO) {
        this.entityDAO = entityDAO;
    }

    public void registerEntity() {
        OutputConsole.printText("1 - зарегистрировать админа");
        OutputConsole.printText("2 - зарегистрировать пользователя");
        // TODO сделать регистрацию админа или пользователя
        Entity entity = new User();
        entityDAO.addEntity(entity);
    }
}
