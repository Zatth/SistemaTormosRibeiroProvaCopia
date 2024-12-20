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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * CompraIar generated by hbm2java
 */
@Entity
@Table(name="compra_iar"
    ,catalog="db_zahraa_tormos"
)
public class CompraIar  implements java.io.Serializable {


     private Byte idCompraIar;
     private FuncionarioIar funcionarioIar;
     private Date dataIar;
     private double valorIar;
     private String pagamentoCompraIar;

    public CompraIar() {
    }

	
    public CompraIar(FuncionarioIar funcionarioIar, Date dataIar, double valorIar, String pagamentoCompraIar) {
        this.funcionarioIar = funcionarioIar;
        this.dataIar = dataIar;
        this.valorIar = valorIar;
        this.pagamentoCompraIar = pagamentoCompraIar;
    }
    public CompraIar(FuncionarioIar funcionarioIar, Date dataIar, double valorIar, String pagamentoCompraIar, Set compraFornecedorIars, Set compraProdutoIars) {
       this.funcionarioIar = funcionarioIar;
       this.dataIar = dataIar;
       this.valorIar = valorIar;
       this.pagamentoCompraIar = pagamentoCompraIar;
  
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id_compra_iar", unique=true, nullable=false)
    public Byte getIdCompraIar() {
        return this.idCompraIar;
    }
    
    public void setIdCompraIar(Byte idCompraIar) {
        this.idCompraIar = idCompraIar;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="fk_funcionario_iar", nullable=false)
    public FuncionarioIar getFuncionarioIar() {
        return this.funcionarioIar;
    }
    
    public void setFuncionarioIar(FuncionarioIar funcionarioIar) {
        this.funcionarioIar = funcionarioIar;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="data_iar", nullable=false, length=19)
    public Date getDataIar() {
        return this.dataIar;
    }
    
    public void setDataIar(Date dataIar) {
        this.dataIar = dataIar;
    }

    
    @Column(name="valor_iar", nullable=false, precision=7)
    public double getValorIar() {
        return this.valorIar;
    }
    
    public void setValorIar(double valorIar) {
        this.valorIar = valorIar;
    }

    
    @Column(name="pagamento_compra_iar", nullable=false, length=45)
    public String getPagamentoCompraIar() {
        return this.pagamentoCompraIar;
    }
    
    public void setPagamentoCompraIar(String pagamentoCompraIar) {
        this.pagamentoCompraIar = pagamentoCompraIar;
    }

}