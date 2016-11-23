/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDao;

import org.hibernate.HibernateException;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author Cassiano kunsch
 */
public class DBConnection {

    private static SessionFactory sessionFactory = null;
    
    private DBConnection(){
        
    }
    
    public static synchronized SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
            } catch (HibernateException ex) {
                System.err.println("Initial SessionFactory creation failed." + ex);
                throw new ExceptionInInitializerError(ex);
            }
        }
        return sessionFactory;
    }
}
