package com.cap.divulgatudo.DTO;

import javax.validation.constraints.NotBlank;

public class AnuncioDTO {
	
	private Long id_Anuncio;
	@NotBlank //NotBlank.anuncioDTO.nome_Anuncio=não pode estar em branco
	private String nome_Anuncio;
	@NotBlank
	private String cliente;
	@NotBlank
	private String data_Inicio;
	@NotBlank
	private String data_Termino;
	@NotBlank
	private String investimento_Dia;
	
	public AnuncioDTO() {
		
	}
	
	public AnuncioDTO(Long id_Anuncio, String nome_Anuncio, String cliente, String data_Inicio, String data_Termino, String investimento_Dia) {
		this.id_Anuncio = id_Anuncio;
		this.nome_Anuncio = nome_Anuncio;
		this.cliente = cliente;
		this.data_Inicio = data_Inicio;
		this.data_Termino = data_Termino;
		this.investimento_Dia = investimento_Dia;
	}

	public Long getId_Anuncio() {
		return id_Anuncio;
	}

	public void setId_Anuncio(Long id_Anuncio) {
		this.id_Anuncio = id_Anuncio;
	}

	public String getNome_Anuncio() {
		return nome_Anuncio;
	}

	public void setNome_Anuncio(String nome_Anuncio) {
		this.nome_Anuncio = nome_Anuncio;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getData_Inicio() {
		return data_Inicio;
	}

	public void setData_Inicio(String data_Inicio) {
		this.data_Inicio = data_Inicio;
	}

	public String getData_Termino() {
		return data_Termino;
	}

	public void setData_Termino(String data_Termino) {
		this.data_Termino = data_Termino;
	}

	public String getInvestimento_Dia() {
		return investimento_Dia;
	}

	public void setInvestimento_Dia(String investimento_Dia) {
		this.investimento_Dia = investimento_Dia;
	}

	
}
