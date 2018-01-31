package com.atsistemas.tarjetafidelidad.domain;

import java.io.Serializable;

public class Cliente implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6385921331385276766L;
	private int clientId;
	private String apellidos;
	private Long puntos;

	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cliente(int clientId, String apellidos, Long puntos) {
		super();
		this.clientId = clientId;
		this.apellidos = apellidos;
		this.puntos = puntos;
	}

	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Long getPuntos() {
		return puntos;
	}

	public void setPuntos(Long puntos) {
		this.puntos = puntos;
	}

}
