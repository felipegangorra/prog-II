package com.matheusgr.apresentacao;

public class ApresentacaoPrimeirasLinhas implements ApresentacaoInterface{
	
	private String texto;
	private int numeroLinhas;
	
	public ApresentacaoPrimeirasLinhas(String texto, int numeroLinhas) {
		this.texto = texto;
		this.numeroLinhas = numeroLinhas;
	}
	
	public String apresentacao() {
		String[] saidaArray = texto.split("\r\n");
		String saida = "";
		
		for (int i = 0; i < this.numeroLinhas; i++) {
			saida += saidaArray[i] + "\r\n";
		}
		
		return saida;
	}
}
