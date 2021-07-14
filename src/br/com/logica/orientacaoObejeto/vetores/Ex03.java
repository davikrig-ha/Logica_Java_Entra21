package br.com.logica.orientacaoObejeto.vetores;

public class Ex03 {
    public static void main(String[] args) {

        int[] numeros = new int[7];
        int a = 7;
        int b = a - 6;


        while (b < a){
            numeros[b] = b * a;
            System.out.println(numeros[b]);
            b = b + 2;

        }
    }
}
