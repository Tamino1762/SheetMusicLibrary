package hibernate;

import entity.Music;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

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
        Music m;


    }
}
