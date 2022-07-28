package com.matheusgr.similaridade;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import com.matheusgr.lunr.documento.Documento;
import com.matheusgr.lunr.documento.DocumentoService;

/**
 * Componente para tratamento da lógica de negócio relativa a similaridade.
 */
public class SimilaridadeService {

	private DocumentoService documentoService;

	/**
	 * Inicialização da lógica de serviço.
	 * 
	 * @param documentoService DocumentoService a ser utilizado pelo
	 *                         SimilaridadeService.
	 */
	public SimilaridadeService(DocumentoService documentoService) {
		this.documentoService = documentoService;
	}

	/**
	 * Calcula e retorna a similaridade.
	 * 
	 * Para o cálculo da similaridade:
	 * <ul>
	 * <li>Pega o documento 1</li>
	 * <li>Pega o documento 2</li>
	 * <li>Pega os termos do documento 1 e coloca em um conjunto (Termos1)</li>
	 * <li>Pega os termos do documento 2 e coloca em um conjunto (Termos2)</li>
	 * <li>Calcula a interseção entre Termos1 e Termos2 (Inters)</li>
	 * <li>Calcula a união entre Termos1 e Termos2 (Uniao)</li>
	 * <li>A similaridade é o tamanho de Inters sobre o tamanho do conjunto
	 * Uniao</li>
	 * </ul>
	 * 
	 * @param docId1 Documento 1.
	 * @param docId2 Documento 2.
	 * @return Valor de similaridade (entre 0 e 1, inclusives) representando a
	 *         semelhança entre os documentos.
	 */
	public double similaridade(String docId1, String docId2) {
		this.documentoService.recuperaDocumento(docId1);
		// PEGA DOCUMENTO 1
		// PEGA DOCUMENTO 2
		Documento documento01 = this.documentoService.recuperaDocumento(docId1).get();
		Documento documento02 = this.documentoService.recuperaDocumento(docId2).get();
		
		// COLOCA TERMOS DO DOCUMENTO 1 EM UM CONJUNTO
		// COLOCA TERMOS DO DOCUMENTO 2 EM OUTRO CONJUNTO
		Set<String> documento01Set = new HashSet<>(Arrays.asList(documento01.getTexto()));
		Set<String> documento02Set = new HashSet<>(Arrays.asList(documento02.getTexto()));
		
		// A SIMILARIDADE É DETERMINADA PELO...
		// --> (TAMANHO DA INTERSEÇÃO) / (TAMANHO DA UNIÃO DOS CONJUNTOS)

	    Set<String> docTotal = new HashSet<>(documento01Set);
	    docTotal.addAll(documento02Set);

		int aux = 0;
		for (Object doc : documento01Set.toArray()) {
			if (documento02Set.contains(doc)){ aux++; }		//se tiver soma 1
		}
	    
		int intersecao = aux;
		
		return (double) intersecao/docTotal.size();
	}

}
