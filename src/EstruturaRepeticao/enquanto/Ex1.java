package EstruturaRepeticao.enquanto;

import java.util.Scanner;

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
