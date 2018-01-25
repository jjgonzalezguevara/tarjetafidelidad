package com.atsistemas.tarjetafidelidad.domain;

import java.io.Serializable;

public class Empresa implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4186168317594716459L;
	
	private String cif;
	private String webpage;
	public Empresa() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCif() {
		return cif;
	}
	public void setCif(String cif) {
		this.cif = cif;
	}
	public String getWebpage() {
		return webpage;
	}
	public void setWebpage(String webpage) {
		this.webpage = webpage;
	}
	
	
}
