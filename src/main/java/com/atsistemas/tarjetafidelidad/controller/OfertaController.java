package com.atsistemas.tarjetafidelidad.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.atsistemas.tarjetafidelidad.domain.Item;
import com.atsistemas.tarjetafidelidad.service.ItemService;

@Controller
@RequestMapping("ofertas")
public class OfertaController {
	
	@Autowired
	ItemService itemService;
	
	@GetMapping("/items")
	public String getItems(Model model) {
		List<Item> lst = itemService.getAllItems();
		model.addAttribute("items", lst);
		
		return "itmofertas";
	}

}
