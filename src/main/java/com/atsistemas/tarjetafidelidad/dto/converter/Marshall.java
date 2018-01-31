package com.atsistemas.tarjetafidelidad.dto.converter;

public interface Marshall<E,D> {
	D marshall(E entity);

	E unMarshall(D dto);
}
