package br.com.logica.orientacaoObejeto.Matrizes;

import java.util.Scanner;

public class Ex01 {



        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
             int M = s.nextInt();
            int N = s.nextInt();



            int[][] matriz = new int[M][N];



            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    matriz[i][j] = s.nextInt();

                }
            }

            for (int i = 0; i < M; i++){
                for (int j = 0; j < N; j++){
                    System.out.println("Posicao [" + i + " ] [ " + j + "] " + matriz[i][j]);
                }
            }


                s.close();
        }
    }

