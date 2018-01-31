package com.atsistemas.tarjetafidelidad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.atsistemas.tarjetafidelidad.domain.Cliente;
import com.atsistemas.tarjetafidelidad.service.ClienteService;

@Controller
@RequestMapping("clientes")
public class ClienteController {
	
	@Autowired
	public ClienteService clienteService;
	
	@RequestMapping(path="/listado", method=RequestMethod.GET)
	public String obtenerClientes(Model model) {
		
		model.addAttribute("cliente",clienteService.getAllUsers());
		return "cliente";
	}
	
	@RequestMapping(path="/puntos", method=RequestMethod.POST)
	public String obtenerPuntosCliente(@ModelAttribute("cliente") Cliente cliente, Model model) {
		model.addAttribute("cliente",clienteService.getPoints(cliente));
		return "forward:/clientes/listado";
	}
	
}