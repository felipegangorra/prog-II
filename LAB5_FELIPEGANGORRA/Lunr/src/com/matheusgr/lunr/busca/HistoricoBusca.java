package com.matheusgr.lunr.busca;

/**
 * Armazena o histórico de uma busca realizada. O histórico não deve ter custo
 * computacional e deve ser genérico para diferentes tipos de busca.
 */
public class HistoricoBusca {

	private Busca buscado;
	private String[] documentosIds;

	/**
	 * Construção do histórico a partir dos parâmetros de busca (definido pelo
	 * objeto de busca) e resultado da consulta.
	 * 
	 * @param busca      Objeto de busca realizado.
	 * @param documentos Resultado da pesquisa.
	 */
	public HistoricoBusca(Busca buscado, String[] documentosIds) {
		this.buscado = buscado;
		this.documentosIds = documentosIds;
	}

	/**
	 * Depura uma busca onde cada linha representa um parâmetro de busca e cada
	 * coluna representa esse parâmetro em detalhes.
	 * 
	 * @return Depuração da busca. Cada linha representa um parâmetro de busca e
	 *         cada coluna um detalhamento desse parâmetro (ex.: NOME_DO_PARAMETRO e
	 *         VALOR).
	 */
	public String[][] debug() {
		return this.buscado.descreverConsulta();
	}

	/**
	 * Retorna os IDs dos documentos retornados da busca.
	 * 
	 * @return Array de string com IDs dos documentos retornados.
	 */
	public String[] ids() {
		return documentosIds;
	}

}