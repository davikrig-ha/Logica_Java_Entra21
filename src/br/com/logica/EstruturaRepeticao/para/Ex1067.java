package EstruturaRepeticao.para;

import java.util.Scanner;

public class Ex1067 {
    /*
    Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha,
    inclusive o X, se for o caso.

Entrada
O arquivo de entrada contém 1 valor inteiro qualquer.

Saída
Imprima todos os valores ímpares de 1 até X, inclusive X, se for o caso.

Exemplo de Entrada
8

Exemplo de Saída
1
3
5
7
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

         if (x >= 1 && x <= 1000)
            for (int i = 1; i < x; i = i + 2) {
                System.out.println(i);
            } if (x % 2 != 0) {

            System.out.println(x);
        }
         scanner.close();
    }
}
