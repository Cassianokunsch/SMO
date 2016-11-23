/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDao;

import Model.Doador;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Cassiano kunsch
 */
public class GenericDAOImpl implements GenericDAO {

    SessionFactory sessionFactory = DBConnection.getSessionFactory();

    public void insert(Object object) {
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.save(object);
            tx.commit();

        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }
    }

    public void delete(Object object, String table, String id) {
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            String sql = "UPDATE " + table + " set d_e_l_e_t_e = '1' WHERE ID" + table + "= '" + id + "'";
            System.out.println(sql);
            SQLQuery query = session.createSQLQuery(sql);
            query.addEntity(object.getClass());
            query.executeUpdate();
            tx.commit();

        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }
    }

    public List getDados(Class object, String table, String id) {
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            String sql = "SELECT * FROM " + table + " WHERE ID" + table + " = '" + id + "'";
            SQLQuery query = session.createSQLQuery(sql);
            query.addEntity(object);
            List result = query.list();
            tx.commit();

            return result;
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }
        return null;
    }

    public void update(Class clazz, String table, String id, String stringUpdate) {
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            session.beginTransaction();
            String sql = "UPDATE " + table + " set " + stringUpdate
                    + " WHERE ID" + table + " = '" + id + "'";
            SQLQuery query = session.createSQLQuery(sql);
            query.addEntity(clazz);
            int result = query.executeUpdate();
            System.out.println("Rows affected: " + result);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }
    }

    public List listData(Class clazz, String table) {
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            String sql = "SELECT * FROM " + table + " WHERE D_E_L_E_T_E = '0' ORDER BY NOME";
            SQLQuery query = session.createSQLQuery(sql);
            query.addEntity(clazz);
            List result = query.list();
            tx.commit();
            return result;
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }
        return null;
    }
}
