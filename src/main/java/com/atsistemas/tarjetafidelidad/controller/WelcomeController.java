package com.atsistemas.tarjetafidelidad.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	@RequestMapping("/saludo")
	public String saludo() {
		return "welcome";
	}
}
