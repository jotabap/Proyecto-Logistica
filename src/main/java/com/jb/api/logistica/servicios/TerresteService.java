package com.jb.api.logistica.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.jb.api.logistica.entidad.Terrestre;
import com.jb.api.logistica.repositorio.TerrestreRepository;

@Service
public class TerresteService {
	
     @Autowired
	private TerrestreRepository terrestrerepo;
     
     public void guardar(Terrestre terretre){
    	 terrestrerepo.save(terretre);
 		
    	 	}
     public Terrestre obtenerUnTerrestre(Integer guia) {
 		return terrestrerepo.getOne(guia);
 	}
}
