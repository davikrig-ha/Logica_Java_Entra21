import java.util.Locale;
import java.util.Scanner;

public class CalculadoraImc {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        //ENTRADA DE DADOS
        System.out.println("Digite a sua altura");
        double altura = scanner.nextDouble();

        System.out.println("Digite o seu peso");
        double peso = scanner.nextDouble();


        //SAIDA DE DADOS
        double resultado = peso/ (altura * altura);
        if (resultado < 18.5){
            System.out.println("Magreza ");
        }else if (resultado == 18.5 && resultado < 24.9){
            System.out.println("Normal ");
        }else if (resultado == 24.9 && resultado < 30.0){
            System.out.println("Sobrepeso ");
        }if (resultado >= 30.0){
            System.out.println("Obesidade ");
        }


        scanner.close();
    }
}
