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

        System.out.printf("Oi, meu nome é %s , e tenho %d anos, minha altura é %.2f , e meu peso é %.2f"
                , nome, idade, altura,peso);


      scanner.close();





    }




}
