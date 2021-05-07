import java.util.Scanner;

public class CalculoImc {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // ENTRADA DE DADOS

        System.out.println("Digite a sua altura");
        double altura = scanner.nextDouble();

        System.out.println("Digite o seu peso");
        double peso = scanner.nextDouble();


        // PROCESSAMENTO

        double resultado = peso/ (altura * altura);

        // SAIDA DE DADOS

        System.out.println("O resultado é " + resultado);







    }
}
