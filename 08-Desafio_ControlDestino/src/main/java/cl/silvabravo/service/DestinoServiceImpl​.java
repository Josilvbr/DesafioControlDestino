package cl.silvabravo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.silvabravo.model.Destino;
import cl.silvabravo.repository.DestinoRepository;

@Service
public class DestinoServiceImpl‚Äč implements DestinoService‚Äč {

	@Autowired
	private DestinoRepository destinoRepository;
	
	@Override
	public List<Destino> findAll() {
		// TODO Auto-generated method stub
		return destinoRepository.findAll();
	}

	@Override
	public void save(Destino destino) {
		// TODO Auto-generated method stub
		destinoRepository.save(destino);
		
	}

}
