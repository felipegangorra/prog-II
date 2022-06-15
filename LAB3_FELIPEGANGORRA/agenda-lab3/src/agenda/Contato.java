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

    //nome completo e telefone
    public String getUsuarioCompleto() {
        return this.nome + " " + this.sobrenome + " " + this.telefone;
    }

    //já existe
    /*
    public boolean jaExiste(String nome, String sobrenome, String telefone, Agenda lista) {
        Contato[] listaContatos = lista.getContatos();  //lista de contatos para rodar e ver se tem igual

        String verificarCadastro = this.nome + " " + this.sobrenome + " " + this.telefone;
        for (int i = 0 ; i < listaContatos.length; i++){
            Contato aux =  listaContatos[i].getUsuarioCompleto();
            if (listaContatos[i].equals(aux)){
                return true;
            }
        }
        return false;
    }
    */
}