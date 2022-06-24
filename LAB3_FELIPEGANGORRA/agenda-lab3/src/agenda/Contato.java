package agenda;

/**
 * Classe que representa um contato.
 * 
 * @author Felipe Gangorra.
 */

public class Contato {

    /**
     * Variável do nome do contato
     */
    private String nome;

    /**
     * Variável do sobrenome do contato.
     */
    private String sobrenome;

    /**
     * Variável do telefone do contato.
     */
    private String telefone;

    /**
     * Variável array das tags do contato.
     */
    private String [] tags;

    /**
     * Construtor das variáveis: nome, sobrenome, telefone e tags.
     * @param nome Nome do contato.
     * @param sobrenome Sobrenome do contato.
     * @param telefone Telefone do contato.
     * @param tags Array das tags do contato.
     */
    public Contato(String nome, String sobrenome, String telefone) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
        tags = new String [5];
    }

    /**
     * Método para resgatar o nome do contato.
     * @return Nome do contato.
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * Método para resgatar o sobrenome do contato.
     * @return Sobrenome do contato
     */
    public String getSobrenome() {
        return this.sobrenome;
    }

    /**
     * Método para formatar o nome completo do contato (nome e sobrenome).
     * @return Nome completo do contato.
     */
    public String getUsuarioCompleto() {
        return this.nome + " " + this.sobrenome;
    }

    /**
     * Método para resgatar o array de tags do contato.
     * @return Clone do array tags.
     */
    public String[] getTags() {
        return this.tags.clone();
    }

    /**
     * toString para reescrever a representação padrão do objeto, concatenando 
     * os atributos de contato.
     */
    @Override
    public String toString() {
        return this.nome + " " + this.sobrenome + "\n" + this.telefone;
    }
    
    /**
     * Método para adicionar tag ao array de tags.
     * @param posicaoTag Posição da tag no array.
     * @param tag Mensagem (tag).
     */
    public void adicionarTag(int posicaoTag, String tag) {
        this.tags[posicaoTag] = tag;
    }
    
}