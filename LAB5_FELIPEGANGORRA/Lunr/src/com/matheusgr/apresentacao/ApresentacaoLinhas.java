package com.matheusgr.apresentacao;

/**
 * Classe responsavel pelos métodos de apresentação de linhas.
 * Há a apresentação por Primeiras linhas e por últimas linhas.
 * 
 * @author Felipe Gangorra
 *
 */

public class ApresentacaoLinhas implements ApresentacaoInterface{
	
	/**
	 * Documento passado
	 */
	private String texto;
	
	/**
	 * Número de linhas para resgata
	 */
	private int numeroLinhas;
	
	/**
	 * condição para o método 
	 */
	private String escolha;
	
	/**
	 * Construtor padrão dos atributos.
	 * 
	 * @param texto Documento
	 * @param numeroLinhas Linhas para resgata
	 * @param escolha condição para método
	 */
	public ApresentacaoLinhas(String texto, int numeroLinhas, String escolha) {
		this.texto = texto;
		this.numeroLinhas = numeroLinhas;
		this.escolha = escolha;
	}

	/**
	 * Método onde é feito a fragmentação do documento passado, passando como parametro
	 * a quantidade de linhas desejadas. Há uma condição para determinar se será primeiras linhas 
	 * ou últimas linhas do documento.
	 * 
	 * @return saida Uma string com o documento editao.
	 **/
	
	@Override
	public String apresentacao() {
		String[] saidaArray = texto.split("\r\n");
		String saida = "";
		
		if (escolha.equals("primeiras")) {
			for (int i = 0; i < this.numeroLinhas; i++) {
				saida += saidaArray[i] + "\r\n";
			}
		}
		
		if (escolha.equals("segundas")) {
			for (int i = 0; i < this.numeroLinhas; i++) {
				saida += saidaArray[saidaArray.length - 1] + "\r\n";
			}
		}
		return saida;
	}
	
}
