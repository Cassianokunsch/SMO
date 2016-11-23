package Model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "transporte", schema = "public")

public class Transporte implements java.io.Serializable {

    private int idtransporte;
    private Aparelho aparelho;
    private Caixa caixa;
    private Localizacao localizacao;
    private Motorista motorista;
    private Orgao orgao;
    private Temperatura temperatura;
    private String tempFinal;
    private Date data;
    private String latitudeInicial;
    private String longitudeInicial;
    private Date horaSaida;
    private String tempInicial;
    private String destino;
    private String origem;
    private String longitudeFinal;
    private String latitudeFinal;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idtransporte", unique = true, nullable = false)
    public int getIdtransporte() {
        return this.idtransporte;
    }

    public void setIdtransporte(int idtransporte) {
        this.idtransporte = idtransporte;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idaparelho", nullable = false)
    public Aparelho getAparelho() {
        return this.aparelho;
    }

    public void setAparelho(Aparelho aparelho) {
        this.aparelho = aparelho;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idcaixa", nullable = false)
    public Caixa getCaixa() {
        return this.caixa;
    }

    public void setCaixa(Caixa caixa) {
        this.caixa = caixa;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idlocalizacao", nullable = false)
    public Localizacao getLocalizacao() {
        return this.localizacao;
    }

    public void setLocalizacao(Localizacao localizacao) {
        this.localizacao = localizacao;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idmotorista", nullable = false)
    public Motorista getMotorista() {
        return this.motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idorgao", nullable = false)
    public Orgao getOrgao() {
        return this.orgao;
    }

    public void setOrgao(Orgao orgao) {
        this.orgao = orgao;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idtemperatura", nullable = false)
    public Temperatura getTemperatura() {
        return this.temperatura;
    }

    public void setTemperatura(Temperatura temperatura) {
        this.temperatura = temperatura;
    }

    @Column(name = "temp_final", length = 5)
    public String getTempFinal() {
        return this.tempFinal;
    }

    public void setTempFinal(String tempFinal) {
        this.tempFinal = tempFinal;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "data", length = 13)
    public Date getData() {
        return this.data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Column(name = "latitude_inicial", length = 10)
    public String getLatitudeInicial() {
        return this.latitudeInicial;
    }

    public void setLatitudeInicial(String latitudeInicial) {
        this.latitudeInicial = latitudeInicial;
    }

    @Column(name = "longitude_inicial", length = 10)
    public String getLongitudeInicial() {
        return this.longitudeInicial;
    }

    public void setLongitudeInicial(String longitudeInicial) {
        this.longitudeInicial = longitudeInicial;
    }

    @Temporal(TemporalType.TIME)
    @Column(name = "hora_saida", length = 15)
    public Date getHoraSaida() {
        return this.horaSaida;
    }

    public void setHoraSaida(Date horaSaida) {
        this.horaSaida = horaSaida;
    }

    @Column(name = "temp_inicial", length = 5)
    public String getTempInicial() {
        return this.tempInicial;
    }

    public void setTempInicial(String tempInicial) {
        this.tempInicial = tempInicial;
    }

    @Column(name = "destino", length = 150)
    public String getDestino() {
        return this.destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    @Column(name = "origem", length = 150)
    public String getOrigem() {
        return this.origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    @Column(name = "longitude_final", length = 10)
    public String getLongitudeFinal() {
        return this.longitudeFinal;
    }

    public void setLongitudeFinal(String longitudeFinal) {
        this.longitudeFinal = longitudeFinal;
    }

    @Column(name = "latitude_final", length = 10)
    public String getLatitudeFinal() {
        return this.latitudeFinal;
    }

    public void setLatitudeFinal(String latitudeFinal) {
        this.latitudeFinal = latitudeFinal;
    }

}
