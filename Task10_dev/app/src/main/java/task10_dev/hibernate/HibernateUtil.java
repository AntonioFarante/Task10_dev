package task10_dev.hibernate;

import lombok.Getter;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import task10_dev.Entity.Client;
import task10_dev.Entity.Planet;

import java.util.List;

public class HibernateUtil {
    private static final HibernateUtil INSTANCE;

    static {
        INSTANCE = new HibernateUtil();
    }

    @Getter
    private SessionFactory sessionFactory;

    public HibernateUtil() {
        sessionFactory = new Configuration()
                .addAnnotatedClass(Client.class)
                .addAnnotatedClass(Planet.class)
                .buildSessionFactory();
    }

    public static HibernateUtil getINSTANCE() {
        return INSTANCE;
    }

    public void close() {
        sessionFactory.close();
    }

//    public static void main(String[] args) {
//        HibernateUtil util = HibernateUtil.getINSTANCE();
//
//        Session session = util.getSessionFactory().openSession();
////            Transaction transaction = session.beginTransaction();
////                Client newClient = new Client();
////                newClient.setName("Tomas");
////                session.persist(newClient);
////                System.out.println("newClient = " + newClient);
////            transaction.commit();
//
//        List<Client> from_client = session.createQuery("from Client", Client.class).list();
//        System.out.println("from_client = " + from_client);
//        session.close();
//    }
}
