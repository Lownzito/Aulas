import java.util.Scanner;

public class Uni2Exe03 {
    public static void main(String[] args) {
        double raio, circuferencia;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o Raio");
        raio = sc.nextDouble();

        circuferencia = Math.pow(raio, 2) * Math.PI;

        System.out.println("A circuferência é: " + circuferencia);

        sc.close();

        /**
         * Teste de Mesa:
         * 
         * Teste 1:
         * Entrada: raio: 7,15
         * Saída: A circuferência é: 8.400456622576472
         * 
         * Teste 2:
         * Entrada: raio: 4
         * Saída: A circuferência é: 50.26548245743669
         * Teste 3:
         * 
         * Entrada: raio: 5
         * Saída: A circuferência é: 78.53981633974483
         */
    }
}
