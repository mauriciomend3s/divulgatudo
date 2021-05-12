package com.cap.divulgatudo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cap.divulgatudo.model.Anuncio;


public interface AnuncioRepository extends JpaRepository<Anuncio, Long> {
	
	@Query("SELECT a FROM Anuncio a WHERE "
			+ "CONCAT (a.cliente, a.data_Inicio, a.data_Termino)"
			+ " LIKE %?1%")
	public List<Anuncio> findAll(String filtro);

}
