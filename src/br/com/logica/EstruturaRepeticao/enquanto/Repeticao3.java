package EstruturaRepeticao.enquanto;

import java.util.Scanner;

public class Repeticao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = 10.0;
        double y = 10.0;

        while (x != y){
            System.out.println("olá");
            x = Math.sqrt(y);
        }

scanner.close();
    }
}
