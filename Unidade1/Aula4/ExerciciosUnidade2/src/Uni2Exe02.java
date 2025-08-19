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
         * Teste de Mesa
         * Entrada: valor1= 2, valor2 = 2;
         * Processamento: valor1 * valor2;
         * Saída: O valor é 4;
         */
    }
}
