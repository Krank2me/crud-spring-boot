package com.panda.api.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.panda.api.domain.support.Entities;

@Entity
@Table(name = "personas")
public class Persona extends Entities {

	@Column(name = "nombre")
	private String nombre;
	@Column(name = "apellidos")
	private String apllidos;
	@Column(name = "email")
	private String email;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApllidos() {
		return apllidos;
	}

	public void setApllidos(String apllidos) {
		this.apllidos = apllidos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
