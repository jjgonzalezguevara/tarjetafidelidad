package com.atsistemas.tarjetafidelidad.service;

import java.util.List;

import com.atsistemas.tarjetafidelidad.domain.Usuario;

public interface UsuarioService {

	List<Usuario> getAllUsers();

	Usuario getUser(Usuario usuario);

	void addUser(Usuario usuario);

	void deleteUser(Usuario usuario);
	
	Usuario getUserRol(Usuario usuario);
	
	public boolean usuarioValido(String userId, String password);
}
