package com.atsistemas.tarjetafidelidad.domain;

import java.io.Serializable;

public class ItemBeneficio implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 83915969874791671L;
	private String benefitId;
	private String name;
	private String description;
	public ItemBeneficio() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getBenefitId() {
		return benefitId;
	}
	public void setBenefitId(String benefitId) {
		this.benefitId = benefitId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
