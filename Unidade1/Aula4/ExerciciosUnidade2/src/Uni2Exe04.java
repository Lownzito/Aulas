import java.util.Scanner;

public class Uni2Exe04 {
    public static void main(String[] args) {
        float notaA, notaB, media;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a notaA");
        notaA = sc.nextFloat();

        System.out.println("Digite a notaB");
        notaB = sc.nextFloat();

        media = (notaA * 3.5f) + (notaB * 7.5f);
        
        System.out.println("Média final foi: " + media/11);

        sc.close();

        /**
         * Teste de Mesa:
         * 
         * Teste 1:
         * Entradas:
         * Nota 1: 10; Nota 2: 10;
         * Saida: 10;
         * 
         * Teste 2:
         * Entradas:
         * Nota 1: 7; Nota 2: 7;
         * Saida: 7;
         * 
         * Teste 3:
         * Entradas:
         * Nota 1: 5; Nota 2: 5;
         * Saida: 5;
         */
    }
}
