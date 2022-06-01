package lab2;
import java.util.Arrays;
/**
 * Registra as notas do aluno na respectiva disciplina, além das horas dedicadas
 * e se foi aprovado ou não na mesma.
 * @author Felipe Gangorra
 */

public class Disciplina {
    //Nome da disciplina
    private String nomeDisciplina;
    //Quantidade de horas dedicadas
    private int horasEstudo;
    //Média do aluno
    private double mediaDasNotas;
    //Array contendo as 4 notas (padrão), inicializadas com 0.
    private double[] notaDasDisciplinas = {0,0,0,0};

    /**
     * Construtor recebe o nome da disciplina e inicia
     * @param nomeDisciplina nome da disciplina
     */
    public Disciplina(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
    }

    /**
     * Definição de horas dedicadas a disciplina
     * @param horas tempo de estudo
     */
    public void cadastraHoras(int horas){
        this.horasEstudo = horas;
    }

    /**
     * Cadastro de notas da disciplina de acordo com o parametro passado
     * @param nota posição no array
     * @param valorNota valor da nota
     */
    public void cadastraNota(int nota, double valorNota){
        notaDasDisciplinas[nota-1] = valorNota;
    }


    /**
     * Cálculo da média das 4 notas
     * @return media
     */
    public double mediaDasNotas(){
        double soma = 0;
        for (double i:this.notaDasDisciplinas) {
            soma += i;
        }
        this.mediaDasNotas = soma / 4;
        return mediaDasNotas;
    }

    /**
     * Método para verificar se o aluno foi aprovado de acordo com a média
     * @return aprovado(true) ou reprovado(false)
     */
    public boolean aprovado(){
        if (mediaDasNotas() >= 7){
            return true;
        } else{
            return false;
        }
    }


    /**
     * Formatação da string de saida com a disciplina, horas dedicadas de estudo,
     * média das notas e as respectivas notas.
     * @return string formatada
     */
    public String toString() {
        return (this.nomeDisciplina + " " + this.horasEstudo + " " + mediaDasNotas() + " " + Arrays.toString(notaDasDisciplinas));
    }
}
