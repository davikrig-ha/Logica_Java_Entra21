package br.com.logica.orientacaoObejeto.vetores;

import java.util.Scanner;

public class Ex01Vetores {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        int n = s.nextInt();
        int[] numeros = new int[n];

        //Entrada de Valores.

        for (int i = 0; i < n; i++){
          numeros[i] = s.nextInt();

        }

        //Imprime os Valores.

        for (int i = 0; i < n; i++){
          System.out.println(numeros[i]);

        }

    }
}
