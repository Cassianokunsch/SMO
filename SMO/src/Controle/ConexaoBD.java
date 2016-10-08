/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;

/**
 *
 * @author Cassiano kunsch
 */
public class ConexaoBD {
    
    public Statement stm; //RESPONSAVEL PELA PESQUISA NO BANCO
    public ResultSet rs; //ARMAZENA O RESULTADO DA PESQUISA NO BANCO
    private String driver; //IDENTIFICA O SERVIÇO DO BANCO
    private String caminho; //SETAR O LOCAL
    private String usuario; //USUARIO DO POSTGRES
    private String senha; //SENHA DO BANCO
    public Connection con; //RESPONSAVEL PELA CONEXAO
    
}
