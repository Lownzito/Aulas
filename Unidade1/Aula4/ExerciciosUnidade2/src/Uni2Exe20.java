import java.util.Scanner;

public class Uni2Exe20 {
    public static void main(String[] args) {
        int numeroDeDobras; 

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o número de dobras feitas");
        numeroDeDobras = sc.nextInt();

        System.out.println("O número de quadrados é:" + (int) Math.pow(2, numeroDeDobras));

        sc.close();
    }

    /**
     * Teste de Mesa:
     * 
     * Teste 1:
     * Entrada:
     * Número de dobras: 4
     * 
     * Saída:
     * O número de quadrados é:16
     * 
     * Teste 2:
     * Entrada:
     * Número de dobras: 8
     * 
     * Saída:
     * O número de quadrados é:256
     * 
     * Teste 1:
     * Entrada:
     * Número de dobras: 10
     * 
     * Saída:
     * O número de quadrados é:1024
     */
}