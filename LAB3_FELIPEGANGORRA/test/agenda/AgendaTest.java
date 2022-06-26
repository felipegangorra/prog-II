package agenda;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Testes para a classe Agenda.
 * 
 * @author Felipe Gangorra.
 */
class AgendaTest {
	
	private Agenda agenda;
	
	@BeforeEach
	void prepararAgenda() {
		this.agenda = new Agenda();
	}
	
	/**
	 * Teste para verificar o método de cadastra um contato.
	 */
	@Test
	void testCadastraContato() {
		this.agenda.cadastraContato(1, "Felipe", "Gangorra", "0000-0000");
		assertEquals("Felipe Gangorra", this.agenda.getContato(1).getUsuarioCompleto());
	}
	
	/**
	 * Teste para verificar o método de cadastra favorito e confirmar sua validação.
	 */
	@Test
	void testCadastraFavoritoEVerificar() {
		this.agenda.cadastraContato(1, "Felipe", "Gangorra", "0000-0000");
		this.agenda.cadastraFavorito(1, 1);
		assertEquals(this.agenda.ehFavorito(agenda.getContato(1)), true);
	}

	/**
	 * Teste para verificar o cadastro em uma posição já ocupada, reescrevendo o atual contato.
	 */
	@Test
	void testCadastraPosicaoNaoNull() {
		this.agenda.cadastraContato(1, "Felipe", "Gangorra", "0000-0000");
		this.agenda.cadastraContato(1, "Fulano", "Nota10", "1010-1010");
		assertEquals("Fulano Nota10", this.agenda.getContato(1).getUsuarioCompleto());
	}
	
	/**
	 * Teste para verificar se um contato já existe. 
	 */
	@Test
	void testCadastroJaExistente() {
		this.agenda.cadastraContato(1, "Felipe", "Gangorra", "0000-0000");
		this.agenda.cadastraContato(2, "Felipe", "Gangorra", "0000-0000");
	}
	
	/**
	 * Teste para verificar o limite inferior da lista de contatos.
	 */
	@Test
	void testCadastraPosicaoLimiteAbaixo() {
		this.agenda.cadastraContato(1, "Fulano", "Nota10", "1010-1010");
		assertEquals("Fulano Nota10", this.agenda.getContato(1).getUsuarioCompleto());
	}
	
	/**
	 * Teste para verificar o limite superior da lista de contatos.
	 */
	@Test
	void testCadastraPosicaoLimiteAcima() {
		this.agenda.cadastraContato(100, "Felipe", "Gangorra", "0000-0000");
		assertEquals("Felipe Gangorra", this.agenda.getContato(100).getUsuarioCompleto());
		
	}
	
	/**
	 * Teste para verificar o cadastro fora da posição valida da lista, superior.
	 */
	@Test
	void testCadastraPosicaoInvalidaAcima() {
		try {
			this.agenda.cadastraContato(101, "Felipe", "Gangorra", "0000-0000");
			fail("Posição acima do limite");
		} catch (IndexOutOfBoundsException re) {
			
		}
	}
	
	/**
	 * Teste para verificar o cadastro fora da posição valida da lista, inferior.
	 */
	@Test
	void testCadastraPosicaoInvalidaAbaixo() {
		try {
			this.agenda.cadastraContato(-1, "Gilberto", "Nogueira", "0000-0000");
			fail("Posição abaixo do limite");
		} catch (IndexOutOfBoundsException re) {
			
		}
	}
	
	/**
	 * Teste para verificar o método de remover contato da lista.
	 */
	@Test
	void testRemoverContato() {
		this.agenda.cadastraContato(1, "Felipe", "Gangorra", "0000-0000");
		assertEquals("Felipe Gangorra", this.agenda.getContato(1).getUsuarioCompleto());
		this.agenda.remover(1);
		assertEquals(null, agenda.getContato(1));
	}

}
