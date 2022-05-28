package lab2;
/*
Representação do controle de descanso, onde o aluno define as horas de descanso,
quantidade de semanas e tem acesso ao status geral. O aluno deve ter 26 horas por
semana de descanso, sem contar horas de sono.
@author Felipe Gangorra.
 */
public class Descanso {

    // Horas de descanso
    private int HorasDeDescanso;
    // Quantidade de semanas
    private int NumeroDeSemanas;
    //Status do aluno
    private String StatusGeral;

    /* 
    Recebe a quantidade de horas de descanso e armazena o dado.
    @param valor quantidade de horas de descanso
    */
    public void defineHorasDescanso(int valor) {
        this.HorasDeDescanso = valor;
    }

    /*
    Recebe a quantidade de semanas e armazena o dado.
    @param valor a quantidade de semanas
    */
    public void defineNumeroSemanas(int valor) {
        this.NumeroDeSemanas = valor;
    }

    /*
    Verifica o status do aluno fazendo uma média de horas de descanso
    com a quantidade de semana, mantendo 26 horas como minimo de descanso.
    @return o status do aluno.
    */
    public String getStatusGeral() {
        if (NumeroDeSemanas > 0) {
            int aux = (this.HorasDeDescanso / this.NumeroDeSemanas);
            if (aux >= 26) {
                this.StatusGeral = "descansado";
            } else {this.StatusGeral = "cansado";}
        } else {this.StatusGeral = "cansado";}
    return this.StatusGeral;
    }
}
