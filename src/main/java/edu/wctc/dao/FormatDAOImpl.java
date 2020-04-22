package edu.wctc.dao;

import entity.Format;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FormatDAOImpl implements FormatDAO{
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Format> getFormat() {
        // Get current Hibernate session
        Session session = sessionFactory.getCurrentSession();

        List<Format> formatList = session.createQuery("from Format", Format.class).getResultList();

        return formatList;
    }

    @Override
    public Format getFormat(int id) {
        // Get current Hibernate session
        Session session = sessionFactory.getCurrentSession();

        Format format = session.get(Format.class, id);

        return format;
    }
}
