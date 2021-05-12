package com.cap.divulgatudo.model;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Anuncio {
	
	private Long id_Anuncio;
	private String nome_Anuncio;
	private String cliente;
	private String data_Inicio;
	private String data_Termino;
	private Double investimento_Dia;

	public Anuncio() {

	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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

	public Double getInvestimento_Dia() {
		return investimento_Dia;
	}

	public void setInvestimento_Dia(Double investimento_Dia) {
		this.investimento_Dia = investimento_Dia;
	}
}
