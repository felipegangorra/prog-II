package com.matheusgr.lunr;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ApresentacaoTest extends BaseTest {

	@Test
	void testCaixaAlta() {
		this.documentoController.adicionaDocumentoHtml("10", "paralelepípedo");
		assertEquals("PARALELEPÍPEDO", this.apresentacaoController.apresenta("10", "cp"));
	}
}
