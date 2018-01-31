package com.atsistemas.tarjetafidelidad.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.atsistemas.tarjetafidelidad.business.PasswordGenerator;
import com.atsistemas.tarjetafidelidad.domain.Usuario;
import com.atsistemas.tarjetafidelidad.domain.repository.UsuarioRepository;
import com.atsistemas.tarjetafidelidad.dto.UserFormDto;
import com.atsistemas.tarjetafidelidad.dto.converter.Marshall;
import com.atsistemas.tarjetafidelidad.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService{
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	@Autowired
	PasswordGenerator passwordGenerator;
	
	@Autowired
	@Qualifier("userMarshaller")
	Marshall<Usuario, UserFormDto> userMarshaller;

	@Override
	public boolean usuarioValido(Usuario usuario) {
		return usuarioRepository.usuarioValido(usuario);
	}

	@Override
	public List<Usuario> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario getUser(Usuario usuario) {
		return usuarioRepository.getUser(usuario);
	}

	@Override
	public void addUser(UserFormDto usuario) {
		Usuario user = userMarshaller.unMarshall(usuario);
		usuarioRepository.addUser(user);		
	}

	@Override
	public void deleteUser(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Usuario getUserRol(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String generatePassword() {
		return passwordGenerator.generatePasswd();
	}

}
