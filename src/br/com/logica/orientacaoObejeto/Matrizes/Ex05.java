package br.com.logica.orientacaoObejeto.Matrizes;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[][] matriz = new int[n][n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = s.nextInt();

            }
        }
        System.out.println("Diagonal principal: ");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){

                if (i == j){
                    System.out.println(" ");
                    System.out.print(matriz[i][j]);
                    System.out.println(" ");
                }
                if (matriz[i][j] < 0){

                    count = count + 1;

                }

            }
        }

        System.out.println("QUANTIDADE DE NEGATIVOS " + count);
        s.close();
    }
}
