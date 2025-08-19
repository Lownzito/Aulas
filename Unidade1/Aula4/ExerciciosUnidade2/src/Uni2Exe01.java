import java.util.Scanner;

public class Uni2Exe01 {
    public static void main(String[] args) {
        int valor1, valor2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor valido");
        valor1 = sc.nextInt();

        System.out.println("Digite um valor valido");
        valor2 = sc.nextInt();

        System.out.println("A soma dos dois valores é: " + (valor1 + valor2));
        sc.close();

        /**
         * Teste de Mesa
         * Entrada: valor1 = 5, valor2 = 10
         * Processamento: valor1+ valor2
         * Saída deve ser: 15
         */
    }

}
