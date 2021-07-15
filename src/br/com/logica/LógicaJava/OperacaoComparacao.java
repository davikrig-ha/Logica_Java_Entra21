public class OperacaoComparacao {
    public static void main(String[] args) {

        //MENOR QUE
        boolean menorQue = 5 < 10;
        System.out.println("menor que " + menorQue);
        //MAIOR QUE
        boolean maiorQue = 5 > 10;
        System.out.println("maior que " + maiorQue);

        //MENOR OU IGUAL A QUE
        boolean igual = 10 <= 10;
        System.out.println("igual a " + igual);
        //MAIOR OU IGUAL A QUE
        boolean maior = 5 >= 10;
        System.out.println("maior que " + maior);

        //IGUALDADE
        boolean Igual = 5 == 10;
        System.out.println("igual " + Igual);

        //DIFERENTE
        boolean diferente = 5 != 10;
        System.out.println("diferente " + diferente);

        System.out.println("-----------------------------------------");

        int x = 5;
        System.out.println(x > 0);
        System.out.println(x == 3);
        System.out.println(10 <= 30);
        System.out.println(x != 2);

        System.out.println("--------------------------------------------------");


        System.out.println(x <= 20 && x == 10);

        System.out.println(x > 0 && x != 3);

        System.out.println(x <= 20 && x == 10 && x != 3);

        System.out.println("-----------------------------OR--ou---OU-----");

        System.out.println(x <= 20 || x == 10);

        System.out.println(x > 0 || x != 3);

        System.out.println(x <= 20 || x == 10 || x != 3);

        System.out.println("------------NÃO----OU----NOT----------");

        System.out.println(!(x == 10));
        System.out.println(!(x >= 2));
        System.out.println(!(x <= 20) && (x == 10));
    }
}
