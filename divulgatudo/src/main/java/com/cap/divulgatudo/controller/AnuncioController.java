package com.cap.divulgatudo.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cap.divulgatudo.DTO.AnuncioDTO;
import com.cap.divulgatudo.calculadora.Calculadora;
import com.cap.divulgatudo.model.Anuncio;
import com.cap.divulgatudo.model.Projecao;
import com.cap.divulgatudo.service.AnuncioService;

@Controller
public class AnuncioController {

	@Autowired
	private AnuncioService service;

	@RequestMapping("/")
	public String viewHomeIndex(Model model, @Param("filtro") String filtro) {

		// SimpleDateFormat formatterBr = new SimpleDateFormat("dd/MM/yyyy");
		List<Anuncio> listAnuncios = service.listall(filtro);

			Calculadora calculadora = new Calculadora();
		for (int i = 0; i < listAnuncios.size(); i++) {
			Projecao projecao = calculadora.calcular(listAnuncios.get(i));
			listAnuncios.get(i).setProjecao(projecao);
		}

//		List<AnuncioDTO> listAnunciosDto = new ArrayList<>();

//		for (int i = 0; i < listAnuncios.size(); i++) {

//			String dateIni = formatterBr.format(listAnuncios.get(i).getData_Inicio());
//			String dateTer = formatterBr.format(listAnuncios.get(i).getData_Termino());

//				AnuncioDTO anuncioDto = new AnuncioDTO();
//			anuncioDto.setId_Anuncio(listAnuncios.get(i).getId_Anuncio());
//			anuncioDto.setNome_Anuncio(listAnuncios.get(i).getNome_Anuncio());
		// anuncioDto.setCliente(listAnuncios.get(i).getCliente());
		// anuncioDto.setData_Inicio(dateIni);
		// anuncioDto.setData_Termino(dateTer);
		// anuncioDto.setInvestimento_Dia(String.valueOf(listAnuncios.get(i).getInvestimento_Dia()));
		// listAnunciosDto.add(anuncioDto);
//		}

		// model.addAttribute("listAnunciosDto", listAnunciosDto);
		model.addAttribute("listAnuncios", listAnuncios);
		model.addAttribute("filtro", filtro);

		return "index";
	}

	@RequestMapping("/new")
	public String showNewAnuncioForm(AnuncioDTO anuncioDto) {
		return "new_anuncio";
	}

	@RequestMapping("/home")
	public String showNewAnuncioHome(Model model) {
		Anuncio anuncio = new Anuncio();
		model.addAttribute("anuncio", anuncio);

		return "home";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveAnuncio(@Valid AnuncioDTO anuncioDto, BindingResult result) throws ParseException {

		if (result.hasErrors()) {
			return "new_anuncio";
		}

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date dateInicio = formatter.parse(anuncioDto.getData_Inicio().trim());
		Date dateTermino = formatter.parse(anuncioDto.getData_Termino().trim());

		Anuncio anuncio = new Anuncio();

		anuncio.setNome_Anuncio(anuncioDto.getNome_Anuncio());
		anuncio.setCliente(anuncioDto.getCliente());
		anuncio.setData_Inicio(dateInicio);
		anuncio.setData_Termino(dateTermino);
		anuncio.setInvestimento_Dia(Double.parseDouble(anuncioDto.getInvestimento_Dia()));
		service.save(anuncio);

		return "redirect:/";
	}

	@RequestMapping("/edit/{id_Anuncio}")
	public ModelAndView showEditAnuncioForm(@PathVariable(name = "id_Anuncio") Long id_Anuncio) {
		ModelAndView mav = new ModelAndView("edit_anuncio");

		Anuncio anuncio = service.get(id_Anuncio);

		//service.updateAnuncio(id_Anuncio, anuncio);
		mav.addObject("anuncio", anuncio);
		return mav;
	}

	@RequestMapping("/delete/{id_Anuncio}")
	public String deleteAnuncio(@PathVariable(name = "id_Anuncio") Long id_Anuncio) {
		service.delete(id_Anuncio);

		return "redirect:/";
	}

}