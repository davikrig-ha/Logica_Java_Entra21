package EstruturaRepeticao.enquanto;

import java.util.Scanner;

public class Repeticao1 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int x = 5;
            int y = 0;

            while (x > 2){
                System.out.println(x);
                y = y + x;
                x = x -1;


            }
            scanner.close();
        }
    }


