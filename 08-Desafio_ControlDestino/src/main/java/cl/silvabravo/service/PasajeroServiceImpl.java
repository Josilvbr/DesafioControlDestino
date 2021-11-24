package cl.silvabravo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.silvabravo.model.Pasajero;
import cl.silvabravo.repository.PasajeroRepository​;

@Service
public class PasajeroServiceImpl implements PasajeroService {

	@Autowired
	private PasajeroRepository​ pasajeroRepository​;
	
	@Override
	public List<Pasajero> findAll() {
		// TODO Auto-generated method stub
		return pasajeroRepository​.findAll();
	}

	@Override
	public void save(Pasajero pasajero) {
		// TODO Auto-generated method stub
		pasajeroRepository​.save(pasajero);
	}

}
