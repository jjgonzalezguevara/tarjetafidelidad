package com.atsistemas.tarjetafidelidad.domain.repository;

import java.util.List;

import com.atsistemas.tarjetafidelidad.domain.Oferta;

public interface OfertaRepository {
	List<Oferta> getAllOfertas();

	Oferta getOferta(Oferta oferta);

	void addUser(Oferta oferta);

	void deleteUser(Oferta oferta);
}
