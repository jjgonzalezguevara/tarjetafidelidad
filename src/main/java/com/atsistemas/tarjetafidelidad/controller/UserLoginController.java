package com.atsistemas.tarjetafidelidad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.atsistemas.tarjetafidelidad.domain.Cliente;
import com.atsistemas.tarjetafidelidad.domain.Usuario;
import com.atsistemas.tarjetafidelidad.service.ClienteService;
import com.atsistemas.tarjetafidelidad.service.UsuarioService;

@Controller
@SessionAttributes({ "cliente", "usuario" })
public class UserLoginController {

	private static final String OPERATOR = "ROLE_OPERATOR";

	@Autowired
	public UsuarioService usuarioService;

	@Autowired
	public ClienteService clienteService;

	/*
	 * Añadir usuario a la sesión
	 */
	@ModelAttribute("usuario")
	public Usuario setUpUserForm() {
		return new Usuario();
	}

	@ModelAttribute("cliente")
	public Cliente setUpClienteForm() {
		return new Cliente();
	}

	@GetMapping("/")
	public String index() {
		return "bienvenida";
	}

	@GetMapping("/login")
	public String getLogin(Model model) {
		model.addAttribute("usuario", new Usuario());
		return "login";
	}

	@PostMapping("/dologin")
	public String doLogin(@ModelAttribute("usuario") Usuario usuario, @ModelAttribute("cliente") Cliente cliente,
			Model model) {

		if (usuarioService.usuarioValido(usuario)) {

			Usuario user = usuarioService.getUser(usuario);
			int clienteId = user.getUserId();
			cliente = clienteService.getCliente(clienteId);

			model.addAttribute("cliente", cliente);

			if (user.getRol().equals(OPERATOR)) {
				return "operpage";
			}

		} else {
			model.addAttribute("message", "Login incorrecto. Intente otra vez.");
			return "login";
		}

		return "userpage";
	}

}
