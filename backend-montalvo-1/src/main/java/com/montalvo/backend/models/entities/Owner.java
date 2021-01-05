package com.montalvo.backend.models.entities;

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


@Table(name="Owner")
@Entity
public class Owner {
	
	
	@Id
	@Column(name="id_owner")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	private Long idPropietario;
	
	@Column(name="Nombres")
	private String Nombres;
	
	@Column(name="Apellidos")
	private String Apellidos;
	
	@Column(name="Cedula")
	private String Cedula;
	
	@Column(name="N_Telefono")
	private String N_Telefono;
	
	@Column(name="Usuario")
	private String Usuario;
	
	@Column(name="Correo")
	private String Correo;
	
	@Column(name="Contrasena")
	private String Contrasena;
	
	@OneToMany(mappedBy="owner",fetch = FetchType.LAZY)
	private List<Shop> shops;
	
	public List<Shop> getShops() {
		return shops;
	}


	public void setShops(List<Shop> shops) {
		this.shops = shops;
	}


	public Owner() {
		super();
	}
	
	
	public Owner(Long id) {
		super();
		this.idPropietario = id;
	}
	
	
	
	
	public Long getIdPropietario() {
		return idPropietario;
	}
	public void setIdPropietario(Long idPropietario) {
		this.idPropietario = idPropietario;
	}
	public String getNombres() {
		return Nombres;
	}
	public void setNombres(String nombres) {
		Nombres = nombres;
	}
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	public String getCedula() {
		return Cedula;
	}
	public void setCedula(String cedula) {
		Cedula = cedula;
	}
	public String getN_Telefono() {
		return N_Telefono;
	}
	public void setN_Telefono(String n_Telefono) {
		N_Telefono = n_Telefono;
	}
	public String getUsuario() {
		return Usuario;
	}
	public void setUsuario(String usuario) {
		Usuario = usuario;
	}
	public String getCorreo() {
		return Correo;
	}
	public void setCorreo(String correo) {
		Correo = correo;
	}
	public String getContrasena() {
		return Contrasena;
	}
	public void setContrasena(String contrasena) {
		Contrasena = contrasena;
	}
	
	
	
	
	
	
}
