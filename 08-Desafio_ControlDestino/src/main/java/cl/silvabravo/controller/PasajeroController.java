package cl.silvabravo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import cl.silvabravo.model.Pasajero;
import cl.silvabravo.service.DestinoService​;
import cl.silvabravo.service.PasajeroService;

@Controller
@RequestMapping({"/","pasajeros"})
public class PasajeroController {
	
	@Autowired
	private PasajeroService pasajeroService;
	
	@Autowired
	private DestinoService​ destinoService​;
	
	@GetMapping("/crear")
	public ModelAndView crearPasajero() {
		ModelAndView modelAndView = new ModelAndView("crear-pasajero");
		modelAndView.addObject("pasajero", new Pasajero());
		modelAndView.addObject("destinos", destinoService​.findAll());
		return modelAndView;
	}
	
	@PostMapping("/crear")
	public RedirectView crearPasajero(@ModelAttribute Pasajero pasajero) {
		pasajeroService.save(pasajero);
		return new RedirectView("/pasajeros");
	}
	
	@GetMapping
	public ModelAndView pasajeros() {
		ModelAndView modelAndView = new ModelAndView("pasajeros");
		modelAndView.addObject("pasajeros", pasajeroService.findAll());
		return modelAndView;
	}

}
