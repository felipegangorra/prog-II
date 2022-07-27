package com.matheusgr.lunr.busca;

import java.util.Map;

import com.matheusgr.lunr.documento.Documento;
import com.matheusgr.lunr.documento.DocumentoService;

/**
 * interface de busca
 * @author gangorra
 *
 */
public interface Busca {

	/**
	 * metodo reponsavel por realizar a busca!
	 * @param ds
	 * @return
	 */
	 public Map<Documento, Integer> busca(DocumentoService ds);
}
