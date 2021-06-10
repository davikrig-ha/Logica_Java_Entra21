package EstruturaRepeticao.enquanto;

import java.util.Scanner;

public class Repeticao5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = 2;
        int y = 10;

        System.out.println("olá");

        while (x < y){
            System.out.println(x + "-" + y);
            x = x * 2;
            y = y + 1;
        }
      scanner.close();
    }

}
