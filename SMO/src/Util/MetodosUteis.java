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
 * Métodos úteis para manipular os dados
 * @author Cassiano kunsch
 */
public class MetodosUteis {
    
    
    /**
     * A função recebe uma string e transforma ela em data para enviar para o
     * banco de dados.
     * @param data
     * @return data
     * @throws Exception 
     */
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
    
    /**
     * A função recebe uma data pega do banco nesse formato 1995-06-12
     * e transforma em uma string 12061995 para por na tela de cadastro
     * @param data
     * @return 
     */
    public static String arrumaData(Date data){
        String dataAux = String.valueOf(data).replace("-", "");
        dataAux = dataAux.substring(6, 8) + dataAux.substring(4, 6) + dataAux.substring(0, 4);
        return dataAux;
    }
    
    /**
     * A função recebe uma string no formato 12:13 e retorna um tipo Time para
     * colocar no banco
     * @param time
     * @return
     * @throws Exception 
     */
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
