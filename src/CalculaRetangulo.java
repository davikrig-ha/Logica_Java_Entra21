import java.util.Locale;
import java.util.Scanner;

/*Fazer um programa para ler as medidas da base e altura de um retângulo.
Em seguida,  mostrar o valor da área, perímetro e diagonal deste retângulo,
com quatro casas  decimais, conforme exemplo.

Exemplo:
 Entrada:       Saída:
5.0             AREA = 20.0000
4.0             PERIMETRO = 18.0000
                DIAGONAL = 6.4031
*/
public class CalculaRetangulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);

        //SONFIGURANDO A ENTRADA DE DADOS PARA ACEITAR PONTO

        System.out.println("digite o valor da base: ");
        double base = s.nextDouble();

        System.out.println("digite o valor da altura: ");
        double altura = s.nextDouble();

        //PROCESSAMENTO DE DADOS
        double area = base * altura;
        double perimetro = 2 * base + 2 * altura;
        double diagonal = Math.sqrt(base * base + altura * altura);

        //SAIDA DE DADOS
        System.out.println("AREA = " + area);
        System.out.println("PERIMETRO = " + perimetro);
        System.out.println("DIAGONAL = " + diagonal);


        s.close();
    }
}
