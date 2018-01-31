package com.atsistemas.tarjetafidelidad.domain.repository;

import java.util.List;

import com.atsistemas.tarjetafidelidad.domain.Item;
import com.atsistemas.tarjetafidelidad.domain.Oferta;

public interface ItemRepository {
	List<Item> getAllItems();

	Oferta getItem(Item oferta);

	void addItem(Item oferta);

	void deleteItem(Item oferta);

}
