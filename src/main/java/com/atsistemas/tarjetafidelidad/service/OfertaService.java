package com.atsistemas.tarjetafidelidad.service;

import java.util.List;

import com.atsistemas.tarjetafidelidad.domain.Oferta;

public interface OfertaService {
	List<Oferta> getAllOfertas();

	Oferta getOferta(Oferta oferta);

	void addUser(Oferta oferta);

	void deleteUser(Oferta oferta);
}
