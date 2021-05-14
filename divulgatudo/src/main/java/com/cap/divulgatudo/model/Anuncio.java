package com.cap.divulgatudo.model;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;


@Entity
@Table(name="anuncio")
public class Anuncio {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_Anuncio;
	
	@Column(length = 255, nullable = false)
	private String nome_Anuncio;

	@Column(length = 255, nullable = false)
	private String cliente;
	
	@Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
	private Date data_Inicio;

	@Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
	private Date data_Termino;
	
	@Column(nullable = false )
	private Double investimento_Dia;

	@Transient
	private Projecao projecao;

	public Anuncio() {

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

	public Date getData_Inicio() {
		return data_Inicio;
	}

	public void setData_Inicio(Date data_Inicio) {
		this.data_Inicio = data_Inicio;
	}

	public Date getData_Termino() {
		return data_Termino;
	}

	public void setData_Termino(Date data_Termino) {
		this.data_Termino = data_Termino;
	}

	public Double getInvestimento_Dia() {
		return investimento_Dia;
	}

	public void setInvestimento_Dia(Double investimento_Dia) {
		this.investimento_Dia = investimento_Dia;
	}

		public Projecao getProjecao() {
		return projecao;
	}

	public void setProjecao(Projecao projecao) {
		this.projecao = projecao;
	}
}
