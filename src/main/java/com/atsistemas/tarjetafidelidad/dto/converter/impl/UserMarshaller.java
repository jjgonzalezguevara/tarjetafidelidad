package com.atsistemas.tarjetafidelidad.dto.converter.impl;

import org.springframework.stereotype.Component;

import com.atsistemas.tarjetafidelidad.domain.Usuario;
import com.atsistemas.tarjetafidelidad.dto.UserFormDto;
import com.atsistemas.tarjetafidelidad.dto.converter.Marshall;

@Component
public class UserMarshaller implements Marshall<Usuario, UserFormDto> {

	@Override
	public UserFormDto marshall(Usuario entity) {
		UserFormDto usuarioDto = new UserFormDto();
		return usuarioDto;
	}

	@Override
	public Usuario unMarshall(UserFormDto dto) {
		Usuario usuario = new Usuario();
		usuario.setNombre(dto.getUserName());
		usuario.setUserlogin(dto.getUserlogin());
		usuario.setPassword(dto.getUserPwd());
		return usuario;
	}

}
