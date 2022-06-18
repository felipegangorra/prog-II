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

    public String getNome() {
        return this.nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }


    //nome completo e telefone
    public String getUsuarioCompleto() {
        return this.nome + " " + this.sobrenome;
    }

    //reescrever um metodo padrão do java (override)
    //uma representação escrita do objeto (toString)
    @Override
    public String toString() {
        return this.nome + " " + this.sobrenome + "\n" + this.telefone;
    }
}