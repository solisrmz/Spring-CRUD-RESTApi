package com.example.library.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@GetMapping("/nombre")
	public String nombreSitio() {
		return "Mi primer sitio en spring";
	}
	@GetMapping("/descripcion")
	public String descripcionSitio() {
		return "API REST";
	}

}
