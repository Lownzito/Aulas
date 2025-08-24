import java.util.Scanner;

public class Uni2Exe13 {
    public static void main(String[] args) {
        int distancia, minutosKm = 2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a diferença de distancia que o carro Y tem em relação ao X, em Km's ");
        distancia = sc.nextInt();

        System.out.println("O carro Y levou " + (distancia * minutosKm) + " minutos");

        sc.close();
    }

    /**
     * Teste de mesa:
     * 
     * Teste 1:
     * 
     * Entradas:
     * Distancia: 30
     * 
     * Saída:
     * O carro Y levou 60 minutos
     * 
     * Teste 2:
     * 
     * Entradas:
     * Distancia: 97
     * 
     * Saída:
     * O carro Y levou 194 minutos
     * 
     * Teste 1:
     * 
     * Entradas:
     * Distancia: 55
     * 
     * Saída:
     * O carro Y levou 110 minutos
     */
}
