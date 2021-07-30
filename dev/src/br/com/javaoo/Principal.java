package br.com.javaoo;

import br.com.javaoo.comoo.Circulo;
import br.com.javaoo.comoo.Triangulo;

import java.util.Locale;
import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Circulo a = new Circulo();

        System.out.println("Entre com o valor do raio do circulo um");

        a.raio = scanner.nextDouble();

        Circulo b = new Circulo();

        System.out.println("Entre com o valor do raio do circulo um");

        b.raio = scanner.nextDouble();

        a.calculaCirculo();
        b.calculaCirculo();



        Triangulo x = new Triangulo();

        System.out.println("Entre com os Valores de área do primeiro triangulo");

        x.lado1 = scanner.nextDouble();
        x.lado2 = scanner.nextDouble();
        x.lado3 = scanner.nextDouble();

        System.out.println("Entre com os Valores de área do segundo triangulo");
        Triangulo y = new Triangulo();
        y.lado1 = scanner.nextDouble();
        y.lado2 = scanner.nextDouble();
        y.lado3 = scanner.nextDouble();

        x.calculaArea();
        y.calculaArea();



        scanner.close();
    }
}
