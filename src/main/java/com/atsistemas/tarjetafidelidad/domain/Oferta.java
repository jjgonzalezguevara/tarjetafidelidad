package com.atsistemas.tarjetafidelidad.domain;

import java.io.Serializable;

public class Oferta implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7626044889072200767L;
	private String ofertaId;
	private String nombreItem;
	private String ofertaDescription;

	public Oferta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getOfertaId() {
		return ofertaId;
	}

	public void setOfertaId(String ofertaId) {
		this.ofertaId = ofertaId;
	}

	public String getNombreItem() {
		return nombreItem;
	}

	public void setNombreItem(String nombreItem) {
		this.nombreItem = nombreItem;
	}

	public String getOfertaDescription() {
		return ofertaDescription;
	}

	public void setOfertaDescription(String ofertaDescription) {
		this.ofertaDescription = ofertaDescription;
	}

}
