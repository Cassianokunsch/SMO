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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "caixa", schema = "public")

public class Caixa implements java.io.Serializable {

    private int idcaixa;
    private Integer capacidade;
    private String identificacao;
    private Date validade;
    private Set<Transporte> transportes = new HashSet(0);

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcaixa", unique = true, nullable = false)
    public int getIdcaixa() {
        return this.idcaixa;
    }

    public void setIdcaixa(int idcaixa) {
        this.idcaixa = idcaixa;
    }

    @Column(name = "capacidade")
    public Integer getCapacidade() {
        return this.capacidade;
    }

    public void setCapacidade(Integer capacidade) {
        this.capacidade = capacidade;
    }

    @Column(name = "identificacao", length = 30)
    public String getIdentificacao() {
        return this.identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "validade", length = 13)
    public Date getValidade() {
        return this.validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "caixa")
    public Set<Transporte> getTransportes() {
        return this.transportes;
    }

    public void setTransportes(Set transportes) {
        this.transportes = transportes;
    }

}
