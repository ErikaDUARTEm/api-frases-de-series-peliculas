package com.frases.series_peliculas.repository;

import com.frases.series_peliculas.dto.FrasesDTO;
import com.frases.series_peliculas.model.Frase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface FraseRepository extends JpaRepository<Frase, Long> {
    @Query("SELECT f FROM Frase f order by function('RANDOM') LIMIT 1")
    public Frase obtenerFraseAleatoria();
}
