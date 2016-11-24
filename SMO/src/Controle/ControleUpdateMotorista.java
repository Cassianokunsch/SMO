/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Model.Motorista;
import ModelDao.GenericDAOImpl;
import static Util.MetodosUteis.arrumaData;
import visaoo.TelaMotorista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import visaoo.TelasUpdate.TelaUpdateMotorista;

/**
 *
 * @author Cassiano kunsch
 */
public class ControleUpdateMotorista {

    private TelaUpdateMotorista telaUpdateMotorista;
    private Motorista motorista;
    private GenericDAOImpl con;

    public ControleUpdateMotorista(List result) {
        motorista = (Motorista) result.get(0);
        con = new GenericDAOImpl();
        setCampos();
    }
    
    public void showTelaUpdateMotorista(){
        this.telaUpdateMotorista.setVisible(true);
    }

    private void actionButtonAtualiza() {
//        JButton buttonAtualizar = telaUpdateMotorista.getjButtonAtualizaMoto();
//        buttonAtualizar.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                if (verificaCampos()) {
//                    if (comparaCampos() != null) {
//                        con.update(Motorista.class, "motorista", String.valueOf(motorista.getIdpessoa()), comparaCampos());
//                        JOptionPane.showMessageDialog(null, "Dados atualizados!");
//                    } else {
//                        JOptionPane.showMessageDialog(null, "Nenhum dado alterado!");
//                    }
//                    //TelaMotorista telaMotorista = new TelaMotorista(usuario);
//                    //telaMotorista.setVisible(true);
//                    //dispose();
//                } else {
//                    JOptionPane.showMessageDialog(null, "Todos os campos são obrigatorios!!!");
//                }
//            }
//        });
    }

    private void setCampos() {
        telaUpdateMotorista.getjTextFieldEndereco().setText(motorista.getEndereco());
        telaUpdateMotorista.getjTextFieldCep().setText(motorista.getCep());
        telaUpdateMotorista.getjTextFieldNome().setText(motorista.getNome());
        telaUpdateMotorista.getjTextFieldEmail().setText(motorista.getEmail());
        telaUpdateMotorista.getjTextFieldCpf().setText(motorista.getCpf());
        telaUpdateMotorista.getjTextFieldCidade().setText(motorista.getCidade());
        for (int i = 0; i < telaUpdateMotorista.getjComboBoxUf().getModel().getSize(); i++) {
            if (motorista.getUf().equals(telaUpdateMotorista.getjComboBoxUf().getModel().getElementAt(i))) {
                telaUpdateMotorista.getjComboBoxUf().setSelectedIndex(i);
            }
        }
        telaUpdateMotorista.getjTextFieldTelefone().setText(motorista.getTelefone());
        telaUpdateMotorista.getjTextFieldCnh().setText(motorista.getCnh());
        telaUpdateMotorista.getjTextFieldBairro().setText(motorista.getBairro());
        telaUpdateMotorista.getjTextFieldRg().setText(motorista.getRg());
        telaUpdateMotorista.getjTextFieldNascimento().setText(arrumaData(motorista.getNascimento()));
        telaUpdateMotorista.getjTextFieldValidadeCnh().setText(arrumaData(motorista.getValidadeCnh()));
    }

    public boolean verificaCampos() {
        if (!"".equals(telaUpdateMotorista.getjTextFieldEndereco().getText())
                && !"".equals(telaUpdateMotorista.getjTextFieldCep().getText())
                && !"".equals(telaUpdateMotorista.getjTextFieldNome().getText())
                && !"".equals(telaUpdateMotorista.getjTextFieldEmail().getText())
                && !"".equals(telaUpdateMotorista.getjTextFieldCpf().getText())
                && !"".equals(telaUpdateMotorista.getjTextFieldCidade().getText())
                && !"".equals(telaUpdateMotorista.getjTextFieldTelefone().getText())
                && !"".equals(telaUpdateMotorista.getjTextFieldCnh().getText())
                && !"".equals(telaUpdateMotorista.getjTextFieldBairro().getText())
                && !"".equals(telaUpdateMotorista.getjTextFieldRg().getText())
                && !"".equals(telaUpdateMotorista.getjTextFieldNascimento().getText())
                && !"".equals(telaUpdateMotorista.getjTextFieldValidadeCnh().getText())) {
            return true;
        } else {
            return false;
        }
    }

