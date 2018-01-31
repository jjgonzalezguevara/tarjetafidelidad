package com.atsistemas.tarjetafidelidad.domain.repository;

import java.util.List;

import com.atsistemas.tarjetafidelidad.domain.Usuario;

public interface UsuarioRepository {
	List<Usuario> getAllUsers();

	Usuario getUser(Usuario usuario);

	void addUser(Usuario usuario);

	void deleteUser(Usuario usuario);
	
	Usuario getUserRol(Usuario usuario);
	
	boolean usuarioValido(Usuario usuario);
}
