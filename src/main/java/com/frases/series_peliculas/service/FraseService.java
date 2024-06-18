package com.frases.series_peliculas.service;

import com.frases.series_peliculas.dto.FrasesDTO;
import com.frases.series_peliculas.model.Frase;
import com.frases.series_peliculas.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {
    @Autowired
    private FraseRepository repository;

    public FrasesDTO obtenerFraseAleatoria() {

        Frase frase = repository.obtenerFraseAleatoria();
        return new FrasesDTO( frase.getTitulo(), frase.getFrase(), frase.getPersonaje(), frase.getPoster());

    }
}
