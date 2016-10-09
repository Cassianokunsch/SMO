/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Model.Responsavel;
import Util.NewHibernateUtil;
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
public class ControleResponsavel {    
    
    SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();

    public void inserir(Responsavel responsavel) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(responsavel);
        session.getTransaction().commit();
    }
    public void delete(String idmotorista){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        String sql = "DELETE FROM RESPONSAVEL WHERE IDRESPONSAVEL = '" + idmotorista + "'";
        SQLQuery query = session.createSQLQuery(sql);
        query.addEntity(Responsavel.class);
        int result = query.executeUpdate();
        System.out.println("Rows affected: " + result);
        session.getTransaction().commit();
    }
    public List getDados(String idresponsavel){
           Session session = sessionFactory.openSession();
          Transaction tx = null;
          try{
             tx = session.beginTransaction();
             String sql = "SELECT * FROM RESPONSAVEL WHERE IDRESPONSAVEL = '" + idresponsavel +"'";
             SQLQuery query = session.createSQLQuery(sql);
             query.addEntity(Responsavel.class);
             
             List result = query.list();
             tx.commit();

             return result;
          }catch (HibernateException e) {
             if (tx!=null) tx.rollback();
             e.printStackTrace(); 
          }finally {
             session.close(); 
          }
          return null;
    }
    
    public void update(String stringUpdate, int idmotorista){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        String sql = "UPDATE RESPONSAVEL set " + stringUpdate +
             " WHERE IDRESPONSAVEL = '" + idmotorista + "'";
        SQLQuery query = session.createSQLQuery(sql);
        query.addEntity(Responsavel.class);
        int result = query.executeUpdate();
        System.out.println("Rows affected: " + result);
        session.getTransaction().commit();
    }
    
    /* Method to  READ all the employees using Entity Query */
   public List listaResponsavel( ){
      Session session = sessionFactory.openSession();
      Transaction tx = null;
      try{
         tx = session.beginTransaction();
         String sql = "SELECT * FROM RESPONSAVEL ORDER BY NOME";
         SQLQuery query = session.createSQLQuery(sql);
         query.addEntity(Responsavel.class);
         List result = query.list();
         tx.commit();
         
         return result;
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }finally {
         session.close(); 
      }
      return null;
   }
    
}
