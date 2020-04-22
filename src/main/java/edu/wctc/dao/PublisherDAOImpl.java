package edu.wctc.dao;

import entity.Publisher;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PublisherDAOImpl implements PublisherDAO {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Publisher> getPublisher() {
        // Get current Hibernate session
        Session session = sessionFactory.getCurrentSession();

        List<Publisher> publisherList = session.createQuery("from Publisher", Publisher.class).getResultList();

        return publisherList;
    }

    @Override
    public Publisher getPublisher(int id) {
        // Get current Hibernate session
        Session session = sessionFactory.getCurrentSession();

        Publisher aPublisher = session.get(Publisher.class, id);
        return null;
    }
}
