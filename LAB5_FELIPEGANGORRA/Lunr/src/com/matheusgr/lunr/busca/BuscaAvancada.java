package com.matheusgr.lunr.busca;

import java.util.HashMap;
import java.util.Map;

import com.matheusgr.lunr.documento.Documento;
import com.matheusgr.lunr.documento.DocumentoService;

public class BuscaAvancada implements Busca {
	
	private Map<String, String> metadados;
	
	/**
	 * construtor da class
	 */
	public BuscaAvancada(Map<String, String> metadados) {
		(new ValidadorBusca()).validaMetadados(metadados);
		this.metadados = metadados;
	}
	
	/**
	 * realizar busca a partir de documentoservice.		//01
	 */
	public Map<Documento, Integer> busca(DocumentoService ds) {
		Map<Documento, Integer> respostaDocumento = new HashMap<>();
		for (Documento d : ds.busca(metadados)) {
			respostaDocumento.put(d, 1);
		}
		return respostaDocumento;
	}
}
