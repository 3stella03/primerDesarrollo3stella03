package cl.twk.proyectos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping(value = "tortas")
	public String recetasTortas() {
		return "recetasTortas";
	}
	
	@GetMapping(value = "donas")
	public String donas() {
		return "donas";
	}
	
	@GetMapping(value = "postres")
	public String postres() {
		return "postres";
	}
	
	@GetMapping(value = "coctel")
	public String coctel() {
		return "coctel";
	}
	
	@GetMapping(value = "dulce")
	public String dulce() {
		return "dulce";
	}
	
}