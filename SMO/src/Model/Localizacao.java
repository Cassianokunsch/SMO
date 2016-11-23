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
@Table(name = "localizacao", schema = "public")

public class Localizacao implements java.io.Serializable {

    private int idlocalizacao;
    private String longitude;
    private Date horaLoc;
    private String latitude;
    private Set<Transporte> transportes = new HashSet(0);

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idlocalizacao", unique = true, nullable = false)
    public int getIdlocalizacao() {
        return this.idlocalizacao;
    }

    public void setIdlocalizacao(int idlocalizacao) {
        this.idlocalizacao = idlocalizacao;
    }

    @Column(name = "longitude", length = 10)
    public String getLongitude() {
        return this.longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    @Temporal(TemporalType.TIME)
    @Column(name = "hora_loc", length = 15)
    public Date getHoraLoc() {
        return this.horaLoc;
    }

    public void setHoraLoc(Date horaLoc) {
        this.horaLoc = horaLoc;
    }

    @Column(name = "latitude", length = 10)
    public String getLatitude() {
        return this.latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "localizacao")
    public Set<Transporte> getTransportes() {
        return this.transportes;
    }

    public void setTransportes(Set transportes) {
        this.transportes = transportes;
    }

}
