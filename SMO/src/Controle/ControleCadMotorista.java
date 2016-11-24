/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Model.Motorista;
import ModelDao.GenericDAOImpl;
import Util.MetodosUteis;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import visaoo.TelasCadastro.TelaCadMotorista;

/**
 *
 * @author Cassiano kunsch
 */
public class ControleCadMotorista {

    private final TelaCadMotorista telaCadMotorista;
    private Motorista motorista;
    private final GenericDAOImpl con;

    public ControleCadMotorista() {
        telaCadMotorista = new TelaCadMotorista();
        con = new GenericDAOImpl();
        setActions();
    }

    private void setActions() {
        actionButtonCadastra();
    }

    public void showTelaCadMotorista() {
        telaCadMotorista.setVisible(true);
    }

    public void actionButtonCadastra() {
        JButton buttonCadastrar = telaCadMotorista.getButtonCadastrar();
        buttonCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (verificaCampos()) {
                    con.insert(criaMotorista());
                    JOptionPane.showMessageDialog(null, "Motorista cadastrado!!!");
                    ControleCrud controleMotoristaCrud = new ControleCrud("Motorista");
                    controleMotoristaCrud.showCrud();
                    telaCadMotorista.setVisible(false);
                    ControleCrud controleCrud = new ControleCrud("Motorista");
                } else {
                    JOptionPane.showMessageDialog(null, "Todos os campos são obrigatorios!!!");
                }
            }
        });
    }

    public boolean verificaCampos() {
        if (!"".equals(telaCadMotorista.getjTextFieldEndereco().getText())
                && !"".equals(telaCadMotorista.getjTextFieldCep().getText())
                && !"".equals(telaCadMotorista.getjTextFieldNome().getText())
                && !"".equals(telaCadMotorista.getjTextFieldEmail().getText())
                && !"".equals(telaCadMotorista.getjTextFieldCpf().getText())
                && !"".equals(telaCadMotorista.getjTextFieldCidade().getText())
                && !"".equals(telaCadMotorista.getjTextFieldTelefone().getText())
                && !"".equals(telaCadMotorista.getjTextFieldCnh().getText())
                && !"".equals(telaCadMotorista.getjTextFieldBairro().getText())
                && !"".equals(telaCadMotorista.getjTextFieldRg().getText())
                && !"".equals(telaCadMotorista.getjTextFieldNascimento().getText())
                && !"".equals(telaCadMotorista.getjTextFieldValidadeCnh().getText())) {
            return true;
        } else {
            return false;
        }
    }

    public Motorista criaMotorista() {
        motorista = new Motorista();
        motorista.setEndereco(telaCadMotorista.getjTextFieldEndereco().getText());
        motorista.setCep(telaCadMotorista.getjTextFieldCep().getText());
        motorista.setNome(telaCadMotorista.getjTextFieldNome().getText());
        motorista.setEmail(telaCadMotorista.getjTextFieldEmail().getText());
        motorista.setCpf(telaCadMotorista.getjTextFieldCpf().getText());
        motorista.setCidade(telaCadMotorista.getjTextFieldCidade().getText());
        motorista.setUf(String.valueOf(telaCadMotorista.getjComboBoxUf().getSelectedItem()));
        motorista.setTelefone(telaCadMotorista.getjTextFieldTelefone().getText());
        motorista.setCnh(telaCadMotorista.getjTextFieldCnh().getText());
        motorista.setBairro(telaCadMotorista.getjTextFieldBairro().getText());
        motorista.setRg(telaCadMotorista.getjTextFieldRg().getText());
        try {
            motorista.setNascimento(MetodosUteis.formataData(telaCadMotorista.getjTextFieldNascimento().getText()));
            motorista.setValidadeCnh(MetodosUteis.formataData(telaCadMotorista.getjTextFieldValidadeCnh().getText()));
        } catch (Exception ex) {
            Logger.getLogger(TelaCadMotorista.class.getName()).log(Level.SEVERE, null, ex);
        }
        return motorista;
    }
}
