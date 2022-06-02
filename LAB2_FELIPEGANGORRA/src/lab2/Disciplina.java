package lab2;
import java.util.Arrays;

/**
 * Classe responsável por registrar as notas do aluno em uma disciplina, além das horas dedicadas
 * verificando se o aluno foi aprovado ou não.
 * @author Felipe Gangorra
 */

public class Disciplina {
    /**
     * Variável contendo o nome da disciplina em questão.
     */
    private String nomeDisciplina;
    /**
     * Variável contendo a quantidade de horas dedicadas para a disciplina.
     */
    private int horasEstudo;
    /**
     * Variável contendo a média das notas que o alunou tirou na disciplina.
     */
    private double mediaDasNotas;
    /**
     * Variável do tipo Array contendo as 4 notas do aluno(padrão de notas), inicializadas com 0 por padrão.
     */
    private double[] notaDasDisciplinas = {0,0,0,0};

    /**
     * Construtor que recebe o nome da disciplina e inicia.
     * @param nomeDisciplina disciplina em analise.
     */
    public Disciplina(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
    }

    /**
     * Método de definição de horas dedicadas a disciplina.
     * @param horas tempo de estudo do aluno.
     */
    public void cadastraHoras(int horas){
        this.horasEstudo = horas;
    }

    /**
     * Método que cadastra as notas da disciplina de acordo com o parametro passado levando em consideração 
     * a posição (nota) e o valor da mesma (valorNota).
     * @param nota posição da nota no array.
     * @param valorNota valor da nota de acordo com a posição.
     */
    public void cadastraNota(int nota, double valorNota){
        notaDasDisciplinas[nota-1] = valorNota;
    }

    /**
     * Método que cálcula a média das 4 notas do aluno para verifição da aprovação.
     * @return média das 4 notas.
     */
    private double mediaDasNotas(){
        double soma = 0;
        for (double i:this.notaDasDisciplinas) {
            soma += i;
        }
        this.mediaDasNotas = soma / 4;
        return mediaDasNotas;
    }

    /**
     * Método para verificar se o aluno foi aprovado de acordo com a média.
     * @return retorna true caso o aluno seja aprovado e false se não.
     */
    public boolean aprovado(){
        if (mediaDasNotas() >= 7){
            return true;
        } else{
            return false;
        }
    }

    /**
     * ToString para formatação da string de saida de acordo com o esperado, contendo: disciplina, horas dedicadas de estudo,
     * média das notas e as respectivas notas.
     * @return retorna a string formatada.
     */
    public String toString() {
        return (this.nomeDisciplina + " " + this.horasEstudo + " " + mediaDasNotas() + " " + Arrays.toString(notaDasDisciplinas));
    }
}
