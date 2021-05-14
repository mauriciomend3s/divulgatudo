package com.cap.divulgatudo.model;

public class Projecao {

	private Long qtdMaximaVisualizacoes;
	private Long qtdMaximaCliques;
	private Long qtdMaximaCompartilhamentos;
	private Double valorTotalInvestido;

	public Projecao(Long qtdMaximaVisualizacoes, Long qtdMaximaCliques, Long qtdMaximaCompartilhamentos,
			Double valorTotalInvestido) {
		super();
		this.qtdMaximaVisualizacoes = qtdMaximaVisualizacoes;
		this.qtdMaximaCliques = qtdMaximaCliques;
		this.qtdMaximaCompartilhamentos = qtdMaximaCompartilhamentos;
		this.valorTotalInvestido = valorTotalInvestido;
	}

	public Long getQtdMaximaVisualizacoes() {
		return qtdMaximaVisualizacoes;
	}

	public void setQtdMaximaVisualizacoes(Long qtdMaximaVisualizacoes) {
		this.qtdMaximaVisualizacoes = qtdMaximaVisualizacoes;
	}

	public Long getQtdMaximaCliques() {
		return qtdMaximaCliques;
	}

	public void setQtdMaximaCliques(Long qtdMaximaCliques) {
		this.qtdMaximaCliques = qtdMaximaCliques;
	}

	public Long getQtdMaximaCompartilhamentos() {
		return qtdMaximaCompartilhamentos;
	}

	public void setQtdMaximaCompartilhamentos(Long qtdMaximaCompartilhamentos) {
		this.qtdMaximaCompartilhamentos = qtdMaximaCompartilhamentos;
	}

	public Double getValorTotalInvestido() {
		return valorTotalInvestido;
	}

	public void setValorTotalInvestido(Double valorTotalInvestido) {
		this.valorTotalInvestido = valorTotalInvestido;
	}

}
