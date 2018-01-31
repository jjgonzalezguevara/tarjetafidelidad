package com.atsistemas.tarjetafidelidad.service;

import java.util.List;

import com.atsistemas.tarjetafidelidad.domain.Cliente;
import com.atsistemas.tarjetafidelidad.domain.Usuario;
import com.atsistemas.tarjetafidelidad.dto.UserFormDto;

public interface ClienteService {
	List<Cliente> getAllUsers();

	Cliente getCliente(int clientId);
	
	void addUser(UserFormDto cliente);

	void deleteUser(Cliente cliente);
	
	Cliente getPoints(Cliente cliente);
	
}
