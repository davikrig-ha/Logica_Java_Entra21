package br.com.javaoo;

import br.com.javaoo.comoo.Circulo;
import br.com.javaoo.comoo.Triangulo;
import br.com.javaoo.entities.Product;

import java.util.Locale;
import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);


        Product eletrodomestico = new Product();

        eletrodomestico.setName("geladeira");
        eletrodomestico.setPrice(2.000);
        eletrodomestico.setQuantity(2);


        System.out.println(eletrodomestico.getNAME());
        System.out.println(eletrodomestico.getPrice());
        System.out.println(eletrodomestico.getQuantity());




    }
}
