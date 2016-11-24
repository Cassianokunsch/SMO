package Model;

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@PrimaryKeyJoinColumn(name = "idPessoa")
@Table(name = "doador", schema = "public")

public class Doador extends Pessoa implements java.io.Serializable {

    private Responsavel responsavel;
    private Usuario usuario;
    private String tipoSanguineo;
    private Date horaObito;
    private Set<Orgao> orgaos = new HashSet(0);

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idpessoa", nullable = false)
    public Responsavel getResponsavel() {
        return this.responsavel;
    }

    public void setResponsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idpessoa", nullable = false)
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

    @Temporal(TemporalType.TIME)
    @Column(name = "hora_obito", length = 15)
    public Date getHoraObito() {
        return this.horaObito;
    }

    public void setHoraObito(Date horaObito) {
        this.horaObito = horaObito;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "doador")
    public Set<Orgao> getOrgaos() {
        return this.orgaos;
    }

    public void setOrgaos(Set orgaos) {
        this.orgaos = orgaos;
    }

}
