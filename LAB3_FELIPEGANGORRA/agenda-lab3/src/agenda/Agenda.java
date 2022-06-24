package agenda;

/**
 * Classe que representa uma agenda que mantém uma lista de contatos com posições com um limite de 100 contatos, e uma lista de favoritos
 * de até 10 contatos. 
 * 
 * @author nazarenoandrade.
 * @author Felipe Gangorra.
 *
 */
public class Agenda {
	
	/**
	 * Determina o tamanho máximo da lista de contatos.
	 */
	private static final int TAMANHO_AGENDA = 100;

	/**
	 * Determina o tamanho máximo da lista de favoritos.
	 */
	private static final int TAMANHO_FAVORITOS = 10;
	
	/**
	 * Variável: lista de contatos.
	 */
	private Contato[] contatos;

	/**
	 * Variável: lista de favoritos.
	 */
	private Contato[] favoritos;

	/**
	 * Construtor da lista de contatos e favoritos.
	 */
	public Agenda() {
		this.contatos = new Contato[TAMANHO_AGENDA];
		this.favoritos = new Contato[TAMANHO_FAVORITOS];
	}
	
	/**
	 * Método que acessa a lista de contatos mantida.
	 * @return Clone do array de contatos.
	 */
	public Contato[] getContatos() {
		return this.contatos.clone();
	}

	/**
	 * Método que acessa a lista de favoritos mantida.
	 * @return Clone do array de favoritos.
	 */
	public Contato[] getFavoritos() {
		return this.favoritos.clone();
	}

	/**
	 * Acessa os dados de um contato específico.
	 * @param posicao Posição do contato na agenda.
	 * @return Dados do contato. Null se não há contato na posição.
	 */
	public Contato getContato(int posicao) {
		return contatos[posicao];
	}

	/**
	 * Cadastra um contato em uma posição. Um cadastro em uma posição que já existe sobrescreve o anterior. 
	 * @param posicao Posição do contato.
	 * @param nome Nome do contato.
	 * @param sobrenome Sobrenome do contato.
	 * @param telefone Telefone do contato.
	 */
	public void cadastraContato(int posicao, String nome, String sobrenome, String telefone) {
		Contato contatoAtual = new Contato(nome, sobrenome, telefone);
		this.contatos[posicao] = contatoAtual;
	}

	/**
	 * Método para cadastra na lista de favoritos o contato passado na posição desejada.
	 * Um cadastro em uma posição que já existe sobrescreve o anterior.
	 * @param posicaoContato Posição do contato na lista contatos.
	 * @param posicaoFavorito Posição de favorito na lista favoritos.
	 */
	public void cadastraFavorito(int posicaoContato, int posicaoFavorito) {
		this.favoritos[posicaoFavorito] = this.contatos[posicaoContato];
	}

	/**
	 * Método para cadastra uma tag no contato esperado.
	 * @param posicaoContato Posição do contato.
	 * @param posicaoTag Posição da tag.
	 * @param tag String com a mensagem(tag).
	 */
	public void cadastraTags(int posicaoContato, int posicaoTag, String tag) {
		this.contatos[posicaoContato].adicionarTag(posicaoTag, tag);
	}

	/*
	 * Método que verifica se o contato está na lista de favoritos para atribuir um coração.
	 * @ param contato Contato a ser verificado.
	 */
	public boolean ehFavorito(Contato contato) {
		for (Contato favorito : this.favoritos) {
			if (contato.equals(favorito)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Método para verificar se o contato a ser favoritado já é um favorito.
	 * @param posicao Posição do contato a ser verificado.
	 * @return True caso seja repetido, False caso não seja.
	 */
	public boolean verificarFavorito(int posicao) {
		for (int i = 0; i < favoritos.length; i++) {
			if (contatos[posicao].equals(favoritos[i])) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Método para verificar se o contato já existe na lista de contatos através do nome e sobrenome.
	 * @param nome Nome do contato.
	 * @param sobrenome Sobrenome do contato
	 * @return True caso seja repetido, False caso não seja.
	 */
	public boolean verificarContato(String nome, String sobrenome) {
		Contato[] contatos = getContatos();	//chamando clone de contatos
		for (int i = 0; i < contatos.length; i++) {
			if(contatos[i] != null) {
				String nomeContato = contatos[i].getNome();
				String sobrenomeContato = contatos[i].getSobrenome();

				if (nome.equals(nomeContato) && sobrenome.equals(sobrenomeContato)) {
					System.out.println("\nCONTATO JÁ CADASTRADO!");
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * Método para remover um contato na lista de contatos.
	 * @param posicao Posição do contato a ser removido.
	 */
	public void remover(int posicao) {
		for (int i = 0; i < contatos.length; i++) {
			if(i == posicao) {
				if(contatos[i] == null) {
					System.out.println("POSIÇÃO INVÁLIDA!");
				}
				contatos[i] = null;
			}
		}
	}	

	/**
	 * Método para remover contato da lista de favoritos.
	 * @param posicao Posição do favorito a ser removido.
	 */
	public void removerFavorito(int posicao) {
		for (int i = 0; i < favoritos.length; i++) {
			if(contatos[posicao].equals(favoritos[i])) {
				favoritos[i] = null;
			}
		}
	}
}
