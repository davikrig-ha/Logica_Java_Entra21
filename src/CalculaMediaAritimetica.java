/*
Suponha que um programa que solicita ao usuario dois numeros e depois mostra a media aritimetica deles:

ex:
   *** ENTRADA DE DADOS ***
   Digite o primeiro numero: 3
   Digite o segundo numero: 6

 *** PROCESSAMENTO ***

     MEDIA = (3 + 6) / 2

   *** SAIDA DE DADOS ***

   Media aritimetica: 4.5
 */


public class CalculaMediaAritimetica {public static void main(String[] args){
                     // *** ENTRADA DE DADOS ***
               System.out.println("Digite o primeiro valor");

               double primeiroNumero = 2;
               System.out.println("Digite o segundo valor");
               double segundoNumero = 8;

               // *** PROCESSAMENTO ***
              double resultado = (primeiroNumero + segundoNumero) / 2;

               // *** SAIDA DE DADOS ***
        System.out.println("O resultado e " + resultado);

}
}
