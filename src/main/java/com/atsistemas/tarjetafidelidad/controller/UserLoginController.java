package com.atsistemas.tarjetafidelidad.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.atsistemas.tarjetafidelidad.domain.Usuario;

@Controller
public class UserLoginController {
	
	@RequestMapping(value = "/acceso", method = RequestMethod.GET)
	public String accesoUsuario(Model model) {
		model.addAttribute("usuario", new Usuario());
		return "login";
	}
	
	@RequestMapping(value = "/acceso", method = RequestMethod.POST)
	public String accesoUsuario() {
		return "";
	}

}
