package br.com.logica.orientacaoObejeto.Matrizes;

public class Ex04 {
    public static void main(String[] args) {

        int m = 5;
        int[][] matriz = new int[m][m];

        for (int i = 0; i < m; i++){
            matriz[3][i] = 10;
            System.out.println("Posicao [" + 3 + " ] [ " + i + "] " + matriz[3][i]);
        }
        for (int i = 0; i < m; i++){
            matriz[i][4] = 10 * i;
            matriz[i][i] = 50;

            System.out.println("Posicao [" + i + " ] [ " + i + "] " + matriz[i][4]);
            System.out.println("Posicao [" + i + " ] [ " + i + "] " + matriz[i][i]);
        }
    }
}
