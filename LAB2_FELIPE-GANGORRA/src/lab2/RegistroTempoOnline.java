package lab2;
/**
 * Representa o registro de tempo online, onde contém a informação sobre a
 * quantidade de horas em que o aluno tem dedicado a disciplina remota.
 * O aluno vai definir a disciplina e o tempo esperado.
 */
public class RegistroTempoOnline {
    //Nome da disciplina
    private String nomeDisciplina;
    //Tempo colocado na disciplina
    private int tempoOnline;
    //Meta de horas a ser batida
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
     * construtor pra criar um objeto contendo 
     * @param nomeDisciplina o nome da disciplina
     * @param tempoOnlineEsperado o tempo esperado
     */
    public RegistroTempoOnline (String nomeDisciplina, int tempoOnlineEsperado) {
        this.nomeDisciplina = nomeDisciplina;
        this.metaDeEstudo = tempoOnlineEsperado;
    }

    /**
     * Adicionando tempo as horas contabilizadas.
     * @param tempo tempo que será somado
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
        return nomeDisciplina + " " + tempoOnline + "/" + metaDeEstudo;
    }
}
