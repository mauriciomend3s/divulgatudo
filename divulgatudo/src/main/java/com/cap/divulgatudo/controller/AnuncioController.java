package com.cap.divulgatudo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cap.divulgatudo.model.Anuncio;
import com.cap.divulgatudo.service.AnuncioService;
import com.cap.divulgatudo.repository.AnuncioRepository;

import java.util.List;

@Controller
public class AnuncioController {
	@Autowired
	private AnuncioService service;

	@RequestMapping("/")
	public String viewHomeIndex(Model model, @Param("filtro") String filtro) {
		
		List<Anuncio> listAnuncios = service.listall(filtro);
		model.addAttribute("listAnuncios", listAnuncios);
		model.addAttribute("filtro", filtro);

		return "index";
	}

	@RequestMapping("/new")
	public String showNewAnuncioForm(Model model) {
		Anuncio anuncio = new Anuncio();
		model.addAttribute("anuncio", anuncio);

		return "new_anuncio";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveAnuncio(@ModelAttribute("anuncio") Anuncio anuncio) {
		service.save(anuncio);

		return "redirect:/";
	}

	@RequestMapping("/edit/{id_Anuncio}")
	public ModelAndView showEditAnuncioForm(@PathVariable(name = "id_Anuncio") Long id_Anuncio) {
		ModelAndView mav = new ModelAndView("edit_anuncio");

		Anuncio anuncio = service.get(id_Anuncio);
		mav.addObject("anuncio", anuncio);

		return mav;
	}

	@RequestMapping("/delete/{id_Anuncio}")
	public String deleteAnuncio(@PathVariable(name = "id_Anuncio") Long id_Anuncio) {
		service.delete(id_Anuncio);

		return "redirect:/";
	}

}