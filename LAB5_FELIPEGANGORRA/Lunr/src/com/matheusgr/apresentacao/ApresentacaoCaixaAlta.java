package com.matheusgr.apresentacao;

/**
 * Classe responsavel pela definição do método de apresentação com Caixa Alta.
 * 
 * @author Felipe Gangorra.
 */
public class ApresentacaoCaixaAlta implements ApresentacaoInterface{
	
	/**
	 * Documento passado
	 */
	private String texto;
	
	/**
	 * Construtor padrão.
	 * 
	 * @param texto Documento
	 */
	public ApresentacaoCaixaAlta(String texto) {
		this.texto = texto;
	}
	
	/**
	 * Método que coloca o documento em caixa alta.
	 */
	public String apresentacao() {
		return texto.toUpperCase();
	}
}
