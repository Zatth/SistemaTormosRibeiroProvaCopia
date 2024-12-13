package bean;
// Generated 13/12/2024 19:27:56 by Hibernate Tools 4.3.1


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * CompraProdutoIar generated by hbm2java
 */
@Entity
@Table(name="compra_produto_iar"
    ,catalog="db_zahraa_tormos"
)
public class CompraProdutoIar  implements java.io.Serializable {


     private CompraProdutoIarId id;
     private CompraIar compraIar;
     private ProdutoZht produtoZht;
     private byte quantidadeIar;

    public CompraProdutoIar() {
    }

    public CompraProdutoIar(CompraProdutoIarId id, CompraIar compraIar, ProdutoZht produtoZht, byte quantidadeIar) {
       this.id = id;
       this.compraIar = compraIar;
       this.produtoZht = produtoZht;
       this.quantidadeIar = quantidadeIar;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="fkCompraIar", column=@Column(name="fk_compra_iar", nullable=false) ), 
        @AttributeOverride(name="fkProdutoIar", column=@Column(name="fk_produto_iar", nullable=false) ) } )
    public CompraProdutoIarId getId() {
        return this.id;
    }
    
    public void setId(CompraProdutoIarId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="fk_compra_iar", nullable=false, insertable=false, updatable=false)
    public CompraIar getCompraIar() {
        return this.compraIar;
    }
    
    public void setCompraIar(CompraIar compraIar) {
        this.compraIar = compraIar;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="fk_produto_iar", nullable=false, insertable=false, updatable=false)
    public ProdutoZht getProdutoZht() {
        return this.produtoZht;
    }
    
    public void setProdutoZht(ProdutoZht produtoZht) {
        this.produtoZht = produtoZht;
    }

    
    @Column(name="quantidade_iar", nullable=false)
    public byte getQuantidadeIar() {
        return this.quantidadeIar;
    }
    
    public void setQuantidadeIar(byte quantidadeIar) {
        this.quantidadeIar = quantidadeIar;
    }




}

