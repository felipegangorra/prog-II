package lp2.lab01;

public class IdadePreferencialInteligente {
    public static void main(String[] args) {    //definindo uma função
        int idade = 2022 - 1999;
        int criancaDeColo = 0;
        Boolean gestante = true;

        System.out.println("Número: " + idade);
        
        if(idade >= 60){
            System.out.println("Preferencial Idoso.");
        } else if(gestante == true){
            System.out.println("Preferencial Gestante.");
        } else if(criancaDeColo > 0){
            System.out.println("Preferencial pois está com " + criancaDeColo + "crianças de colo.");
        }
    }
}
