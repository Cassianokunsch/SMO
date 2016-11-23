package Model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "pessoa", schema = "public")

public abstract class Pessoa implements java.io.Serializable {

    private int idpessoa;
    private String nome;
    private String cidade;
    private Date nascimento;
    private String uf;
    private String cep;
    private String rg;
    private String cpf;
    private String endereco;
    private String bairro;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpessoa", unique = true, nullable = false)
    public int getIdpessoa() {
        return this.idpessoa;
    }

    public void setIdpessoa(int idpessoa) {
        this.idpessoa = idpessoa;
    }

    @Column(name = "nome", length = 150)
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Column(name = "cidade", length = 50)
    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "nascimento", length = 13)
    public Date getNascimento() {
        return this.nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    @Column(name = "uf", length = 2)
    public String getUf() {
        return this.uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Column(name = "cep", length = 9)
    public String getCep() {
        return this.cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Column(name = "rg", length = 9)
    public String getRg() {
        return this.rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    @Column(name = "cpf", length = 14)
    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Column(name = "endereco", length = 150)
    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Column(name = "bairro", length = 150)
    public String getBairro() {
        return this.bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

}
