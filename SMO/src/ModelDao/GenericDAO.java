/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDao;

import java.util.List;

/**
 *
 * @author Cassiano kunsch
 */
public interface GenericDAO {

    public void insert(Object object);

    public void delete(Object object, String table, String id);

    public List getDados(Class object, String table, String id);

    public void update(Class clazz, String table, String id, String stringUpdate);

    public List listData(Class clazz, String table);

}
