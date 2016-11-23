/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visaoo;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();
        this.setTitle("Tela principal");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuUsuario = new javax.swing.JMenu();
        jMenuItemMotorista = new javax.swing.JMenuItem();
        jMenuItemReceptor = new javax.swing.JMenuItem();
        jMenuItemDoador = new javax.swing.JMenuItem();
        jMenuItemResponsavel = new javax.swing.JMenuItem();
        jMenuItemOrgao = new javax.swing.JMenuItem();
        jMenuItemAparelho = new javax.swing.JMenuItem();
        jMenuAcoes = new javax.swing.JMenu();
        jMenuItemMonitorar = new javax.swing.JMenuItem();
        jMenuItemRelatorio = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);

        jMenuCadastro.setText("Cadastros");

        jMenuUsuario.setText("Usuários");

        jMenuItemMotorista.setText("Motorista");
        jMenuUsuario.add(jMenuItemMotorista);

        jMenuItemReceptor.setText("Receptor");
        jMenuUsuario.add(jMenuItemReceptor);

        jMenuItemDoador.setText("Doador");
        jMenuUsuario.add(jMenuItemDoador);

        jMenuItemResponsavel.setText("Responsável");
        jMenuUsuario.add(jMenuItemResponsavel);

        jMenuCadastro.add(jMenuUsuario);

        jMenuItemOrgao.setText("Orgãos");
        jMenuCadastro.add(jMenuItemOrgao);

        jMenuItemAparelho.setText("Aparelho");
        jMenuCadastro.add(jMenuItemAparelho);

        jMenuBar1.add(jMenuCadastro);

        jMenuAcoes.setText("Ações");

        jMenuItemMonitorar.setText("Monitorar Orgão");
        jMenuAcoes.add(jMenuItemMonitorar);

        jMenuItemRelatorio.setText("Gerar Relatório");
        jMenuAcoes.add(jMenuItemRelatorio);

        jMenuBar1.add(jMenuAcoes);

        jMenuSair.setText("Sair");

        jMenuItemSair.setText("Sair");
        jMenuSair.add(jMenuItemSair);

        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 834, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 418, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(850, 476));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenuAcoes;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenuItem jMenuItemAparelho;
    private javax.swing.JMenuItem jMenuItemDoador;
    private javax.swing.JMenuItem jMenuItemMonitorar;
    private javax.swing.JMenuItem jMenuItemMotorista;
    private javax.swing.JMenuItem jMenuItemOrgao;
    private javax.swing.JMenuItem jMenuItemReceptor;
    private javax.swing.JMenuItem jMenuItemRelatorio;
    private javax.swing.JMenuItem jMenuItemResponsavel;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JMenu jMenuUsuario;
    // End of variables declaration//GEN-END:variables

    public JMenu getjMenuAcoes() {
        return jMenuAcoes;
    }

    public void setjMenuAcoes(JMenu jMenuAcoes) {
        this.jMenuAcoes = jMenuAcoes;
    }

    public JMenuItem getjMenuItemAparelho() {
        return jMenuItemAparelho;
    }

    public void setjMenuItemAparelho(JMenuItem jMenuItemAparelho) {
        this.jMenuItemAparelho = jMenuItemAparelho;
    }

    public JMenuItem getjMenuItemDoador() {
        return jMenuItemDoador;
    }

    public void setjMenuItemDoador(JMenuItem jMenuItemDoador) {
        this.jMenuItemDoador = jMenuItemDoador;
    }

    public JMenuItem getjMenuItemMonitorar() {
        return jMenuItemMonitorar;
    }

    public void setjMenuItemMonitorar(JMenuItem jMenuItemMonitorar) {
        this.jMenuItemMonitorar = jMenuItemMonitorar;
    }

    public JMenuItem getjMenuItemMotorista() {
        return jMenuItemMotorista;
    }

    public void setjMenuItemMotorista(JMenuItem jMenuItemMotorista) {
        this.jMenuItemMotorista = jMenuItemMotorista;
    }

    public JMenuItem getjMenuItemOrgao() {
        return jMenuItemOrgao;
    }

    public void setjMenuItemOrgao(JMenuItem jMenuItemOrgao) {
        this.jMenuItemOrgao = jMenuItemOrgao;
    }

    public JMenuItem getjMenuItemReceptor() {
        return jMenuItemReceptor;
    }

    public void setjMenuItemReceptor(JMenuItem jMenuItemReceptor) {
        this.jMenuItemReceptor = jMenuItemReceptor;
    }

    public JMenuItem getjMenuItemRelatorio() {
        return jMenuItemRelatorio;
    }

    public void setjMenuItemRelatorio(JMenuItem jMenuItemRelatorio) {
        this.jMenuItemRelatorio = jMenuItemRelatorio;
    }

    public JMenuItem getjMenuItemResponsavel() {
        return jMenuItemResponsavel;
    }

    public void setjMenuItemResponsavel(JMenuItem jMenuItemResponsavel) {
        this.jMenuItemResponsavel = jMenuItemResponsavel;
    }

    public JMenuItem getjMenuItemSair() {
        return jMenuItemSair;
    }

    public void setjMenuItemSair(JMenuItem jMenuItemSair) {
        this.jMenuItemSair = jMenuItemSair;
    }
}
