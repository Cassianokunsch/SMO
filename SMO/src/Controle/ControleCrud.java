/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Model.Motorista;
import ModelDao.MotoristaDao;
import Util.TabelaDados;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import visaoo.TelaCrud;
import visaoo.TelasCadastro.TelaCadMotorista;
import visaoo.TelasUpdate.TelaUpdateMotorista;

/**
 *
 * @author Cassiano kunsch
 */
public class ControleCrud {

    private final TelaCrud telacrud;
    private MotoristaDao motoristaDao;
    private final String opcao;

    public ControleCrud(String opcao) {
        this.opcao = opcao;
        this.motoristaDao = new MotoristaDao();
        telacrud = new TelaCrud();
        telacrud.setBoard(this.opcao);
        selectAtt(this.opcao);
        setActions();
    }

    public void showCrud() {
        telacrud.setVisible(true);
    }

    public void selectAtt(String tipo) {
        if ("Motorista".equals(tipo)) {
            atualiza();
        }
    }

    public void setActions() {
        actionButtonCadastrar();
    }

    private void actionButtonCadastrar() {
        JButton buttonCadastrar = telacrud.getButtonCadastrar();
        buttonCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ("Motorista".equals(opcao)) {
                    ControleCadMotorista controle = new ControleCadMotorista();
                    controle.showTelaCadMotorista();
                }
                telacrud.setVisible(false);
            }
        });
    }

    private void actionButtonEditar() {
        JButton buttonCadastrar = telacrud.getButtonCadastrar();
        buttonCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ("Motorista".equals(opcao)) {
                    String id = String.valueOf(telacrud.getjTable().getModel().getValueAt(telacrud.getjTable().getSelectedRow(), 0));
                    List result = motoristaDao.getDados(Motorista.class, "pessoa", id);
                    ControleUpdateMotorista controleUpdateMotorista = new ControleUpdateMotorista(result);
                    controleUpdateMotorista.showTelaUpdateMotorista();
                    //TelaUpdateMotorista telaUpdateMotorista = new TelaUpdateMotorista(result);
                    //telaUpdateMotorista.setVisible(true);
                }
                telacrud.setVisible(false);
            }
        });
    }

    private void actionButtonExcluir() {
        JButton buttonCadastrar = telacrud.getButtonCadastrar();
        buttonCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TelaCadMotorista tela = new TelaCadMotorista();
                tela.setVisible(true);
                telacrud.setVisible(false);
            }
        });
    }

    private void actionButtonVoltar() {
        JButton buttonCadastrar = telacrud.getButtonCadastrar();
        buttonCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    private void atualiza() {
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"ID", "Nome", "Endereço", "CEP",
            "Email", "CPF", "Cidade", "UF", "Telefone",
            "Bairro", "RG", "Nascimento", "CNH", "Validade CNH"};
        System.err.println("to aqui");
        List result = motoristaDao.listData();
        for (Iterator iterator = result.iterator(); iterator.hasNext();) {
            Motorista motorista = (Motorista) iterator.next();
            dados.add(new Object[]{motorista.getIdpessoa(), motorista.getNome(),
                motorista.getEndereco(), motorista.getCep(), motorista.getEmail(),
                motorista.getCpf(), motorista.getCidade(), motorista.getUf(),
                motorista.getTelefone(), motorista.getBairro(),
                motorista.getRg(), motorista.getNascimento(), motorista.getCnh(),
                motorista.getValidadeCnh()});
        }
        TabelaDados tabela = new TabelaDados(dados, colunas);
        JTable jTable = telacrud.getjTable();
        jTable.setModel(tabela);
        jTable.getTableHeader().setReorderingAllowed(false);
        jTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
}
