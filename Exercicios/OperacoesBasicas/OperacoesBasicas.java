/*
Laboratório de Programação 2 - Lab 1 (05-mai-2022)

@author Felipe Gangorra - 121111084
*/

import java.util.Scanner;

public class OperacoesBasicas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String operador = sc.nextLine();

        if(operador.equals("+")) {                  //equals para verificar se é igual
            double n1 = sc.nextDouble();
            double n2 = sc.nextDouble();
            double resultado = n1 + n2;
            System.out.println("RESULTADO: " + resultado);

        } else if (operador.equals("-")) {
            double n1 = sc.nextDouble();
            double n2 = sc.nextDouble();
            double resultado = n1 - n2;
            System.out.println("RESULTADO: " + resultado);

        } else if (operador.equals("*")) {
            double n1 = sc.nextDouble();
            double n2 = sc.nextDouble();
            double resultado = n1 * n2;
            System.out.println("RESULTADO: " + resultado);

        } else if (operador.equals("/")) {
            double n1 = sc.nextDouble();
            double n2 = sc.nextDouble();
            if (n2 == 0.0) {
                System.out.println("ERRO");
            } else {
                double resultado = n1 / n2;
                System.out.println("RESULTADO: " + resultado);
            }

        } else {
            System.out.println("ENTRADA INVALIDA");
        }
    }
}