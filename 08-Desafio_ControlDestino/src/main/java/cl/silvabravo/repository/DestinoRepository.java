package cl.silvabravo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.silvabravo.model.Destino;

@Repository
public interface DestinoRepository extends JpaRepository<Destino, Long>{

	
}
