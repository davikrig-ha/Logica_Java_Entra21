package EstruturaRepeticao.enquanto;

import java.util.Scanner;

public class Repeticao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = 2;
        int y = 0;

        while (x < 60){
            System.out.println(x);
            x = x * 2;
            y = y + 10;
        }
        scanner.close();
    }
}
