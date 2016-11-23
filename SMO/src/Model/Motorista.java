package Model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@PrimaryKeyJoinColumn(name = "idPessoa")
@Table(name = "motorista", schema = "public")

public class Motorista extends Pessoa implements java.io.Serializable {

    private String cnh;
    private String telefone;
    private String email;
    private Date validadeCnh;
    private Set<Transporte> transportes = new HashSet(0);

    @Column(name = "cnh", length = 11)
    public String getCnh() {
        return this.cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

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

    @Temporal(TemporalType.DATE)
    @Column(name = "validade_cnh", length = 13)
    public Date getValidadeCnh() {
        return this.validadeCnh;
    }

    public void setValidadeCnh(Date validadeCnh) {
        this.validadeCnh = validadeCnh;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "motorista")
    public Set<Transporte> getTransportes() {
        return this.transportes;
    }

    public void setTransportes(Set transportes) {
        this.transportes = transportes;
    }

}
