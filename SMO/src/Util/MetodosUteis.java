/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Cassiano kunsch
 */
public class MetodosUteis {
    
    public static java.sql.Date formataData(String data) throws Exception {
        java.sql.Date date = null;
     try {
         DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
         date = new java.sql.Date( ((java.util.Date)formatter.parse(data)).getTime() );
     } catch (ParseException e) {            
         throw e;
     }
     return date;
    }
    
    public static String arrumaData(Date data){
        String dataAux = String.valueOf(data).replace("-", "");
        dataAux = dataAux.substring(6, 8) + dataAux.substring(4, 6) + dataAux.substring(0, 4);
        return dataAux;
    }
    
    public static Time time(String time) throws Exception{
        try {
            DateFormat formatter = new SimpleDateFormat("HH:mm");
            java.sql.Time timeValue = new java.sql.Time(formatter.parse(time).getTime());
            return timeValue;
        } catch (ParseException e) {
            throw e;
        }
    }
    
}
