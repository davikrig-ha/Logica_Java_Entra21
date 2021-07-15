import java.util.Scanner;

public class DiaDaSemana {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o dia da semana");
        int diaSemana = scanner.nextInt();
        String dia = "";

            switch (diaSemana) {
                case 1:
                   dia = "Domingo";
                    break;
                case 2:
                    dia = "Segunda-feira";
                    break;
                case 3:
                    dia = "Terça-feira";
                    break;

                case 4:
                    dia = "Quarta-feira";
                    break;

                case 5:
                    dia = "Quinta-feira";
                    break;

                case 6:
                    dia = "Sexta-feira";
                    break;

                case 7:
                    dia = "Sabado";
                    break;

                default:
                    dia =    "Dia não Encontrado";
                    break;


            }
        }
    }
