package br.com.logica.orientacaoObejeto.vetores;

public class Ex04 {
    public static void main(String[] args) {

        int[] numeros = new int[7];
        int[] numeros2 = new int[7];


        for (int a = 0; a < 3; a ++){
            numeros[a] = 5;
            numeros2[a] = a;


        }
        System.out.println(numeros[0]);
        System.out.println(numeros2[0]);
    }
}
