package edu.wctc.dao;

import entity.MusicInstrument;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class InstrumentDAOImpl implements InstrumentDAO {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<MusicInstrument> getInstrument() {
        // Get current Hibernate session
        Session session = sessionFactory.getCurrentSession();

        List<MusicInstrument> musicInstrumentList = session.createQuery("from MusicInstrument", MusicInstrument.class).getResultList();

        return musicInstrumentList;
    }

    @Override
    public MusicInstrument getInstrument(int instrumentId) {
        // Get current Hibernate session
        Session session = sessionFactory.getCurrentSession();

        MusicInstrument instrument = session.get(MusicInstrument.class, instrumentId);

        return instrument;
    }
}
