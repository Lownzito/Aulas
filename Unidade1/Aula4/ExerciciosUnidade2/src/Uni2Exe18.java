import java.util.Scanner;

public class Uni2Exe18 {
    public static void main(String[] args) {
        double azulejoPreco = 12.50, alturaParede, comprimentoParede, total ;

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a altura da parede");
        alturaParede = sc.nextDouble();

        System.out.println("Insira o comprimento da parede");
        comprimentoParede = sc.nextDouble();

        total = azulejoPreco * (alturaParede * comprimentoParede);

        System.out.println("O valor para cubrir a parede com azulejos é de: R$ " + String.format("%,.2f", total) );

        sc.close();

        /**
         * Teste de Mesa:
         * 
         * Teste 1:
         * Entradas:
         * Altura Parede: 6,3; Comprimento Parede: 9,8;
         * 
         * Saída:
         * O valor para cubrir a parede com azulejos é de: R$ 771,75
         * 
         * Teste 2:
         * Entradas:
         * Altura Parede: 3,4; Comprimento Parede: 5,4;
         * 
         * Saída:
         * O valor para cubrir a parede com azulejos é de: R$ 229,50
         * 
         * Teste 3:
         * Entradas:
         * Altura Parede: 5,4; Comprimento Parede: 7,5;
         * 
         * Saída:
         * O valor para cubrir a parede com azulejos é de: R$ 506,25
         */
    }
}
