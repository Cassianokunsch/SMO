/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Model.Usuario;
import Util.NewHibernateUtil;
import java.util.List;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Cassiano kunsch
 */
public class ControleLogin {
    
    SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
    
    public List findUser(String login){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        String sql = "SELECT * FROM USUARIO WHERE LOGIN = '" + login + "'";
        SQLQuery query = session.createSQLQuery(sql);
        query.addEntity(Usuario.class);
        List result = query.list();
        session.getTransaction().commit();
        
        return result;
    }
    
}