    private String comparaCampos() {
        ArrayList<String> list = new ArrayList();
        if (!telaUpdateMotorista.getjTextFieldNome().getText().equalsIgnoreCase(motorista.getNome())) {
            list.add("NOME = '" + telaUpdateMotorista.getjTextFieldNome().getText() + "'");
        }
        if (!telaUpdateMotorista.getjTextFieldEndereco().getText().equalsIgnoreCase(motorista.getEndereco())) {
            list.add("ENDERECO = '" + telaUpdateMotorista.getjTextFieldEndereco().getText() + "'");
        }
        if (!telaUpdateMotorista.getjTextFieldCep().getText().equalsIgnoreCase(motorista.getCep())) {
            list.add("CEP = '" + telaUpdateMotorista.getjTextFieldCep().getText() + "'");
        }
        if (!telaUpdateMotorista.getjTextFieldEmail().getText().equalsIgnoreCase(motorista.getEmail())) {
            list.add("EMAIL ='" + telaUpdateMotorista.getjTextFieldEmail().getText() + "'");
        }
        if (!telaUpdateMotorista.getjTextFieldCpf().getText().equalsIgnoreCase(motorista.getCpf())) {
            list.add("CPF ='" + telaUpdateMotorista.getjTextFieldCpf().getText() + "'");
        }
        if (!telaUpdateMotorista.getjTextFieldCidade().getText().equalsIgnoreCase(motorista.getCidade())) {
            list.add("CIDADE ='" + telaUpdateMotorista.getjTextFieldCidade().getText() + "'");
        }
        if (!String.valueOf(telaUpdateMotorista.getjComboBoxUf().getSelectedItem()).equalsIgnoreCase(motorista.getUf())) {
            list.add("UF ='" + String.valueOf(telaUpdateMotorista.getjComboBoxUf().getSelectedItem()) + "'");
        }
        if (!telaUpdateMotorista.getjTextFieldTelefone().getText().equalsIgnoreCase(motorista.getTelefone())) {
            list.add("TELEFONE ='" + telaUpdateMotorista.getjTextFieldTelefone().getText() + "'");
        }
        if (!telaUpdateMotorista.getjTextFieldCnh().getText().equalsIgnoreCase(motorista.getCnh())) {
            list.add("CNH ='" + telaUpdateMotorista.getjTextFieldCnh().getText() + "'");
        }
        if (!telaUpdateMotorista.getjTextFieldBairro().getText().equalsIgnoreCase(motorista.getBairro())) {
            list.add("BAIRRO ='" + telaUpdateMotorista.getjTextFieldBairro().getText() + "'");
        }
        if (!telaUpdateMotorista.getjTextFieldRg().getText().equalsIgnoreCase(motorista.getRg())) {
            list.add("RG ='" + telaUpdateMotorista.getjTextFieldRg().getText() + "'");
        }
//        try {
//            Date dataNascimento = formataData(jTextFieldNascimento.getText());
//            Date dataValidadeCnh = formataData(jTextFieldValidadeCnh.getText());            
//            if (dataNascimento != motorista.getNascimento()){
//                list.add("NASCIMENTO ='" + dataNascimento + "'");
//            }
//            if (dataValidadeCnh != motorista.getValidadeCnh()){
//                list.add("VALIDADE_CNH ='" + dataValidadeCnh + "'");
//            }
//        } catch (Exception ex) {
//            Logger.getLogger(TelaUpdateMotorista.class.getName()).log(Level.SEVERE, null, ex);
//        }

        String sql = "";
        for (String string : list) {
            sql += string + ", ";
        }
        sql += "#";
        if ("#".equals(sql)) {
            return null;
        } else {
            return sql.replace(", #", "");
        }
    }
}
