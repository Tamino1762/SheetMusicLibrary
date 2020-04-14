package hibernate;

import entity.Music;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import lombok.Data;
import java.util.List;

public class Hibernate {

    private SessionFactory factory;

    public Hibernate() {
        factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    }

    public void close(){
        factory.close();
    }

    public static void main(String[] args) {
        Hibernate hibernate = new Hibernate();
       List<Music> musicList = hibernate.getAllMusic();

       for(Music m : musicList){
           System.out.println(m);
       }




        hibernate.close();

    }

    public List<Music> getAllMusic(){
        Session session = factory.getCurrentSession();

        session.beginTransaction();

        List list = session.createQuery("from Music").getResultList();

        session.getTransaction().commit();

        return list;
    }
}
