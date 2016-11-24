/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import ModelDao.GenericDAOImpl;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import visaoo.TelaCrud;
import visaoo.TelasCadastro.TelaCadMotorista;

/**
 *
 * @author Cassiano kunsch
 */
public class ControleMotoristaCrud {

    private final TelaCrud visaoCrud;
    private GenericDAOImpl con;

    public ControleMotoristaCrud() {
        visaoCrud = new TelaCrud();
        visaoCrud.setVisible(true);
        visaoCrud.setBoard("Motorista");
        setActions();
    }

    private void setActions() {
        actionButtonCadastrar();
    }

    private void actionButtonCadastrar() {
        JButton buttonCadastrar = visaoCrud.getButtonCadastrar();
        buttonCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ControleCadMotorista controle = new ControleCadMotorista();
                visaoCrud.setVisible(false);
            }
        });
    }

    private void actionButtonEditar() {
        JButton buttonCadastrar = visaoCrud.getButtonCadastrar();
        buttonCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TelaCadMotorista tela = new TelaCadMotorista();
                tela.setVisible(true);
                visaoCrud.setVisible(false);
            }
        });
    }

    private void actionButtonExcluir() {
        JButton buttonCadastrar = visaoCrud.getButtonCadastrar();
        buttonCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TelaCadMotorista tela = new TelaCadMotorista();
                tela.setVisible(true);
                visaoCrud.setVisible(false);
            }
        });
    }

    private void actionButtonVoltar() {
        JButton buttonCadastrar = visaoCrud.getButtonCadastrar();
        buttonCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

//    private void atualiza() {
//        ArrayList dados = new ArrayList();
//        String[] colunas = new String[]{"ID", "Nome", "Login", "Endereço", "CEP",
//            "Email", "CPF", "Cidade", "UF", "Telefone",
//            "Bairro", "RG", "Nascimento"};
//        List result = con.listDate(new Motorista(), "MOTORISTA");
//        for (Iterator iterator = result.iterator(); iterator.hasNext();) {
//            Usuario usuario = (Usuario) iterator.next();
//            dados.add(new Object[]{usuario.getIdusuario(), usuario.getNome(),
//                usuario.getLogin(), usuario.getEndereco(), usuario.getCep(), usuario.getEmail(),
//                usuario.getCpf(), usuario.getCidade(), usuario.getUf(),
//                usuario.getTelefone(), usuario.getBairro(),
//                usuario.getRg(), usuario.getNascimento()});
//        }
//        TabelaDados tabela = new TabelaDados(dados, colunas);
//        JTable jTable = visaoCrud.getjTableUsuario();
//        jTable.setModel(tabela);
//        jTable.getTableHeader().setReorderingAllowed(false);
//        jTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
//    }
}
