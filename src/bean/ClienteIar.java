package bean;
// Generated 13/12/2024 19:27:56 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * ClienteIar generated by hbm2java
 */
@Entity
@Table(name="cliente_iar"
    ,catalog="db_zahraa_tormos"
    , uniqueConstraints = @UniqueConstraint(columnNames="cpf_cliente_iar") 
)
public class ClienteIar  implements java.io.Serializable {


     private Byte idClienteIar;
     private String nomeClienteIar;
     private String cpfClienteIar;
     private String rgClienteIar;
     private Date dataNascClienteIar;
     private String estadoCivilClienteIar;
     private String emailClienteIar;
     private String ruaClienteIar;
     private byte numeroCasaClienteIar;
     private String bairroClienteIar;
     private String complementoClienteIar;
     private String estadoClienteIar;
     private String paisClienteIar;
     private String telefoneClienteIar;
     private String celularClienteIar;

    public ClienteIar() {
    }

	
    public ClienteIar(String nomeClienteIar, String cpfClienteIar, String rgClienteIar, String estadoCivilClienteIar, String emailClienteIar, String ruaClienteIar, byte numeroCasaClienteIar, String bairroClienteIar, String complementoClienteIar, String estadoClienteIar, String paisClienteIar, String celularClienteIar) {
        this.nomeClienteIar = nomeClienteIar;
        this.cpfClienteIar = cpfClienteIar;
        this.rgClienteIar = rgClienteIar;
        this.estadoCivilClienteIar = estadoCivilClienteIar;
        this.emailClienteIar = emailClienteIar;
        this.ruaClienteIar = ruaClienteIar;
        this.numeroCasaClienteIar = numeroCasaClienteIar;
        this.bairroClienteIar = bairroClienteIar;
        this.complementoClienteIar = complementoClienteIar;
        this.estadoClienteIar = estadoClienteIar;
        this.paisClienteIar = paisClienteIar;
        this.celularClienteIar = celularClienteIar;
    }
    public ClienteIar(String nomeClienteIar, String cpfClienteIar, String rgClienteIar, Date dataNascClienteIar, String estadoCivilClienteIar, String emailClienteIar, String ruaClienteIar, byte numeroCasaClienteIar, String bairroClienteIar, String complementoClienteIar, String estadoClienteIar, String paisClienteIar, String telefoneClienteIar, String celularClienteIar, Set vendasClientesZhts, Set vendasZhts) {
       this.nomeClienteIar = nomeClienteIar;
       this.cpfClienteIar = cpfClienteIar;
       this.rgClienteIar = rgClienteIar;
       this.dataNascClienteIar = dataNascClienteIar;
       this.estadoCivilClienteIar = estadoCivilClienteIar;
       this.emailClienteIar = emailClienteIar;
       this.ruaClienteIar = ruaClienteIar;
       this.numeroCasaClienteIar = numeroCasaClienteIar;
       this.bairroClienteIar = bairroClienteIar;
       this.complementoClienteIar = complementoClienteIar;
       this.estadoClienteIar = estadoClienteIar;
       this.paisClienteIar = paisClienteIar;
       this.telefoneClienteIar = telefoneClienteIar;
       this.celularClienteIar = celularClienteIar;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id_cliente_iar", unique=true, nullable=false)
    public Byte getIdClienteIar() {
        return this.idClienteIar;
    }
    
    public void setIdClienteIar(Byte idClienteIar) {
        this.idClienteIar = idClienteIar;
    }

    
    @Column(name="nome_cliente_iar", nullable=false, length=70)
    public String getNomeClienteIar() {
        return this.nomeClienteIar;
    }
    
    public void setNomeClienteIar(String nomeClienteIar) {
        this.nomeClienteIar = nomeClienteIar;
    }

    
    @Column(name="cpf_cliente_iar", unique=true, nullable=false, length=14)
    public String getCpfClienteIar() {
        return this.cpfClienteIar;
    }
    
    public void setCpfClienteIar(String cpfClienteIar) {
        this.cpfClienteIar = cpfClienteIar;
    }

    
    @Column(name="rg_cliente_iar", nullable=false, length=13)
    public String getRgClienteIar() {
        return this.rgClienteIar;
    }
    
    public void setRgClienteIar(String rgClienteIar) {
        this.rgClienteIar = rgClienteIar;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="data_nasc_cliente_iar", length=10)
    public Date getDataNascClienteIar() {
        return this.dataNascClienteIar;
    }
    
    public void setDataNascClienteIar(Date dataNascClienteIar) {
        this.dataNascClienteIar = dataNascClienteIar;
    }

    
    @Column(name="estado_civil_cliente_iar", nullable=false, length=45)
    public String getEstadoCivilClienteIar() {
        return this.estadoCivilClienteIar;
    }
    
    public void setEstadoCivilClienteIar(String estadoCivilClienteIar) {
        this.estadoCivilClienteIar = estadoCivilClienteIar;
    }

    
    @Column(name="email_cliente_iar", nullable=false, length=70)
    public String getEmailClienteIar() {
        return this.emailClienteIar;
    }
    
    public void setEmailClienteIar(String emailClienteIar) {
        this.emailClienteIar = emailClienteIar;
    }

    
    @Column(name="rua_cliente_iar", nullable=false, length=45)
    public String getRuaClienteIar() {
        return this.ruaClienteIar;
    }
    
    public void setRuaClienteIar(String ruaClienteIar) {
        this.ruaClienteIar = ruaClienteIar;
    }

    
    @Column(name="numero_casa_cliente_iar", nullable=false)
    public byte getNumeroCasaClienteIar() {
        return this.numeroCasaClienteIar;
    }
    
    public void setNumeroCasaClienteIar(byte numeroCasaClienteIar) {
        this.numeroCasaClienteIar = numeroCasaClienteIar;
    }

    
    @Column(name="bairro_cliente_iar", nullable=false, length=50)
    public String getBairroClienteIar() {
        return this.bairroClienteIar;
    }
    
    public void setBairroClienteIar(String bairroClienteIar) {
        this.bairroClienteIar = bairroClienteIar;
    }

    
    @Column(name="complemento_cliente_iar", nullable=false, length=70)
    public String getComplementoClienteIar() {
        return this.complementoClienteIar;
    }
    
    public void setComplementoClienteIar(String complementoClienteIar) {
        this.complementoClienteIar = complementoClienteIar;
    }

    
    @Column(name="estado_cliente_iar", nullable=false, length=2)
    public String getEstadoClienteIar() {
        return this.estadoClienteIar;
    }
    
    public void setEstadoClienteIar(String estadoClienteIar) {
        this.estadoClienteIar = estadoClienteIar;
    }

    
    @Column(name="pais_cliente_iar", nullable=false, length=60)
    public String getPaisClienteIar() {
        return this.paisClienteIar;
    }
    
    public void setPaisClienteIar(String paisClienteIar) {
        this.paisClienteIar = paisClienteIar;
    }

    
    @Column(name="telefone_cliente_iar", length=15)
    public String getTelefoneClienteIar() {
        return this.telefoneClienteIar;
    }
    
    public void setTelefoneClienteIar(String telefoneClienteIar) {
        this.telefoneClienteIar = telefoneClienteIar;
    }

    
    @Column(name="celular_cliente_iar", nullable=false, length=45)
    public String getCelularClienteIar() {
        return this.celularClienteIar;
    }
    
    public void setCelularClienteIar(String celularClienteIar) {
        this.celularClienteIar = celularClienteIar;
    }



}

