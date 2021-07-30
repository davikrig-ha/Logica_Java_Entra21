package br.com.javaoo.comoo;

public class Circulo {
    public double raio;



    public void calculaCirculo() {

        double areaCirculo = Math.sqrt(Math.PI * Math.pow(raio, 2));
        System.out.printf("Area do circulo  %.2f%n", areaCirculo);

    }
}