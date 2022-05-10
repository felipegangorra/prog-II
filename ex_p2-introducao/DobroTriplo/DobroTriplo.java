/*
Laboratório de Programação 2 - Lab 1 (05-mai-2022)

@author Felipe Gangorra - 121111084
*/


import java.util.Scanner;

public class DobroTriplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    //receber valor
        int numero = sc.nextInt();

        int dobro = numero + numero;
        int triplo =  numero + numero + numero;

        System.out.println("dobro: " + dobro + ", triplo: " + triplo);

    }
}