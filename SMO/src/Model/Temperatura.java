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
@Table(name = "temperatura", schema = "public")

public class Temperatura implements java.io.Serializable {

    private int idtemperatura;
    private String termometroInterno;
    private Date horaTemp;
    private String termometroExterno;
    private Set<Transporte> transportes = new HashSet(0);

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idtemperatura", unique = true, nullable = false)
    public int getIdtemperatura() {
        return this.idtemperatura;
    }

    public void setIdtemperatura(int idtemperatura) {
        this.idtemperatura = idtemperatura;
    }

    @Column(name = "termometro_interno", length = 8)
    public String getTermometroInterno() {
        return this.termometroInterno;
    }

    public void setTermometroInterno(String termometroInterno) {
        this.termometroInterno = termometroInterno;
    }

    @Temporal(TemporalType.TIME)
    @Column(name = "hora_temp", length = 15)
    public Date getHoraTemp() {
        return this.horaTemp;
    }

    public void setHoraTemp(Date horaTemp) {
        this.horaTemp = horaTemp;
    }

    @Column(name = "termometro_externo", length = 8)
    public String getTermometroExterno() {
        return this.termometroExterno;
    }

    public void setTermometroExterno(String termometroExterno) {
        this.termometroExterno = termometroExterno;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "temperatura")
    public Set<Transporte> getTransportes() {
        return this.transportes;
    }

    public void setTransportes(Set transportes) {
        this.transportes = transportes;
    }

}
