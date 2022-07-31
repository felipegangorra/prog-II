package com.matheusgr.lunr;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ApresentacaoTest extends BaseTest {

	@Test
	void testCaixaAlta() {
		this.documentoController.adicionaDocumentoHtml("10", "paralelepípedo");
		assertEquals("PARALELEPÍPEDO", this.apresentacaoController.apresenta("10", "cp"));
	}
	
	@Test
	void testPrimeirasLinhas() {
	  this.documentoController.adicionaDocumentoTxt("izi", "Vós que entrais\r\nabandonai toda a esperança.");
	  assertEquals("Vós que entrais\r\n", this.apresentacaoController.apresenta("izi", "pl", 1));
	} 
	
	@Test
	void testUltimasLinhas() {
	  this.documentoController.adicionaDocumentoTxt("ggwp", "Vós que entrais\r\nabandonai toda a esperança.");
	  assertEquals("abandonai toda a esperança.\r\n", this.apresentacaoController.apresenta("ggwp", "ul", 1));
	}  
}
