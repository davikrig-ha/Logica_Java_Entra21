package br.com.logica.orientacaoObejeto.vetores;

import java.util.Locale;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        /*
         Faça um programa que leia N números reais e armazene-os em um vetor.
        Em seguida:
        - Imprimir todos os elementos do vetor
        - Mostrar na tela a soma e a média dos elementos do vetor

        Entrada             |       Saída
        4                           8.0 4.0 10.0 14.0
        8.0 4.0 10.0 14.0           36.00
                                    9.00
         */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double[] numeros = new double[N];
        for(int i = 0; i<N; i++){

            numeros[i] = sc.nextDouble();
        }

        for(int i = 0; i<N; i++){


                System.out.println(numeros[i]);

        }

        double soma = 0.0;
        for (int i = 0; i < N; i++){
            soma += numeros[i];
        }
       double media = soma / N;
        System.out.printf("Total soma: %.2f%n ", soma);
        System.out.printf("Média: %.2f%n ", media);

        sc.close();
    }
}
