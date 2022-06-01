package lab2;
/**
 * Classe que representa o registro de tempo online, onde contém a informação sobre a
 * quantidade de horas em que o aluno tem dedicado a disciplina remota.
 * O aluno vai definir a disciplina e o tempo esperado.
 * @author Felipe Gangorra
 */
public class RegistroTempoOnline {
    /**
     * Variável com o nome da disciplina em questão.
     */
    private String nomeDisciplina;
    /**
     * Variável contendo o tempo de estudo dedicado a disciplina.
     */
    private int tempoOnline;
    /**
     * Variável contendo a meta de tempo que deve ser dedicado a disciplina.
     */
    private int metaDeEstudo;

    /**
     * Construtor para criar um objeto contendo o nome da disciplina
     * e a quantidade de horas padrão (120h) esperada.
     * @param nome da disciplina
     */
    public RegistroTempoOnline (String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.metaDeEstudo = 120;
    }

    /**
     * Construtor com a função de criar um objeto contendo  
     * @param nomeDisciplina o nome da disciplina
     * @param tempoOnlineEsperado o tempo esperado
     */
    public RegistroTempoOnline (String nomeDisciplina, int tempoOnlineEsperado) {
        this.nomeDisciplina = nomeDisciplina;
        this.metaDeEstudo = tempoOnlineEsperado;
    }

    /**
     * Adicionando tempo as horas contabilizadas.
     * @param tempo tempo que será somado ao total de horas.
     */
    public void adicionaTempoOnline(int tempo) {
        this.tempoOnline += tempo;
    }

    /**
     * Verificando se a quantidade de horas dedicadas é maior ou
     * igual ao tempo esperado, se for retorna true e false se não.
     * @return valor de acordo com a a meta 
     */
    public boolean atingiuMetaTempoOnline() {
        if (this.tempoOnline >= metaDeEstudo){
            return true;
        } else{
            return false;
        }
    }

    /**
     * Retorna uma string no formato desejado contendo nomeDisciplina,
     * tempoOnline e metaDeEstudo.
     * @return string formatada
     */
    public String toString() {
        return (this.nomeDisciplina + " " + this.tempoOnline + "/" + metaDeEstudo);
    }
}
