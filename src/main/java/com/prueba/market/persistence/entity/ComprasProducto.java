package com.prueba.market.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "compras_productos")
public class ComprasProducto {
    @EmbeddedId //se utiliza cundo la PK es compuesta
    private ComprasproductoPK id;

    private Integer cantiad;
    private Double total;
    private Boolean estado;

    @ManyToOne
    @JoinColumn(name = "id_compra", insertable = false, updatable = false)
    private Compra compra;

    @ManyToOne
    @JoinColumn(name = "id_producto", insertable = false, updatable = false)
    private Producto producto;

    public ComprasproductoPK getId() {
        return id;
    }

    public void setId(ComprasproductoPK id) {
        this.id = id;
    }

    public Integer getCantiad() {
        return cantiad;
    }

    public void setCantiad(Integer cantiad) {
        this.cantiad = cantiad;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
