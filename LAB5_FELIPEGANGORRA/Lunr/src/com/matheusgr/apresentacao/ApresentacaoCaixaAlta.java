package com.matheusgr.apresentacao;

public class ApresentacaoCaixaAlta implements ApresentacaoInterface{

	private String texto;
	
	public ApresentacaoCaixaAlta(String texto) {
		this.texto = texto;
	}
	
	public String apresentacao() {
		return texto.toUpperCase();
	}
}
