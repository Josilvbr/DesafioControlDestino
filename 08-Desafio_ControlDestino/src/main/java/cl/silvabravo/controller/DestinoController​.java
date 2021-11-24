package cl.silvabravo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import cl.silvabravo.model.Destino;
import cl.silvabravo.service.DestinoService​;
import cl.silvabravo.service.PasajeroService;

@Controller
@RequestMapping("destinos") //Completar el request
public class DestinoController​ {

	@Autowired
	private DestinoService​ destinoService​;
	
	@Autowired
	private PasajeroService pasajeroService;
	
	@GetMapping("/crear")
	public ModelAndView crearDestino() {
		ModelAndView modelAndView = new ModelAndView("crear-destino");
		modelAndView.addObject("destino", new Destino());
		modelAndView.addObject("pasajeros", pasajeroService.findAll());
		return modelAndView;
	}
	
	@PostMapping("/crear")
	public RedirectView crearDestino(@ModelAttribute Destino destino) {
		destinoService​.save(destino);
		return new RedirectView("/destinos");
	}
	
	@GetMapping
	public ModelAndView destinos() {
		ModelAndView modelAndView = new ModelAndView("destinos");
		modelAndView.addObject("destinos", destinoService​.findAll());
		return modelAndView;
	}
}
