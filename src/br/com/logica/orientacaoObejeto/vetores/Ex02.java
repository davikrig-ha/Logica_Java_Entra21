package br.com.logica.orientacaoObejeto.vetores;

public class Ex02 {
    public static void main(String[] args) {

        int[] numeros = new int[6];
        int a = 2;

        while (a < 6){
            numeros[a] = 10 * a;
            System.out.println(numeros[a]);
            a = a + 1;

        }


    }
}
