package Model;
// Generated Oct 9, 2016 7:43:41 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private int idusuario;
     private String nome;
     private String cpf;
     private String endereco;
     private String telefone;
     private String senha;
     private String rg;
     private String cep;
     private String uf;
     private String cidade;
     private String login;
     private String email;
     private Date nascimento;
     private String bairro;
     private Set transplantes = new HashSet(0);
     private Set orgaos = new HashSet(0);
     private Set responsavels = new HashSet(0);
     private Set doadors = new HashSet(0);
     private Set receptors = new HashSet(0);

    public Usuario() {
    }

	
    public Usuario(int idusuario) {
        this.idusuario = idusuario;
    }
    public Usuario(int idusuario, String nome, String cpf, String endereco, String telefone, String senha, String rg, String cep, String uf, String cidade, String login, String email, Date nascimento, String bairro, Set transplantes, Set orgaos, Set responsavels, Set doadors, Set receptors) {
       this.idusuario = idusuario;
       this.nome = nome;
       this.cpf = cpf;
       this.endereco = endereco;
       this.telefone = telefone;
       this.senha = senha;
       this.rg = rg;
       this.cep = cep;
       this.uf = uf;
       this.cidade = cidade;
       this.login = login;
       this.email = email;
       this.nascimento = nascimento;
       this.bairro = bairro;
       this.transplantes = transplantes;
       this.orgaos = orgaos;
       this.responsavels = responsavels;
       this.doadors = doadors;
       this.receptors = receptors;
    }
   
    public int getIdusuario() {
        return this.idusuario;
    }
    
    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return this.cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getEndereco() {
        return this.endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getTelefone() {
        return this.telefone;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getSenha() {
        return this.senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getRg() {
        return this.rg;
    }
    
    public void setRg(String rg) {
        this.rg = rg;
    }
    public String getCep() {
        return this.cep;
    }
    
    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getUf() {
        return this.uf;
    }
    
    public void setUf(String uf) {
        this.uf = uf;
    }
    public String getCidade() {
        return this.cidade;
    }
    
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getLogin() {
        return this.login;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public Date getNascimento() {
        return this.nascimento;
    }
    
    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }
    public String getBairro() {
        return this.bairro;
    }
    
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public Set getTransplantes() {
        return this.transplantes;
    }
    
    public void setTransplantes(Set transplantes) {
        this.transplantes = transplantes;
    }
    public Set getOrgaos() {
        return this.orgaos;
    }
    
    public void setOrgaos(Set orgaos) {
        this.orgaos = orgaos;
    }
    public Set getResponsavels() {
        return this.responsavels;
    }
    
    public void setResponsavels(Set responsavels) {
        this.responsavels = responsavels;
    }
    public Set getDoadors() {
        return this.doadors;
    }
    
    public void setDoadors(Set doadors) {
        this.doadors = doadors;
    }
    public Set getReceptors() {
        return this.receptors;
    }
    
    public void setReceptors(Set receptors) {
        this.receptors = receptors;
    }




}


