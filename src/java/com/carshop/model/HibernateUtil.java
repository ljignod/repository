package com.carshop.model;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
        private static SessionFactory sessionFactory;
        private static ServiceRegistry serviceRegistry;
    
    public static SessionFactory getSessionFactory(){
        if(sessionFactory==null||sessionFactory.isClosed()){
            Configuration config = new Configuration();
            config.configure();
            serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
            sessionFactory = config.buildSessionFactory(serviceRegistry);
        }
        return sessionFactory;
    }
}
