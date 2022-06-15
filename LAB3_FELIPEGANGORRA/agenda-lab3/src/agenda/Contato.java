package agenda;

public class Contato {
    private String nome;
    private String sobrenome;
    private String telefone;

    //construtor
    public Contato(String nome, String sobrenome, String telefone) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
    }

    //nome completo
    public String getUsuarioCompleto(String nome, String sobrenome) {
        return nome + sobrenome;
    }
}