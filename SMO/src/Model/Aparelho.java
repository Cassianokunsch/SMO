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
@Table(name = "aparelho", schema = "public")

public class Aparelho implements java.io.Serializable {

    private int idaparelho;
    private String modelo;
    private Date validade;
    private String serie;
    private Set<Transporte> transportes = new HashSet(0);

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idaparelho", unique = true, nullable = false)
    public int getIdaparelho() {
        return this.idaparelho;
    }

    public void setIdaparelho(int idaparelho) {
        this.idaparelho = idaparelho;
    }

    @Column(name = "modelo", length = 30)
    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "validade", length = 13)
    public Date getValidade() {
        return this.validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    @Column(name = "serie", length = 10)
    public String getSerie() {
        return this.serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "aparelho")
    public Set<Transporte> getTransportes() {
        return this.transportes;
    }

    public void setTransportes(Set transportes) {
        this.transportes = transportes;
    }

}
