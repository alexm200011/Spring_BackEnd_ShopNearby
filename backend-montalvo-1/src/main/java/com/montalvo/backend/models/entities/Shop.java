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
@Table(name="Shop")
@Entity


public class Shop implements Serializable {
	
	
	private static final long serialVersionUID = 1L;



	@Id
	@Column(name="id_shop")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	private Long idTienda;
	
	
	@Column(name="nombre")
	private String Nombre;
	
	@Column(name="R_Social")
	private String R_Social;
	
	@Column(name="N_Telefono")
	private String N_Telefono;
	
	@Column(name="Direccion")
	private String Direccion;
	
	@Column(name="Estado")
	private String Estado;
	
	@Column(name="idPropietario")
	private Long idPropietario;
	
	@Column(name="Categoria")
	private String Categoria;
	
	@Column(name="idCiudad")
	private String idCiudad;
	
	@Column(name="Latitud")
	private String Latitud;
	
	@Column(name="Longitud")
	private String Longitud;
	
	@JoinColumn(name="fk_owner", referencedColumnName="id_owner")
	@ManyToOne
	private Owner owner;
	
	@JoinColumn(name="fk_city", referencedColumnName="id_city")
	@ManyToOne
	private City city;
	
	public Shop() {
		super();
	}
	
	public Shop(Long id) {
		super();
		this.idTienda = id;
	}
	
	
	public Long getIdTienda() {
		return idTienda;
	}
	public void setIdTienda(Long idTienda) {
		this.idTienda = idTienda;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getR_Social() {
		return R_Social;
	}
	public void setR_Social(String r_Social) {
		R_Social = r_Social;
	}
	public String getN_Telefono() {
		return N_Telefono;
	}
	public void setN_Telefono(String n_Telefono) {
		N_Telefono = n_Telefono;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	public String getEstado() {
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}
	public Long getIdPropietario() {
		return idPropietario;
	}
	public void setIdPropietario(Long idPropietario) {
		this.idPropietario = idPropietario;
	}
	public String getCategoria() {
		return Categoria;
	}
	public void setCategoria(String categoria) {
		Categoria = categoria;
	}
	public String getIdCiudad() {
		return idCiudad;
	}
	public void setIdCiudad(String idCiudad) {
		this.idCiudad = idCiudad;
	}
	public String getLatitud() {
		return Latitud;
	}
	public void setLatitud(String latitud) {
		Latitud = latitud;
	}
	public String getLongitud() {
		return Longitud;
	}
	public void setLongitud(String longitud) {
		Longitud = longitud;
	}
	
}
