package com.montalvo.backend.models.entities;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name="Product")
@Entity
public class Product implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id_product")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	private Long idProducto;
	
	@Column(name = "Nombre")
	private String Nombre;
	
	@Column(name = "Descripcion")
	private String Descripcion;
	
	@Column(name = "Precio")
	private String Precio;
	
	@Column(name = "Stock")
	private String Stock;
	
	@JoinColumn(name="fk_category", referencedColumnName="id_category")
	@ManyToOne
	private Category category;
	
	@JoinColumn(name="fk_shop", referencedColumnName="id_shop")
	@ManyToOne
	private Shop shop;
	
	
	public Product() {
		super();
	}
	
	public Product(Long id) {
		super();
		this.idProducto = id;
	}
	
	
	public Long getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombre() {
		return Nombre;
	}
	
	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	
	public String getPrecio() {
		return Precio;
	}

	public void setPrecio(String precio) {
		Precio = precio;
	}
	
	public String getStock() {
		return Stock;
	}

	public void setStock(String stock) {
		Stock = stock;
	}
}
