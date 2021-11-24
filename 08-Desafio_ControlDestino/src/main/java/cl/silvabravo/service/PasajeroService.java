package cl.silvabravo.service;

import java.util.List;

import cl.silvabravo.model.Pasajero;

public interface PasajeroService {

	List <Pasajero> findAll();
	void save(Pasajero pasajero);
}
