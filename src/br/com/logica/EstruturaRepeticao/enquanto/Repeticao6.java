package EstruturaRepeticao.enquanto;

import java.util.Scanner;

public class Repeticao6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = 4;
        int y = 0;
        int i = 0;

        while (i < x){
            i = i + 1;
            y = y + i;

            System.out.println(i);
            System.out.println(y);
        }

    scanner.close();


    }
}
