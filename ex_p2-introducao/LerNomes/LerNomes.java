/*
Laboratório de Programação 2 - Lab 1 (08/mai/2022)
@author Felipe Gangorra - 121111084
*/

import java.util.Scanner;
public class LerNomes {
  public static void main (String args[]) {
      Scanner sc = new Scanner(System.in);
 
       do {
           String frase = sc.nextLine();
           if (frase.equals("wally")) {
               break;
           } else if (coletora(frase).equals("")) {
               System.out.println("?");
           } else {
               System.out.println(coletora(frase));
           }
       } while(true);     
  }

  //função para coletar saida esperada
  public static String coletora(String lista) {
      String nome = "";
      for (String elemento : lista.split(" ")) {
          if (elemento.length() == 5){
              nome = elemento;
          }
      }
      return nome;
  }
}