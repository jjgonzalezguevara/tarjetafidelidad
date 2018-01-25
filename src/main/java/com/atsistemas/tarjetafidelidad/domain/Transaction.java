package com.atsistemas.tarjetafidelidad.domain;

import java.io.Serializable;
import java.util.Date;

public class Transaction implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6524272852819755831L;
	private String transId;
	private Item itemTrans;
	private int units;
	private Cliente clienteTrans;
	private Tarjeta tarjetaCli;
	private Date transDate;

	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getTransId() {
		return transId;
	}

	public void setTransId(String transId) {
		this.transId = transId;
	}

	public Item getItemTrans() {
		return itemTrans;
	}

	public void setItemTrans(Item itemTrans) {
		this.itemTrans = itemTrans;
	}

	public int getUnits() {
		return units;
	}

	public void setUnits(int units) {
		this.units = units;
	}

	public Cliente getClienteTrans() {
		return clienteTrans;
	}

	public void setClienteTrans(Cliente clienteTrans) {
		this.clienteTrans = clienteTrans;
	}

	public Tarjeta getTarjetaCli() {
		return tarjetaCli;
	}

	public void setTarjetaCli(Tarjeta tarjetaCli) {
		this.tarjetaCli = tarjetaCli;
	}

	public Date getTransDate() {
		return transDate;
	}

	public void setTransDate(Date transDate) {
		this.transDate = transDate;
	}

}
