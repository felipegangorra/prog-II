/*
Laboratório de Programação 2 - Lab 1 (12/mai/2022)
@author Felipe Gangorra - 121111084
*/

import java.util.Scanner;

public class AlunosNota {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        double maior = Double.NEGATIVE_INFINITY;
        double menor = Double.POSITIVE_INFINITY;
        int soma = 0;
        int abaixo = 0;
        int acima = 0;
        int cont = 0;
    
        while (true) {
            String[] entrada = sc.nextLine().split(" ");    
            if (entrada[0].equals("-")) {                   //parada
                break;
            }

            double convertido = Double.parseDouble(entrada[1]);

            if (convertido > maior) {
                maior = convertido;
            }
            if (convertido < menor) {
                menor = convertido;
            }

            if (convertido >= 700) {
                acima += 1;
            }
            if (convertido < 700) {
                abaixo += 1;
            }

            cont += 1;              //contador para media
            soma += convertido;     //soma para media

        }

        int media = soma / cont;    //media


        System.out.printf("maior: " + "%.0f", maior);
        System.out.printf("\nmenor: " + "%.0f", menor);
        System.out.println("\nmedia: " + media);
        System.out.println("acima: " + acima);
        System.out.println("abaixo: " + abaixo);
    }
}