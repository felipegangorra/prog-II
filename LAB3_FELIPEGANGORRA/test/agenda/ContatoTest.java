package agenda;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Testes para a classe contato.
 * 
 * @author Felipe Gangorra.
 */

public class ContatoTest {
    
    private Contato contatoBase;
    private Contato contatoAux;
    
    @BeforeEach
    void preparaContatos() {
        this.contatoBase = new Contato("Felipe", "Gangorra", "0000-0000");
        this.contatoAux = new Contato("Fulano", "Nota10", "1010-1010");
    }

    /**
     * Teste para verificar método de construir nome completo.
     */
    @Test
    void testNomeCompleto() {
       String msg = "Esperando obter o nome completo";
       assertEquals( "Felipe Gangorra", this.contatoBase.getUsuarioCompleto(), msg);
    }
    
    /**
     * Teste para verificar método de obter nome do contato.
     */
    @Test
    void testPegandoNome() {
    	String msg = "Esperando o nome";
    	assertEquals("Felipe", this.contatoBase.getNome(), msg);
    }
    
    /**
     * Teste para verificar método de obter sobrenome do contato.
     */
    @Test
    void testPegandoSobrenome() {
    	String msg = "Essperando o sobrenome";
    	assertEquals("Gangorra", this.contatoBase.getSobrenome(), msg);
    }
    
    /**
     * Teste para verificar a reescrita do ToString do contato.
     */
    @Test
    void testToString() {
    	String msg = "Esperando obter o contato completo";
    	assertEquals("Felipe Gangorra\n0000-0000", this.contatoBase.toString(), msg);
    }
	
    /**
     * Teste para verificar a função equals.
     */
    @Test
    void testEquals() {
    	String msg = "Esperando ser diferente";
    	assertNotEquals(contatoBase, contatoAux);
    }
}
