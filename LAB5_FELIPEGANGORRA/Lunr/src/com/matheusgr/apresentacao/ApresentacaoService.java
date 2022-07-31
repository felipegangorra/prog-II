package com.matheusgr.apresentacao;

import java.util.Optional;

import com.matheusgr.lunr.documento.Documento;
import com.matheusgr.lunr.documento.DocumentoService;

/**
 * Componente para tratamento da lógica de negócio relativa 
 * a apresentação de documentos.
 */
public class ApresentacaoService {

	private DocumentoService documentoService;

	/**
	 * Inicialização da lógica de serviço.
	 * 
	 * @param documentoService DocumentoService a ser utilizado pelo
	 *                         ApresentacaoService.
	 */
	public ApresentacaoService(DocumentoService documentoService) {
		this.documentoService = documentoService;
	}

	/**
	 * Realiza a apresentação do documento indicado.
	 * 
	 *  
	 * @param docId1 Documento a ser apresentado.
	 * @param tipoApresentacao modo de apresentacao a ser aplicado sobre o documento.
	 */
	public String apresenta(String docId, String tipoApresentacao) {
		
		Optional<Documento> documento =  this.documentoService.recuperaDocumento(docId);
		String texto = documento.get().getTextOriginal();
		String saida = "";

		saida = new ApresentacaoCaixaAlta(texto).apresentacao();
		
		return saida;
	}

	public String apresenta(String docId, String tipoApresentacao, int numLinhas) {
		
		Optional<Documento> documento =  this.documentoService.recuperaDocumento(docId);
		String texto = documento.get().getTextOriginal();
		String saida = "";
		
		if (tipoApresentacao.equals("pl")) {
			saida = new ApresentacaoLinhas(texto, numLinhas, "primeiras").apresentacao();
		}
		if (tipoApresentacao.equals("ul")) {
			saida = new ApresentacaoLinhas(texto, numLinhas, "segundas").apresentacao();
		}
		
		return saida;
	}
	
}
