import java.util.Scanner;

public class Uni2Exe05 {
    public static void main(String[] args) {
        int valorA, valorB, valorC, valorD, diferenca;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a valorA");
        valorA = sc.nextInt();

        System.out.println("Digite a valorB");
        valorB = sc.nextInt();

        System.out.println("Digite a valorC");
        valorC = sc.nextInt();

        System.out.println("Digite a valorD");
        valorD = sc.nextInt();

        diferenca = (valorA * valorB) - (valorC * valorD);

        System.out.println("A diferenca entre os produtos AB e CD é de: " + diferenca);
        
        sc.close();

        /**
         * Teste de Mesa:
         * 
         * Teste 1:
         * Entradas:
         * Valor A: 1; Valor B: 1; Valor C: 1; Valor D: 1;
         * Saida: 0;
         * 
         * Teste 2:
         * Entradas:
         * Valor A: 12; Valor B: 10; Valor C: 5; Valor D: 6;
         * Saida: 10;
         * 
         * Teste 3:
         * Entradas:
         * Valor A: 6; Valor B: 8; Valor C: 10; Valor D: 3;
         * Saida: 10;
         */
    }
}
