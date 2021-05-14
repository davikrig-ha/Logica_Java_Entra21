import java.util.Locale;
import java.util.Scanner;

/*Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas,
 o valor que recebe por hora e calcula o salário desse funcionário.
 A seguir, mostre o número e o salário do funcionário, com duas casas decimais.

Entrada
O arquivo de entrada contém 2 números inteiros e 1 número com duas casas decimais,
 representando o número, quantidade de horas trabalhadas e o valor que o funcionário recebe por hora trabalhada,
  respectivamente.

Saída
Imprima o número e o salário do funcionário, conforme exemplo fornecido, com um espaço em branco antes
 e depois da igualdade. No caso do salário, também deve haver um espaço em branco após o $.

Exemplos de Entrada                                 	Exemplos de Saída
                                                         NUMBER = 25
25                                                       SALARY = U$ 550.00
100
5.50

1
200
20.50

                                                        NUMBER = 1
                                                        SALARY = U$ 4100.00

6
145
15.55

                                                         NUMBER = 6
                                                         SALARY = U$ 2254.75

 */

public class Ex1008 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        //ENTRADA DE DADOS

        int NUMBER = scanner.nextInt();
        int B = scanner.nextInt();
        double C = scanner.nextDouble();

        //PROCESSAMENTO

        double SALARY = B * C;

        //SAIDA DE DADOS

        System.out.println("NUMBER = " + NUMBER);
        System.out.printf("SALARY = U$ %.2f%n", SALARY);


        scanner.close();

    }
}
