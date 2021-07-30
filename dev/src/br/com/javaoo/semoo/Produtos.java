package br.com.javaoo.semoo;

/*
Fazer um programa para ler os dados de um produto em estoque (nome, preço e
quantidade no estoque). Em seguida:
• Mostrar os dados do produto (nome, preço, quantidade no estoque, valor total no
estoque)
• Realizar uma entrada no estoque e mostrar novamente os dados do produto
• Realizar uma saída no estoque e mostrar novamente os dados do produto
 */

import java.util.Locale;
import java.util.Scanner;

public class Produtos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);

        System.out.println("nome do produto");
        String nome = s.next();

        System.out.println("preço");
        double preco = s.nextDouble();

        System.out.println("Quantidade em estoque");
        int quantidade = s.nextInt();

        System.out.println(nome);
        System.out.println(preco);
        System.out.println(quantidade);

        System.out.println("digite 1 para entrar com um produto no estoque");
        int e = s.nextInt();

     if (e == 1){


         System.out.println("Quantidade adicionada em estoque");
        int  quantidade1 = s.nextInt();

         System.out.println("Produto");
         System.out.println(nome);
         System.out.println("Preço");
         System.out.println(preco);
         System.out.println("Quantidade");
         System.out.println(quantidade + quantidade1);
     }
        System.out.println("Se quizer fazer uma saida digite 0");
       int sa = s.nextInt();

       if (sa == 0){



         System.out.println("Quantidade de retirada de estoque");
         int  quantidade1 = s.nextInt();

           System.out.println("Produto");
           System.out.println(nome);
           System.out.println("Preço");
           System.out.println(preco);
           System.out.println("Quantidade");
           System.out.println(quantidade - quantidade1);

     }

    s.close();

    }

}
