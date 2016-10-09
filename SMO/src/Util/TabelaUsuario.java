/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Cassiano kunsch
 */
public class TabelaUsuario extends AbstractTableModel{
    
    private ArrayList linhas = null;
    private String [] colunas = null;
    
    public TabelaUsuario(ArrayList linha, String [] coluna){
        setLinhas(linha);
        setColunas(coluna);
    }
    
    public ArrayList getLinhas() {
        return linhas;
    }

    public void setLinhas(ArrayList linhas) {
        this.linhas = linhas;
    }

    public String[] getColunas() {
        return colunas;
    }

    public void setColunas(String[] colunas) {
        this.colunas = colunas;
    }

    @Override
    public int getRowCount() {
        return linhas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }
    
    @Override
    public String getColumnName(int numCol){
        return colunas[numCol];
    }

    @Override
    public Object getValueAt(int numLinha, int numColuna) {
        Object [] linha = (Object [])getLinhas().get(numLinha);
        return linha[numColuna];
    }
    
}