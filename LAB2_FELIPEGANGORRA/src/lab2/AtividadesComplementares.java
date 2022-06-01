package lab2;
import java.util.ArrayList;

/**
 * Atividades Complementares é onde o estudante registra
 * suas atividade, como: estágio, projetos e cursos.
 * @author Felipe Gangorra
 */
 public class AtividadesComplementares {
    
    private int horasEstagio;
    private int mesesProjeto;
    private double horasCurso;
    private int creditoEstagio;
    private int creditoProjeto;
    private double creditoCurso;
    private ArrayList<Integer> totalEstagios;
    private ArrayList<Integer> totalProjetos;

    public AtividadesComplementares() {
        this.totalEstagios = new ArrayList<Integer>();
        this.totalProjetos = new ArrayList<Integer>();
    }

    public void adicionarEstagio(int horas) {
        if (this.totalEstagios.size() < 9) {return;}    //não add no array, 9 é padrão

        this.totalEstagios.add(horas);
        this.horasEstagio = horas;
        this.creditoEstagio += calculadoraEstagio(horas);
    }

    public void adicionarProjeto(int meses) {
        if (this.totalProjetos.size() < 16) {return;} //não add no array, 16 padrão
        
        this.totalProjetos.add(meses);
        this.mesesProjeto = meses;
        this.creditoProjeto += calculadoraProjeto(meses);
    }
    
    public void adicionarCurso(double horas) {
        this.horasCurso = horas;
        this.creditoCurso += calculadoraCurso(horas);
    }

    public int contaCreditos() {
        double contagem = this.creditoProjeto + this.creditoCurso + this.creditoEstagio;
        return (int) contagem;
    }

    public String[] pegaAtividades() {
        String[] pegaAtividades = new String[100];

        
    }


    public int calculadoraEstagio (int horas) {
        int credito = horas / 300 * 5;
        return credito;
    }

    public int calculadoraProjeto (int meses) {
        int credito = meses / 3 * 2;
        return credito;
    }

    public double calculadoraCurso (double horas) {
        double credito = horas / 30;
        return credito;
    }
 }