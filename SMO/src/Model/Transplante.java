package Model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "transplante", schema = "public")

public class Transplante implements java.io.Serializable {

    private int idtransplante;
    private Receptor receptor;
    private Usuario usuario;
    private Date dataTransplante;
    private Set<Orgao> orgaos = new HashSet(0);

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idtransplante", unique = true, nullable = false)
    public int getIdtransplante() {
        return this.idtransplante;
    }

    public void setIdtransplante(int idtransplante) {
        this.idtransplante = idtransplante;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idreceptor", nullable = false)
    public Receptor getReceptor() {
        return this.receptor;
    }

    public void setReceptor(Receptor receptor) {
        this.receptor = receptor;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idusuario", nullable = false)
    public Usuario getUsuario() {
        return this.usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "data_transplante", length = 13)
    public Date getDataTransplante() {
        return this.dataTransplante;
    }

    public void setDataTransplante(Date dataTransplante) {
        this.dataTransplante = dataTransplante;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "transplante")
    public Set<Orgao> getOrgaos() {
        return this.orgaos;
    }

    public void setOrgaos(Set orgaos) {
        this.orgaos = orgaos;
    }

}
