package com.matheusgr.apresentacao;

public class ApresentacaoUltimasLinhas implements ApresentacaoInterface{
	
	private String texto;
	private int numeroLinhas;
	
	public ApresentacaoUltimasLinhas(String texto, int numeroLinhas) {
		this.texto = texto;
		this.numeroLinhas = numeroLinhas;
	}
	
	public String apresentacao() {
		String[] saidaArray = texto.split("\r\n");
		String saida = "";
		
		for (int i = numeroLinhas; i < this.numeroLinhas; i++) {
			saida += saidaArray[saidaArray.length - 1] + "\r\n";
		}
		
		return saida;
	}
}

