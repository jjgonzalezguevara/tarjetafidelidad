package com.atsistemas.tarjetafidelidad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.atsistemas.tarjetafidelidad.dto.UserFormDto;
import com.atsistemas.tarjetafidelidad.service.ClienteService;
import com.atsistemas.tarjetafidelidad.service.UsuarioService;

@Controller
@RequestMapping("/usuarios")
public class UserController {
	
	@Autowired
	UsuarioService usuarioService;
	
	@Autowired
	ClienteService clienteService;
	
	@GetMapping(path="/alta")
	public String altausuario(Model model) {
		String pass = usuarioService.generatePassword();
		UserFormDto userFormDto = new UserFormDto();
		userFormDto.setUserPwd(pass);
		model.addAttribute("usuarioDto", userFormDto);
		return "altausuario";
	}
	@PostMapping(path="/alta")
	public String altausuario(@ModelAttribute("usuarioDto") UserFormDto usuarioDto, Model model) {
		usuarioService.addUser(usuarioDto);
		clienteService.addUser(usuarioDto);
		return "operpage";
	}
}
