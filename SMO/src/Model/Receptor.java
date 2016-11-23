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
@Table(name = "receptor", schema = "public")

public class Receptor extends Pessoa implements java.io.Serializable {

    private Usuario usuario;
    private String tipoSanguineo;
    private String telefone;
    private String email;
    private Set<Transplante> transplantes = new HashSet(0);

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idusuario", nullable = false)
    public Usuario getUsuario() {
        return this.usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Column(name = "tipo_sanguineo", length = 3)
    public String getTipoSanguineo() {
        return this.tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    @Column(name = "telefone", length = 15)
    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Column(name = "email", length = 10)
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "receptor")
    public Set<Transplante> getTransplantes() {
        return this.transplantes;
    }

    public void setTransplantes(Set transplantes) {
        this.transplantes = transplantes;
    }

}
