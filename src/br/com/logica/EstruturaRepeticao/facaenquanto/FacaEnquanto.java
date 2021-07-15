package EstruturaRepeticao.facaenquanto;

import java.util.Locale;
import java.util.Scanner;

public class FacaEnquanto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        char resposta;

        do {
            System.out.println("Digite a temperatura em Celsius: ");
            double c = scanner.nextDouble();
            double formula = 9.0 * c / 5.0 + 32.0;
            System.out.printf("Equivalente em Fahrenheit: %.f%n ", formula);
            System.out.println("Deseja repetir novamente a conversao (S/N) ");
            resposta = scanner.next().charAt(0);
        }while (resposta != 'n');

        scanner.close();
    }

}
