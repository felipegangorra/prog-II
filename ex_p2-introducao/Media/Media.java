/*
Laboratório de Programação 2 - Lab 1 (05-mai-2022)

@author Felipe Gangorra - 121111084
*/

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double primeiroNumero = sc.nextFloat();
        double segundoNumero = sc.nextFloat();

        double media = (primeiroNumero + segundoNumero) / 2;

        if (media >= 7.0){
            System.out.println("pass: True!");
        } else {
            System.out.println("pass: False!");
        }
    }
}