package br.com.logica.orientacaoObejeto.vetores;

public class Ex06 {
    public static void main(String[] args) {
        int[] numeros = new int[7];
        int[] numeros2 = new int[7];
        int a = 2;
        int b = 5;


        for (int c = 0; c < 3; c ++){
            numeros[c] = a;
            numeros2[c] = c * a;


        }
        System.out.println(numeros[0]);
        System.out.println(numeros2[0]);
    }
}
