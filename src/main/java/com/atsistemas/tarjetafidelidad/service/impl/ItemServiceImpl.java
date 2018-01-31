package com.atsistemas.tarjetafidelidad.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atsistemas.tarjetafidelidad.domain.Item;
import com.atsistemas.tarjetafidelidad.domain.Oferta;
import com.atsistemas.tarjetafidelidad.domain.repository.ItemRepository;
import com.atsistemas.tarjetafidelidad.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {
	
	@Autowired
	ItemRepository itemRepository;

	@Override
	public List<Item> getAllItems() {
		return itemRepository.getAllItems();
	}

	@Override
	public Oferta getItem(Item oferta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addItem(Item oferta) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteItem(Item oferta) {
		// TODO Auto-generated method stub

	}

}
