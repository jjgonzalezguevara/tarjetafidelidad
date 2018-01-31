package com.atsistemas.tarjetafidelidad.service;

import java.util.List;

import com.atsistemas.tarjetafidelidad.domain.Usuario;
import com.atsistemas.tarjetafidelidad.dto.UserFormDto;

public interface UsuarioService {

	List<Usuario> getAllUsers();

	Usuario getUser(Usuario usuario);

	void addUser(UserFormDto usuarioDto);

	void deleteUser(Usuario usuario);
	
	Usuario getUserRol(Usuario usuario);
	
	boolean usuarioValido(Usuario usuario);
	
	String generatePassword();
}
