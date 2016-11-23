/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDao;

import Model.Usuario;
import java.util.List;
import org.hibernate.SQLQuery;
import org.hibernate.Session;

/**
 *
 * @author Cassiano kunsch
 */
public class UsuarioDao extends GenericDAOImpl {

    public Usuario findUser(String login, String password) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();        
        String sql = "SELECT * FROM usuario ";
        sql += "INNER JOIN pessoa ON pessoa.idpessoa = usuario.idpessoa";
        sql += " WHERE usuario.login = '" + login + "' AND usuario.senha = '" + password + "'";
        SQLQuery query = session.createSQLQuery(sql);
        query.addEntity(Usuario.class);
        List result = query.list();
        session.getTransaction().commit();
        if (!result.isEmpty()) {
            return (Usuario) result.get(0);
        } else {
            return null;
        }
    }

}
