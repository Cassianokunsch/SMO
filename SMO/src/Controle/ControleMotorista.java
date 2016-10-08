/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Model.Motorista;
import Util.NewHibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Cassiano kunsch
 */
public class ControleMotorista {
    //Motorista motorista = new Motorista();
    
    public void inserir(Motorista motorista){
        System.out.println("passou aqui1");
        SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(motorista);
        session.getTransaction().commit();
        System.out.println("passou aqui2");
    }
    
}
