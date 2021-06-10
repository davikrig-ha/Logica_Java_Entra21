package EstruturaRepeticao.enquanto;

import java.util.Scanner;

public class Repeticao4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int x = 0;

       while (x < 5){
          int y = x * 3;
           System.out.println(y);
           x = x + 1;

       }
      scanner.close();
    }
}
