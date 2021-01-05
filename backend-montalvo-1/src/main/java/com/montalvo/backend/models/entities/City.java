package com.montalvo.backend.models.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Table(name="City")
@Entity
public class City implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	@Id
	@Column(name="id_city")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	private Long idCiudad;
	
	@Column(name="Nombre")
	private String Nombre;
	
	@OneToMany(mappedBy="city",fetch = FetchType.LAZY)
	private List<Shop> shops;
	
	public City() { 
		super();
	}
	
	public City(Long id) {
		super();
		this.idCiudad = id;
	}
	
	
	public Long getIdCiudad() {
		return idCiudad;
	}
	public void setIdCiudad(Long idCiudad) {
		this.idCiudad = idCiudad;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
	
	
}
