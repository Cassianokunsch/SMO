/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDao;

import Model.Motorista;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Cassiano kunsch
 */
public class MotoristaDao extends GenericDAOImpl{
    
    public List listData(){
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            String sql = "SELECT * FROM motorista ";
            sql += "INNER JOIN pessoa ON motorista.idpessoa = pessoa.idpessoa ";
            sql += "ORDER BY NOME";
            SQLQuery query = session.createSQLQuery(sql);
            query.addEntity(Motorista.class);
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
