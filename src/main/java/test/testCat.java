package test;

import model.Cat;
import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import util.HibernateUtil;

public class testCat {
    public static void main(String[] args) {
        try {
            SessionFactory sessionFactory  = HibernateUtil.getSessionFactory();
            if(sessionFactory!=null) {
                Session session = sessionFactory.openSession();
                try {
                    Transaction tr = session.beginTransaction();
                    Cat cat1 = new Cat();
                    cat1.setName("Tom");
                    session.save(cat1);
                    tr.commit();
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    session.close();
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}
