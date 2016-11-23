/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import visao.TelasCadastro.TelaCadDoador;
import visao.VisaoCrud;

/**
 *
 * @author Cassiano kunsch
 */
public class ControleDoardorCrud {
    
    private final VisaoCrud visaoCrud;
    
    public ControleDoardorCrud(){
        visaoCrud = new VisaoCrud();
        visaoCrud.setBoard("Doador");
        setActions();
    }

    private void setActions() {
        actionButtonCadastrar();        
    }
    
    private void actionButtonCadastrar(){
        JButton buttonCadastrar = visaoCrud.getButtonCadastrar();
        buttonCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TelaCadDoador tela = new TelaCadDoador(null);
                tela.setVisible(true);
                visaoCrud.setVisible(false);
            }
        });
    }
}
