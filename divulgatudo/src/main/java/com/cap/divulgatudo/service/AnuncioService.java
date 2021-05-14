package com.cap.divulgatudo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.divulgatudo.model.Anuncio;
import com.cap.divulgatudo.repository.AnuncioRepository;

import java.util.List;

@Service
public class AnuncioService {
	@Autowired
	private AnuncioRepository repo;
	
	public List <Anuncio>listall(String filtro) {
		if (filtro != null) {
			return repo.findAll(filtro);
		}
		return repo.findAll();
	}
	
	public void save(Anuncio anuncio) {
		repo.save(anuncio);
		
	}
	
	public Anuncio get(Long id_Anuncio) {
		return repo.findById(id_Anuncio).get();
		
	}
	
	public void delete(Long id_Anuncio) {
		repo.deleteById(id_Anuncio);
	}	

//	public void updateAnuncio(Long id, Anuncio anuncio) {
//    repo.updateAnuncio(id, anuncio);
//}

}
