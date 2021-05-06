import java.util.Scanner;

public class TrabalhandoComTexto {

    public static void main(String[] args){

    /* Criar mensagem que solicita ao usuario o nome
         e a idade */

        Scanner scanner = new Scanner(System.in);
           // ENTRADA DE DADOS
        System.out.println("Digite o seu nome");
        String nome = scanner.nextLine();

        System.out.println("Digite a sua idade");
         int idade = scanner.nextInt();

         System.out.println("Digite a sua altura");
         double altura = scanner.nextDouble();

         System.out.println("Digite o seu peso");
         double peso = scanner.nextDouble();

        //processamento

        String valoresConcatenados = "Oi, meu nome é " + nome + ", Tenho " + idade +
                " anos, minha altura é " + altura + " metros e estou pesando " + peso + "kg";





         // SAIDA DE DADOS

        System.out.println(valoresConcatenados);


    }




}
