package com.atsistemas.tarjetafidelidad.dto;

import java.io.Serializable;

public class UserFormDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3811192998090348295L;
	private String userlogin;
	private String userApellidos;
	private String userName;
	private String userPwd;
	public UserFormDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getUserlogin() {
		return userlogin;
	}
	public void setUserlogin(String userlogin) {
		this.userlogin = userlogin;
	}
	public String getUserApellidos() {
		return userApellidos;
	}
	public void setUserApellidos(String userApellidos) {
		this.userApellidos = userApellidos;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	
	
}
