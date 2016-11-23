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
@Table(name = "orgao", schema = "public")

public class Orgao implements java.io.Serializable {

    private int idorgao;
    private Doador doador;
    private Transplante transplante;
    private Usuario usuario;
    private Date horaCaptacao;
    private String orgao;
    private Date tempoVida;
    private Set<Transporte> transportes = new HashSet(0);

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idorgao", unique = true, nullable = false)
    public int getIdorgao() {
        return this.idorgao;
    }

    public void setIdorgao(int idorgao) {
        this.idorgao = idorgao;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "iddoador", nullable = false)
    public Doador getDoador() {
        return this.doador;
    }

    public void setDoador(Doador doador) {
        this.doador = doador;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idtransplante", nullable = false)
    public Transplante getTransplante() {
        return this.transplante;
    }

    public void setTransplante(Transplante transplante) {
        this.transplante = transplante;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idusuario", nullable = false)
    public Usuario getUsuario() {
        return this.usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Temporal(TemporalType.TIME)
    @Column(name = "hora_captacao", length = 15)
    public Date getHoraCaptacao() {
        return this.horaCaptacao;
    }

    public void setHoraCaptacao(Date horaCaptacao) {
        this.horaCaptacao = horaCaptacao;
    }

    @Column(name = "orgao", length = 15)
    public String getOrgao() {
        return this.orgao;
    }

    public void setOrgao(String orgao) {
        this.orgao = orgao;
    }

    @Temporal(TemporalType.TIME)
    @Column(name = "tempo_vida", length = 15)
    public Date getTempoVida() {
        return this.tempoVida;
    }

    public void setTempoVida(Date tempoVida) {
        this.tempoVida = tempoVida;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "orgao")
    public Set<Transporte> getTransportes() {
        return this.transportes;
    }

    public void setTransportes(Set transportes) {
        this.transportes = transportes;
    }

}
