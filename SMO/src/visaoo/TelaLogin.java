/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visaoo;

import javax.swing.JButton;

public class TelaLogin extends javax.swing.JFrame {

    public TelaLogin() {
        initComponents();
        this.setTitle("Tela de Login");
    }

    public String getUserName() {
        return jUsuario.getText();
    }

    public String getPassword() {
        return String.valueOf(jPassword.getPassword());
    }

    public JButton getLoginButton() {
        return this.acessarLogin;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sairLogin = new javax.swing.JButton();
        acessarLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jUsuario = new javax.swing.JTextField();
        jPassword = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        sairLogin.setText("Sair");
        getContentPane().add(sairLogin);
        sairLogin.setBounds(230, 190, 140, 30);

        acessarLogin.setText("Acessar");
        getContentPane().add(acessarLogin);
        acessarLogin.setBounds(91, 190, 130, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Usuário.:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(90, 120, 70, 22);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Senha.:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 150, 70, 26);
        getContentPane().add(jUsuario);
        jUsuario.setBounds(170, 120, 200, 25);
        getContentPane().add(jPassword);
        jPassword.setBounds(170, 150, 200, 26);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fundoLogin.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 460, 350);

        setSize(new java.awt.Dimension(476, 388));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acessarLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JTextField jUsuario;
    private javax.swing.JButton sairLogin;
    // End of variables declaration//GEN-END:variables
}
