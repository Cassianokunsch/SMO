package Model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@PrimaryKeyJoinColumn(name = "idPessoa")
@Table(name = "usuario", schema = "public")

public class Usuario extends Pessoa {

    private String telefone;
    private String email;
    private String login;
    private String senha;
    private Set<Transplante> transplantes = new HashSet(0);
    private Set<Orgao> orgaos = new HashSet(0);
    private Set<Responsavel> responsavels = new HashSet(0);
    private Set<Doador> doadors = new HashSet(0);
    private Set<Receptor> receptors = new HashSet(0);

    @Column(name = "telefone", length = 15)
    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Column(name = "email", length = 100)
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "login", length = 10)
    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Column(name = "senha", length = 10)
    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario")
    public Set<Transplante> getTransplantes() {
        return this.transplantes;
    }

    public void setTransplantes(Set transplantes) {
        this.transplantes = transplantes;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario")
    public Set<Orgao> getOrgaos() {
        return this.orgaos;
    }

    public void setOrgaos(Set orgaos) {
        this.orgaos = orgaos;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario")
    public Set<Responsavel> getResponsavels() {
        return this.responsavels;
    }

    public void setResponsavels(Set responsavels) {
        this.responsavels = responsavels;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario")
    public Set<Doador> getDoadors() {
        return this.doadors;
    }

    public void setDoadors(Set doadors) {
        this.doadors = doadors;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario")
    public Set<Receptor> getReceptors() {
        return this.receptors;
    }

    public void setReceptors(Set receptors) {
        this.receptors = receptors;
    }

}
