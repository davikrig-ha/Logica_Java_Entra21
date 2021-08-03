package br.com.javaoo;

import br.com.javaoo.entities.Product;
import java.util.Locale;

public class Principal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Product p = new Product();

        //setando os valores

        p.setName("Cadeira");
        p.setPrice(120.0);
        p.setQuantity(2);
        p.setColor("Vermelha");

       //Pegando os valores

        System.out.println("Produto: " + p.getNAME());
        System.out.println("Preço: " + p.getPrice() + " R$");
        System.out.println("Quantidade: " + p.getQuantity());
        System.out.println("Cor: " + p.getColor());
        System.out.println("Quantidade em Estoque: " + p.totalValueInStock());

    }
}
