package br.com.logica.orientacaoObejeto.Matrizes;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = 3;


        int[][] matriz = new int[n][n];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = 1 + i + j;

            }
        }

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.println("Posicao [" + i + " ] [ " + j + "] " + matriz[i][j]);
            }
        }


        s.close();
    }
}