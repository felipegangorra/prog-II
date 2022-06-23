package agenda;

/**
 * Uma agenda que mantém uma lista de contatos com posições. Podem existir 100 contatos. 
 * 
 * @author nazareno
 *
 */
public class Agenda {
	
	private static final int TAMANHO_AGENDA = 100;
	private static final int TAMANHO_FAVORITOS = 10;
	
	private Contato[] contatos;
	private Contato[] favoritos;

	/**
	 * Cria uma agenda.
	 */
	public Agenda() {
		this.contatos = new Contato[TAMANHO_AGENDA];
		this.favoritos = new Contato[TAMANHO_FAVORITOS];
	}
	
	/**
	 * Acessa a lista de contatos mantida.
	 * @return O array de contatos.
	 */
	public Contato[] getContatos() {
		return this.contatos.clone();
	}

	//lista de favoritos clone
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

	//cadastra favorito
	public void cadastraFavorito(int posicaoContato, int posicaoFavorito) {
		this.favoritos[posicaoFavorito] = this.contatos[posicaoContato];
	}

	//cadastra tags
	public void cadastraTags(int posicaoContato, int posicaoTag, String tag) {
		this.contatos[posicaoContato].adicionarTag(posicaoTag, tag);
	}

	//verificar se o contato é favorito para add coração
	public boolean ehFavorito(Contato contato) {
		for (Contato favorito : this.favoritos) {
			if (contato.equals(favorito)) {
				return true;
			}
		}
		return false;
	}

	//verificar o favorito é repetido
	public boolean verificarFavorito(int posicao) {
		for (int i = 0; i < favoritos.length; i++) {
			if (contatos[posicao].equals(favoritos[i])) {
				return true;
			}
		}
		return false;
	}

	//verificar se contato já existe
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
}
