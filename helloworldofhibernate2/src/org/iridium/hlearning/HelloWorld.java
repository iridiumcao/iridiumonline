package org.iridium.hlearning;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.iridium.hlearning.entity.Event;

import java.util.Date;
import java.util.List;

public class HelloWorld {

    public static void main(String[] args) {
        //////////
//        Configuration configuration = new Configuration();  
//        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();  
//        SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);  
        //////////
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(new Event("Our very first event! 第一条记录", new Date()));
        session.save(new Event("A follow up event! 第二条记录", new Date()));
        session.getTransaction().commit();
        session.close();

        session = sessionFactory.openSession();
        session.beginTransaction();
        List result = session.createQuery(" from Event").list();

        result.forEach((e) -> {
            Event event = (Event) e;
            System.out.println("Event (" + event.getDate() + "): " + event.getTitle());
        });

        session.getTransaction().commit();
        session.close();

        sessionFactory.close();
    }

}
