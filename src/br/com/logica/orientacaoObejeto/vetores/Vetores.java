package br.com.logica.orientacaoObejeto.vetores;

import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {

      /*  int[] numeros = new int[5];

        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;


        for (int i = 0; i < 5; i++) {
            System.out.println("Qual o valor? " + numeros[i]);
        }




        String[] carros = new String[3];

        carros[0] = "uno";
        carros[1] = "palio";
        carros[2] = "147";

        System.out.println("carro = " + carros[0]);
        System.out.println("carro = " + carros[1]);
        System.out.println("carro = " + carros[2]);

          Faça um programa que leia N números inteiros e armazene-os
        em um vetor. Em seguida, mostrar na tela todos os números
        negativos lidos.
        Exemplo:

        Entrada             | Saida
        6                   |  -2
        8 -2 9 10 -3 -7     | -3
                            | -7

    */
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] numeros = new int[N];
        for(int i = 0; i<N; i++){

            numeros[i] = sc.nextInt();
        }

        for(int i = 0; i<N; i++){

            if(numeros[i]<0){
                System.out.println(numeros[i]);
            }
        }

        sc.close();




    }

}
