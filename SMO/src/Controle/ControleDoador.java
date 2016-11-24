/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Model.Doador;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Cassiano kunsch
 */
public class ControleDoador {
//    SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
//
//    public void inserir(Doador doador) {
//        Session session = sessionFactory.openSession();
//        session.beginTransaction();
//        session.save(doador);
//        session.getTransaction().commit();
//    }
//    public void delete(String iddoador){
//        Session session = sessionFactory.openSession();
//        session.beginTransaction();
//        String sql = "DELETE FROM DOADOR WHERE IDDOADOR = '" + iddoador + "'";
//        SQLQuery query = session.createSQLQuery(sql);
//        query.addEntity(Doador.class);
//        int result = query.executeUpdate();
//        System.out.println("Rows affected: " + result);
//        session.getTransaction().commit();
//    }
//    public List getDados(String iddoador){
//           Session session = sessionFactory.openSession();
//          Transaction tx = null;
//          try{
//             tx = session.beginTransaction();
//             String sql = "SELECT * FROM DOADOR WHERE IDDOADOR = '" + iddoador +"'";
//             SQLQuery query = session.createSQLQuery(sql);
//             query.addEntity(Doador.class);
//             List result = query.list();
//             tx.commit();
//
//             return result;
//          }catch (HibernateException e) {
//             if (tx!=null) tx.rollback();
//             e.printStackTrace(); 
//          }finally {
//             session.close(); 
//          }
//          return null;
//    }
//    
//    public void update(String stringUpdate, int iddoador){
//        Session session = sessionFactory.openSession();
//        session.beginTransaction();
//        String sql = "UPDATE DOADOR set " + stringUpdate +
//             " WHERE IDDOADOR = '" + iddoador + "'";
//        SQLQuery query = session.createSQLQuery(sql);
//        query.addEntity(Doador.class);
//        int result = query.executeUpdate();
//        System.out.println("Rows affected: " + result);
//        session.getTransaction().commit();
//    }
//    
//   public List listaDoador( ){
//      Session session = sessionFactory.openSession();
//      Transaction tx = null;
//      try{
//         tx = session.beginTransaction();
//         String sql = "SELECT * FROM DOADOR ORDER BY NOME";
//         SQLQuery query = session.createSQLQuery(sql);
//         query.addEntity(Doador.class);
//         List result = query.list();
//         tx.commit();
//         
//         return result;
//      }catch (HibernateException e) {
//         if (tx!=null) tx.rollback();
//         e.printStackTrace(); 
//      }finally {
//         session.close(); 
//      }
//      return null;
//   }
    
}
