package com.matheusgr.apresentacao;

public class ApresentacaoLinhas implements ApresentacaoInterface{
	
	private String texto;
	private int numeroLinhas;
	private String escolha;
	
	public ApresentacaoLinhas(String texto, int numeroLinhas, String escolha) {
		this.texto = texto;
		this.numeroLinhas = numeroLinhas;
		this.escolha = escolha;
	}

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
			for (int i = numeroLinhas; i < this.numeroLinhas; i++) {
				saida += saidaArray[saidaArray.length - 1] + "\r\n";
			}
		}
		return saida;
	}
	
}
