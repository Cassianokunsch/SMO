/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;
import Visao.TelaMotorista;
import Visao.TelaPrincipal;

/**
 *
 * @author Cassiano kunsch
 */
public class ControlePrincipal {

    private final TelaPrincipal visaoPrincipal;

    public ControlePrincipal() {
        this.visaoPrincipal = new TelaPrincipal();
        setActions();
    }

    public void showTelaPrincipal() {
        this.visaoPrincipal.setVisible(true);
    }

    private void setActions() {
        actionMotorista();
        actionReceptor();
        actionDoador();
        actionResponsavel();
        actionOrgao();
        actionAparelho();
        actionSair();
    }

    public void actionMotorista() {
        JMenuItem menuItemMotorista = visaoPrincipal.getjMenuItemMotorista();
        menuItemMotorista.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //ControleMotoristaCrud controleMotoristaCrud = new ControleMotoristaCrud();
                ControleCrud controleCrud = new ControleCrud("Motorista");
                controleCrud.showCrud();                        
                visaoPrincipal.setVisible(false);
            }
        });
    }

    public void actionReceptor() {
        JMenuItem menuItemReceptor = visaoPrincipal.getjMenuItemReceptor();
        menuItemReceptor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TelaMotorista motorista = new TelaMotorista(null);
                motorista.setVisible(true);
                visaoPrincipal.setVisible(false);
            }
        });
    }

    public void actionDoador() {
        JMenuItem menuItemDoador = visaoPrincipal.getjMenuItemDoador();
        menuItemDoador.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ControleDoardorCrud controleDoadorCrud = new ControleDoardorCrud();
                visaoPrincipal.setVisible(false);
            }
        });
    }

    public void actionResponsavel() {
        JMenuItem menuItemResponsavel = visaoPrincipal.getjMenuItemResponsavel();
        menuItemResponsavel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TelaMotorista motorista = new TelaMotorista(null);
                motorista.setVisible(true);
                visaoPrincipal.setVisible(false);
            }
        });
    }

    public void actionOrgao() {
        JMenuItem menuItemOrgao = visaoPrincipal.getjMenuItemOrgao();
        menuItemOrgao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TelaMotorista motorista = new TelaMotorista(null);
                motorista.setVisible(true);
                visaoPrincipal.setVisible(false);
            }
        });
    }

    public void actionAparelho() {
        JMenuItem menuItemAparelho = visaoPrincipal.getjMenuItemAparelho();
        menuItemAparelho.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TelaMotorista motorista = new TelaMotorista(null);
                motorista.setVisible(true);
                visaoPrincipal.setVisible(false);
            }
        });
    }

    public void actionSair() {
        JMenuItem menuItemSair = visaoPrincipal.getjMenuItemSair();
        menuItemSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TelaMotorista motorista = new TelaMotorista(null);
                motorista.setVisible(true);
                visaoPrincipal.setVisible(false);
            }
        });
    }
}
