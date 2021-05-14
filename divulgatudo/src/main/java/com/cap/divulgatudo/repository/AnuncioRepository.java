package com.cap.divulgatudo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cap.divulgatudo.DTO.AnuncioDTO;
import com.cap.divulgatudo.model.Anuncio;


public interface AnuncioRepository extends JpaRepository<Anuncio, Long> {
	
	@Query("SELECT a FROM Anuncio a WHERE "
			+ "CONCAT (a.cliente, a.data_Inicio, a.data_Termino)"
			+ " LIKE %?1%")
	public List<Anuncio> findAll(String filtro);

//	@Modifying
//@Query("update Anuncio a set a.anuncio = :anuncio where a.id_Anuncio = :id")
//void updateAnuncio(@Param(value = "id_Anuncio") Long id, @Param(value = "anuncio") Anuncio anuncio);

}
