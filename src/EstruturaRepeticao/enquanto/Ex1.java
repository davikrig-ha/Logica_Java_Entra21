package EstruturaRepeticao.enquanto;

import java.util.Scanner;
/*
URI 1113
Leia uma quantidade indeterminada de duplas de valores inteiros X e Y.
Escreva para cada X e Y uma mensagem que indique
se estes valores foram digitados em ordem crescente ou decrescente.

Entrada
A entrada contém vários casos de teste. Cada caso contém dois valores inteiros X e Y.
 A leitura deve ser encerrada ao ser fornecido valores iguais para X e Y.

Saída
Para cada caso de teste imprima “Crescente”, caso os valores tenham sido digitados na
ordem crescente, caso contrário imprima a mensagem “Decrescente”.

Entrada         Exemplo da saida
5 4             Decrescente
7 2             Decrescente
3 8             Crescente
2 2

*/


public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int x = scanner.nextInt();
       int soma = 0;
       int cont = 0;

       while (x >= 0){
           soma += x;
           cont ++;
            x = scanner.nextInt();
       }
      if (cont > 0){
          double media = (double) soma / cont;
          System.out.printf("%.2f%n", media);
      }
      else{
          System.out.println("impossivel de calcular ");
      }
      scanner.close();
    }
}
