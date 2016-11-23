/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Model.Usuario;
import ModelDao.UsuarioDao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import visao.TelaLogin;

/**
 *
 * @author Cassiano kunsch
 */
public class ControleLogin {

    private TelaLogin telaLogin;
    UsuarioDao usuarioDao;

    public ControleLogin() {
        this.usuarioDao = new UsuarioDao();
        this.telaLogin = new TelaLogin();
        JButton login = this.telaLogin.getLoginButton();

        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Usuario user = new Usuario();
                user.setLogin(telaLogin.getUserName());
                user.setSenha(telaLogin.getPassword());
                if (login(user)) {
                    ControlePrincipal controle = new ControlePrincipal();
                    controle.showTelaPrincipal();
                    telaLogin.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Usuário e senhas inválidos");
                }
            }
        });
    }

    public boolean login(Usuario usuario) {
        Usuario user = this.usuarioDao.findUser(
                usuario.getLogin(),
                usuario.getSenha());
        return user != null;
    }

    public boolean logout(Usuario usuario) {
        showLogin();
        return false;
    }

    public void showLogin() {
        this.telaLogin.setVisible(true);
    }
}
