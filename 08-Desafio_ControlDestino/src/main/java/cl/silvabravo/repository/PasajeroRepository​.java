package cl.silvabravo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.silvabravo.model.Pasajero;

@Repository
public interface PasajeroRepository​ extends JpaRepository<Pasajero, Long>{

}
