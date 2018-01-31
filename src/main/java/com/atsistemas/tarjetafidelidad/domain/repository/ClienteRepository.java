package com.atsistemas.tarjetafidelidad.domain.repository;

import java.util.List;

import com.atsistemas.tarjetafidelidad.domain.Cliente;
import com.atsistemas.tarjetafidelidad.dto.UserFormDto;

public interface ClienteRepository {
	List<Cliente> getAllUsers();
	Cliente getCliente(int clientId);
	Cliente getPoints(Cliente cliente);
	void addCliente(Cliente cliente);
}
