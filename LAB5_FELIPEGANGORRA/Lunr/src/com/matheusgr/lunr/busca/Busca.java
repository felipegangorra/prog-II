package com.matheusgr.lunr.busca;

import java.util.Map;

import com.matheusgr.lunr.documento.Documento;
import com.matheusgr.lunr.documento.DocumentoService;

/**
 * interface de busca, representando a busca do sistema.
 * 
 * @author Felipe Gangorra
 */
public interface Busca {

	/**
	 * Busca através do DocumentoService, onde são feitas as operações de busca simples e avançada.
	 * 
	 * @param DocumentoService utilizado na busca
	 * @return mapa com os documentos encontrados.
	 */
	 public Map<Documento, Integer> busca(DocumentoService ds);
	 
	 /**
	  * Descreve consulta da busca.
	  * 
	  * @return
	  */
	 public String [][] descreverConsulta();
}
