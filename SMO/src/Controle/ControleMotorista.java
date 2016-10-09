/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Model.Motorista;
import Util.NewHibernateUtil;
import java.util.Iterator;
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
public class ControleMotorista {

    //Motorista motorista = new Motorista();
    SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();

    public void inserir(Motorista motorista) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(motorista);
        session.getTransaction().commit();
    }
    public void delete(String idmotorista){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        String sql = "DELETE FROM MOTORISTA WHERE IDMOTORISTA = '" + idmotorista + "'";
        SQLQuery query = session.createSQLQuery(sql);
        query.addEntity(Motorista.class);
        int result = query.executeUpdate();
        System.out.println("Rows affected: " + result);
        session.getTransaction().commit();
    }
    public List getDados(String idmotorista){
           Session session = sessionFactory.openSession();
          Transaction tx = null;
          try{
             tx = session.beginTransaction();
             String sql = "SELECT * FROM MOTORISTA WHERE IDMOTORISTA = '" + idmotorista +"'";
             SQLQuery query = session.createSQLQuery(sql);
             query.addEntity(Motorista.class);
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
        String sql = "UPDATE MOTORISTA set " + stringUpdate +
             " WHERE IDMOTORISTA = '" + idmotorista + "'";
        SQLQuery query = session.createSQLQuery(sql);
        query.addEntity(Motorista.class);
        int result = query.executeUpdate();
        System.out.println("Rows affected: " + result);
        session.getTransaction().commit();
    }
    
    /* Method to  READ all the employees using Entity Query */
   public List listaMotorista( ){
      Session session = sessionFactory.openSession();
      Transaction tx = null;
      try{
         tx = session.beginTransaction();
         String sql = "SELECT * FROM MOTORISTA ORDER BY NOME";
         SQLQuery query = session.createSQLQuery(sql);
         query.addEntity(Motorista.class);
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
