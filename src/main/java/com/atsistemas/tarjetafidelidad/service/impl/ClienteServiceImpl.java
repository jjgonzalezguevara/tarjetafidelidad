package com.atsistemas.tarjetafidelidad.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.atsistemas.tarjetafidelidad.domain.Cliente;
import com.atsistemas.tarjetafidelidad.domain.repository.ClienteRepository;
import com.atsistemas.tarjetafidelidad.dto.UserFormDto;
import com.atsistemas.tarjetafidelidad.dto.converter.Marshall;
import com.atsistemas.tarjetafidelidad.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {
	
	@Autowired
	public ClienteRepository clienteRepository;
	
	@Autowired
	@Qualifier("clienteMarshaller")
	private Marshall<Cliente, UserFormDto> clienteMarshaller;

	@Override
	public List<Cliente> getAllUsers() {
		return clienteRepository.getAllUsers();
	}

	@Override
	public Cliente getCliente(int clienteId) {
		return clienteRepository.getCliente(clienteId);
	}

	@Override
	public void addUser(UserFormDto cliente) {
		Cliente client = clienteMarshaller.unMarshall(cliente);
		clienteRepository.addCliente(client);

	}

	@Override
	public void deleteUser(Cliente cliente) {
		// TODO Auto-generated method stub

	}

	@Override
	public Cliente getPoints(Cliente cliente) {
		return clienteRepository.getPoints(cliente);
	}

	

}
