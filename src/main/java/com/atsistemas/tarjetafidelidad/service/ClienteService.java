package com.atsistemas.tarjetafidelidad.service;

import java.util.List;

import com.atsistemas.tarjetafidelidad.domain.Cliente;
import com.atsistemas.tarjetafidelidad.domain.Usuario;

public interface ClienteService {
	List<Cliente> getAllUsers();

	Usuario getUser(Cliente cliente);

	void addUser(Cliente cliente);

	void deleteUser(Cliente cliente);
	
	long getPoints(Cliente cliente);
}
