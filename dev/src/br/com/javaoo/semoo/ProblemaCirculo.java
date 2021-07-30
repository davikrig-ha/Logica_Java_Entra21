package br.com.javaoo.semoo;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaCirculo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        double r1, r2, areaX, areaY;
        double p = 3.14;


        System.out.println("Entre com os valor de raio do primeiro circulo");
        r1 = scanner.nextDouble();

        System.out.println("Entre com os valor de raio do segundo circulo");
        r2 = scanner.nextDouble();


        areaX = p * Math.pow(r1, 2);
        areaY = p * Math.pow(r2, 2);




        System.out.printf("Area do triangulo X %.2f%n", areaX);
        System.out.printf("Area do triangulo Y %.2f%n", areaY);




        scanner.close();
    }
}
