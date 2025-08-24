import java.util.Scanner;

public class Uni2Exe02 {
    public static void main(String[] args) {
        int valor1, valor2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor a ser multiplicado");
        valor1 = sc.nextInt();

        System.out.println("Insira o multiplicador");
        valor2 = sc.nextInt();

        System.out.println("O valor é: " + (valor1 * valor2));
        sc.close();
        /**
         * Teste de Mesa 1
         * Entrada: valor1= 2, valor2 = 2;
         * Processamento: valor1 * valor2;
         * Saída: 4;
         * 
         * Teste de Mesa 2
         * Entrada: valor1= 3, valor2 = 3;
         * Processamento: valor1 * valor2;
         * Saída: 9;
         * 
         * Teste de Mesa 3
         * Entrada: valor1= 4, valor2 = 4;
         * Processamento: valor1 * valor2;
         * Saída: 16;
         */
    }
}
