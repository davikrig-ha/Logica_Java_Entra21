package br.com.logica.orientacaoObejeto.vetores;

public class Ex01 {
    public static void main(String[] args) {


        int[] numeros = new int[5];
        int a = 10;
        int b = 20;
        int c = (a + b) / 2;



        numeros[4] = a + b + c;

        System.out.println(numeros[4]);
    }
}
