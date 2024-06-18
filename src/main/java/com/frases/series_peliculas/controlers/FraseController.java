package com.frases.series_peliculas.controlers;

import com.frases.series_peliculas.dto.FrasesDTO;
import com.frases.series_peliculas.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraseController {
    @Autowired
    FraseService servicio;
    @GetMapping("/series/frases")
    public FrasesDTO obtenerFrasesAleatorias(){
        return servicio.obtenerFraseAleatoria();
    };
}
