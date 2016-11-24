/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Model.Usuario;
//import Util.NewHibernateUtil;
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
public class ControleUsuario {
//    SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
//
//    public void inserir(Usuario usuario) {
//        Session session = sessionFactory.openSession();
//        session.beginTransaction();
//        session.save(usuario);
//        session.getTransaction().commit();
//    }
//    public void delete(String idusuario){
//        Session session = sessionFactory.openSession();
//        session.beginTransaction();
//        String sql = "DELETE FROM USUARIO WHERE IDUSUARIO = '" + idusuario + "'";
//        SQLQuery query = session.createSQLQuery(sql);
//        query.addEntity(Usuario.class);
//        int result = query.executeUpdate();
//        System.out.println("Rows affected: " + result);
//        session.getTransaction().commit();
//    }
//    public List getDados(String idusuario){
//           Session session = sessionFactory.openSession();
//          Transaction tx = null;
//          try{
//             tx = session.beginTransaction();
//             String sql = "SELECT * FROM USUARIO WHERE IDUSUARIO = '" + idusuario +"'";
//             SQLQuery query = session.createSQLQuery(sql);
//             query.addEntity(Usuario.class);             
//             List result = query.list();
//             tx.commit();
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
//    public void update(String stringUpdate, int idusuario){
//        Session session = sessionFactory.openSession();
//        session.beginTransaction();
//        String sql = "UPDATE USUARIO set " + stringUpdate +
//             " WHERE IDUSUARIO = '" + idusuario + "'";
//        SQLQuery query = session.createSQLQuery(sql);
//        query.addEntity(Usuario.class);
//        int result = query.executeUpdate();
//        System.out.println("Rows affected: " + result);
//        session.getTransaction().commit();
//    }
//    
//   public List listaUsuario( ){
//      Session session = sessionFactory.openSession();
//      Transaction tx = null;
//      try{
//         tx = session.beginTransaction();
//         String sql = "SELECT * FROM USUARIO ORDER BY NOME";
//         SQLQuery query = session.createSQLQuery(sql);
//         query.addEntity(Usuario.class);
//         List result = query.list();
//         tx.commit();
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
