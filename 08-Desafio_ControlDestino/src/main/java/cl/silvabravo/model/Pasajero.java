package cl.silvabravo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Pasajero {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String rut;
	private String nombre;
	private String apellido;
	private int edad;
	private String ciudadNatal;
	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "pasajero")
	//@JoinColumn(name = "destino_id", referencedColumnName = "id")
	private List<Destino> destinos;
}
