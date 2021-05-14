package com.cap.divulgatudo.calculadora;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import com.cap.divulgatudo.model.Anuncio;
import com.cap.divulgatudo.model.Projecao;

public class Calculadora {
	Anuncio anuncioCalcular = new Anuncio();
	public Double visualizacao;
	public Double visualizacaoDeCompartilhamento;
	public Double totalVisualizacao;
	public Double clique;
	public Double compartilhamento;
	public Double valorInvestido;

	public Projecao calcular(Anuncio anuncioC) {

		long mili = Math.abs(anuncioC.getData_Termino().getTime() - anuncioC.getData_Inicio().getTime());
		long dias = TimeUnit.DAYS.convert(mili, TimeUnit.MILLISECONDS);

		if(dias > 0){
		valorInvestido = anuncioC.getInvestimento_Dia() * dias;
		} else {
		valorInvestido = anuncioC.getInvestimento_Dia() * 1;
		}
		visualizacao = (valorInvestido * 30) / 1;
		clique = (visualizacao * 12) / 100;
		clique = (double) Math.round(clique);
		compartilhamento = (clique * 3) / 20;
		compartilhamento = (double) Math.round(compartilhamento);
		visualizacaoDeCompartilhamento = (compartilhamento * 40) / 1;

		int totalCompartilhamentosSequenciais = 0;
		for (int i = 0; i < visualizacaoDeCompartilhamento.intValue(); i++) {
			int sequenciaCompartilhada = sequenciaAleatoriaCompartilhamentos();
			totalCompartilhamentosSequenciais += (sequenciaCompartilhada - 1);
		}

		totalVisualizacao = visualizacao + visualizacaoDeCompartilhamento + totalCompartilhamentosSequenciais;
		
		Projecao projecao = new Projecao(totalVisualizacao.longValue(), clique.longValue(), visualizacaoDeCompartilhamento.longValue() + totalCompartilhamentosSequenciais, valorInvestido);

		return projecao;

	}

	private static int sequenciaAleatoriaCompartilhamentos() {
		Random r = new Random();
		int sequenciaCompartilhada = r.nextInt(4) + 1;
		return sequenciaCompartilhada;
	}

}