package com.atsistemas.tarjetafidelidad.dto.converter.impl;

import org.springframework.stereotype.Component;

import com.atsistemas.tarjetafidelidad.domain.Cliente;
import com.atsistemas.tarjetafidelidad.dto.UserFormDto;
import com.atsistemas.tarjetafidelidad.dto.converter.Marshall;

@Component
public class ClienteMarshaller implements Marshall<Cliente, UserFormDto> {

	@Override
	public UserFormDto marshall(Cliente entity) {
		UserFormDto userDto = new UserFormDto();
		userDto.setUserApellidos(entity.getApellidos());
		return userDto;
	}

	@Override
	public Cliente unMarshall(UserFormDto dto) {
		Cliente cliente = new Cliente();
		cliente.setApellidos(dto.getUserApellidos());
		cliente.setPuntos(new Long(0));

		return cliente;
	}

}
