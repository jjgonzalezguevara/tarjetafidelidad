package com.atsistemas.tarjetafidelidad.domain;

import java.io.Serializable;

public class Tarjeta implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7206815468547758958L;
	private String cardId;

	public Tarjeta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCardId() {
		return cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	
}
