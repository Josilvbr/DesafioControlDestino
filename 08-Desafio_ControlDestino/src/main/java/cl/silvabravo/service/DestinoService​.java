package cl.silvabravo.service;

import java.util.List;

import cl.silvabravo.model.Destino;

public interface DestinoService​ {

	List <Destino> findAll();
	void save(Destino destino);
}
