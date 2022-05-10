/*
Laboratório de Programação 2 - Lab 1 (08/mai/2022)

@author Felipe Gangorra - 121111084
*/

import java.util.Scanner;

public class AcimaDaMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();

        //verificando media
        int total = 0;
        int cont = 0;
        for (String valor : entrada.split(" ")) {
            int numero = Integer.parseInt(valor);
            total = total + numero;
            cont++;
        }
        int media = total / cont;

        //verificando saida
        String saida = "";
        for (String valor2 : entrada.split(" ")) {
            int numero2 = Integer.parseInt(valor2);
            if (numero2 > media) {
                saida = saida + valor2;
                saida = saida + " ";
            }
        }

        System.out.println(saida);
    }
}   