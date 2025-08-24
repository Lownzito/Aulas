import java.util.Scanner;

public class Uni2Exe09 {
    public static void main(String[] args) {
        double cotacaoDolar = 5.44;
        double entradaDolares;

        Scanner sc = new Scanner(System.in);

        System.out.println("Valor de Dólares a serem trocados");
        entradaDolares = sc.nextDouble();

        System.out.println("Dê ao cliente: R$ " + String.format("%,.2f", entradaDolares * cotacaoDolar));

        sc.close();

        /**
         * Teste de Mesa:
         * 
         * Teste 1:
         * Entrada:
         * entrada de Dólares: 20,49;
         * Saída:
         * Dê ao cliente: R$ 111,47
         *  
         * Teste 2:
         * Entrada:
         * entrada de Dólares: 41;
         * Saída:
         * Dê ao cliente: R$ 223,04
         * 
         * Teste 3:
         * Entrada:
         * entrada de Dólares: 42,97;
         * Saída:
         * Dê ao cliente: R$ 233,76
         */
    }
}
