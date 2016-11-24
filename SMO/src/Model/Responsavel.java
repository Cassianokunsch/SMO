package Model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@PrimaryKeyJoinColumn(name = "idPessoa")
@Table(name = "responsavel", schema = "public")

public class Responsavel extends Pessoa implements java.io.Serializable {

    private Usuario usuario;
    private String email;
    private String telefone;
    private Set<Doador> doadors = new HashSet(0);

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idpessoa", nullable = false)
    public Usuario getUsuario() {
        return this.usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Column(name = "email", length = 100)
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "telefone", length = 15)
    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "responsavel")
    public Set<Doador> getDoadors() {
        return this.doadors;
    }

    public void setDoadors(Set doadors) {
        this.doadors = doadors;
    }

}
