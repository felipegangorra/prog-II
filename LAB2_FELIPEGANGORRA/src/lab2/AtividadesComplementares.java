package lab2;
import java.util.ArrayList;

/**
 * Classe de Atividades Complementares, onde o estudante registra
 * suas atividades, como: estágio, projetos e cursos.
 * @author Felipe Gangorra
 */
 public class AtividadesComplementares {
    
    /**
     * Variável com a soma das horas de curso do aluno.
     */
    private double horasCurso;
    /**
     * Variável com o total de créditos acumulados através de estágios.
     */
    private int creditoEstagio;
    /**
     * Variável com o total de créditos acumulados através de projetos.
     */
    private int creditoProjeto;
    /**
     * Variável com o total de créditos acumulados através de cursos.
     */
    private double creditoCurso;
    /**
     * Variável do tipo ArrayList contendo o histórico dos estágios do aluno.
     */
    private ArrayList<Integer> totalEstagios;
    /**
     * Variável do tipo ArrayList contendo o histórico dos projetos do aluno.
     */
    private ArrayList<Integer> totalProjetos;

    /**
     * Construtor dos históricos de estágio e projeto do aluno para verificação
     * e armazenamento.
     */
    public AtividadesComplementares() {
        this.totalEstagios = new ArrayList<Integer>();
        this.totalProjetos = new ArrayList<Integer>();
    }

    /**
     * Método para adicionar o estágio no histórico e calculr os créditos equivalentes de
     * acordo com as horas passadas, contendo uma condição limitando para 9 o máximo de estágios
     * permitidos (padrão).
     * @param horas horas dedicadas ao estágio em questão.
     */
    public void adicionarEstagio(int horas) {
        if (this.totalEstagios.size() > 9) {return;}    //não add no array, 9 é padrão

        this.totalEstagios.add(horas);

        this.creditoEstagio += calculadoraEstagio(horas);
    }

    /**
     * Método para adicionar o projeto no histórico de projetos e calcular os créditos equivalentes de
     * acordo com as horas passadas, contendo uma condição limitando para 16 o máximo de projetos permitidos
     * (padrão).
     * @param meses referente ao tempo dedicado nos projetos.
     */
    public void adicionarProjeto(int meses) {
        if (this.totalProjetos.size() > 16) {return;} //não add no array, 16 padrão
        
        this.totalProjetos.add(meses);

        this.creditoProjeto += calculadoraProjeto(meses);
    }
    
    /**
     * Método para implementar no total de horas dedicadas em cursos e calcular os créditos equivalentes de
     * acordo com as horas submetidas.
     * @param horas referente as horas dedicadas ao curso.
     */
    public void adicionarCurso(double horas) {
        this.horasCurso += horas;
        this.creditoCurso += calculadoraCurso(horas);
    }

    /**
     * Método para fazer a contagem total de créditos obtidas pelo aluno nas três categorias: projeto, estágio e curso.
     * @return retorna a soma dos créditos em um valor truncado.
     */
    public int contaCreditos() {
        double contagem = this.creditoProjeto + this.creditoCurso + this.creditoEstagio;
        return (int) contagem;
    }

    /**
     * Método para formatar dentro de um Array de String os estágios e suas horas, os projetos e suas horas, o
     * total de horas de curso e os créditos fornecidos pelas categorias.
     * @return String formada de acordo com o esperado.
     */
    public String[] pegaAtividades() {
        String[] pegaAtividades = new String[this.totalEstagios.size() + this.totalProjetos.size() + 4];
        int posAtividades = 0;

        for (int i = 0; i < totalEstagios.size() ; i++){
            int elemento = totalEstagios.get(i);
            String aux = "Estágio " + elemento;
            pegaAtividades[posAtividades++] = aux;
        }

        for (int i = 0; i < totalProjetos.size() ; i++){
            int elemento = totalProjetos.get(i);
            String aux = "Projetos " + elemento;
            pegaAtividades[posAtividades++] = aux;
        }

        String cursoTempo = "Cursos " + this.horasCurso;
        pegaAtividades[posAtividades++] = cursoTempo;
        String estagio = "Creditos_Estagio " + this.creditoEstagio;
        pegaAtividades[posAtividades++] = estagio;
        String projeto = "Creditos_Projeto " + this.creditoProjeto;
        pegaAtividades[posAtividades++] = projeto;
        String cursoCred = "Creditos_Curso " + (int) this.creditoCurso;
        pegaAtividades[posAtividades++] = cursoCred;

        return pegaAtividades;
    }


    /**
     * Método para calcular os créditos dos estágios.
     * @param horas referente as horas dedicadas ao estágio em questão.
     * @return  retorna a quantidade de créditos obtidos.
     */
    private int calculadoraEstagio (int horas) {
        int credito = horas / 300 * 5;
        return credito;
    }
    
    /**
     * Método para calcular os créditos dos projetos.
     * @param meses referente ao tempo dedicado ao projeto em questão.
     * @return  retorna a quantidade de créditos obtidos.
     */
    private int calculadoraProjeto (int meses) {
        int credito = meses / 3 * 2;
        return credito;
    }

    /**
     * Método para calcular os créditos do total de horas dedicadas aos cursos.
     * @param horas referente ao tempo dedicado aos cursos.
     * @return retorna a quantidade de créditos obtidos.
     */
    private double calculadoraCurso (double horas) {
        double credito = horas / 30;
        return credito;
    }
 }