package br.com.logica.orientacaoObejeto.Matrizes;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        int m = 2;
        int n = 4;
        int x = 0;


        int[][] matriz = new int[m][n];


        for (int i = 0; i < m; i++) {
            x = x + i;
            for (int j = 0; j < n; j++) {
                x = x + j;
                matriz[i][j] = x;

            }
        }


        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.println("Posicao [" + i + " ] [ " + j + "] " + matriz[i][j]);
            }
        }



        s.close();
    }
}