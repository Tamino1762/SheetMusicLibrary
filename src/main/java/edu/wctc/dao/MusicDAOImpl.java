package edu.wctc.dao;

import entity.Music;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MusicDAOImpl implements MusicDAO{
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Music> getMusic() {
        // Get current Hibernate session
        Session session = sessionFactory.getCurrentSession();

        //Music List
        List<Music> musicList= session.createQuery("from Music" , Music .class).getResultList();

        return musicList;
    }

    @Override
    public void saveMusic(Music theMusic) {
        // Get current Hibernate session
        Session session = sessionFactory.getCurrentSession();

        //save / update music
        session.saveOrUpdate(theMusic);
    }

    @Override
    public Music getMusic(int theId) {
        // Get current Hibernate session
        Session session = sessionFactory.getCurrentSession();

        return session.get(Music.class, theId);
    }

    @Override
    public void deleteMusic(int theId) {
        // Get current Hibernate session
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("delete from Music where id = :doomedMusicId" );

        query.setParameter("doomedMusicId", theId);

        query.executeUpdate();
    }

    @Override
    public List<Music> getMusicByTitle(String theSearchTerm) {
        // Get current Hibernate session
        Session session = sessionFactory.getCurrentSession();
        theSearchTerm = "%" + theSearchTerm.toLowerCase() + "%";

        Query<Music> query = session.createQuery("from Music where lower(title) like :nameToSearch");
        query.setParameter("nameToSearch", theSearchTerm);

        return query.getResultList();
    }
}
