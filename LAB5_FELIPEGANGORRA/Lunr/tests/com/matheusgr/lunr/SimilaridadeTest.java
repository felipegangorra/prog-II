package com.matheusgr.lunr;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class SimilaridadeTest extends BaseTest {
	
	@Test
	void testSimilaridade() {
		assertEquals(0.5, this.similaridadeController.similaridade(TEXTO1_ID, TEXTO2_ID));
	}
	
    @Test
    void testSimilaridadeTotal() {
        this.documentoController.adicionaDocumentoTxt(TEXTO3_ID,"um arquivo! texto simples.\r\nuse DUAS linhas apenas.");
        assertEquals(1.0, this.similaridadeController.similaridade(TEXTO1_ID,TEXTO3_ID));
    }
	
    @Test
    void testSimilaridadeDiferente() {
        this.documentoController.adicionaDocumentoTxt(TEXTO3_ID, "Qual a maior ilusão da vida?");
        this.documentoController.adicionaDocumentoTxt(TEXTO4_ID, "Inocência.");
        assertEquals(0.0, this.similaridadeController.similaridade(TEXTO3_ID, TEXTO4_ID));
    }
}
