package com.prueba.market.persistence.entity;

import org.hibernate.annotations.Comment;

import javax.persistence.*;

// esta notacion le dira a Java que esta clase mapeara una tabla en una DB
@Entity
@Table(name = "productos") //cuando la clase no se llama igual a la tabla, hacemos esto. clase Producto == tabla productos
public class Producto {

    @Id //se hace referencia a que es una PK sencilla
    @GeneratedValue(strategy = GenerationType.IDENTITY) //generara el valor automaticamente como dijismo en la db
    @Column(name = "id_producto") // Lo mimsmo que table pero apra column
    private Integer idProducto;

    private String nombre;

    @Column(name = "id_categoria")
    private Integer idCategoria;

    @Column(name = "codigo_barras")
    private String codigoBarras;

    @Column(name = "precio_venta")
    private Double precioVenta;

    @Column(name = "cantidad-stock")
    private Integer cantidadStock;

    private Boolean estado;

    @ManyToOne //muchos a uno
    @JoinColumn(name = "id_categoria", insertable = false, updatable = false) // creamos la relacion. la tabla producto esta relacionada a categoria por medio del id
    private Categoria categoria;

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Integer getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(Integer cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}

