import java.util.Scanner;

public class Uni2Exe19 {
    public static void main(String[] args) {
        int valorA, valorB, valorC, valorD;

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o Valor de B");
        valorB = sc.nextInt();
        valorA = valorB;

        System.out.println("Insira o Valor de C");
        valorC = sc.nextInt();

        System.out.println("Insira o Valor de D");
        valorD = sc.nextInt();
        valorC = valorD;

        System.out.println("O valor de A é: " + valorA);
        System.out.println("O valor de B é: " + valorB);
        System.out.println("O valor de C é: " + valorC);
        System.out.println("O valor de D é: " + valorD);

        sc.close();
    }

    /**
     * Teste de Mesa:
     * 
     * Teste 1:
     * Entradas:
     * Valor B: 3; Valor C: 4; Valor D: 7;
     * Saídas:
     * O valor de A é: 3
     * O valor de B é: 3
     * O valor de C é: 7
     * O valor de D é: 7
     * 
     * Teste 2:
     * Entradas:
     * Valor B: 10; Valor C: 12; Valor D: 9;
     * Saídas:
     * O valor de A é: 10
     * O valor de B é: 10
     * O valor de C é: 9
     * O valor de D é: 9
     * 
     * Teste 3:
     * Entradas:
     * Valor B: 40; Valor C: 20; Valor D: 10;
     * Saídas:
     * O valor de A é: 40
     * O valor de B é: 40
     * O valor de C é: 10
     * O valor de D é: 10
     */
}
