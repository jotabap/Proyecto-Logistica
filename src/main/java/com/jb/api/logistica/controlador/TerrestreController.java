package com.jb.api.logistica.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.jb.api.logistica.entidad.Terrestre;
import com.jb.api.logistica.servicios.TerresteService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TerrestreController {
	@Autowired
private TerresteService terresteser;
	@PostMapping("api/terrestres")
	
	public Terrestre guardarTerrestre(@RequestBody Terrestre terrestre){
		System.out.println(terrestre);
		terresteser.guardar(terrestre);
    	return null;
		
	}
	@GetMapping("api/terrestres/{guia}") 
    public Terrestre obtenerTerrestre(@PathVariable("guia") Integer guia) {
    	return terresteser.obtenerUnTerrestre(guia);
    }
}
