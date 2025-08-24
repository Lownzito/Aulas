import java.util.Scanner;

public class Uni2Exe16 {
    public static void main(String[] args) {
        float lata = 350f, garrafa600 = 600f, garrafa2L = 2000f, calc;
        int quantidadeLata, quantidadeGarrafa600, quantidade2l;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a Quantidade de Latas de 350ml");
        quantidadeLata = sc.nextInt();

        System.out.println("Digite a Quantidade de Garrafas de 600ml");
        quantidadeGarrafa600 = sc.nextInt();

        System.out.println("Digite a Quantidade de Garrafas de 2L");
        quantidade2l = sc.nextInt();

        calc = ((quantidade2l * garrafa2L) + (quantidadeGarrafa600 * garrafa600) + (quantidadeLata * lata)) / 1000;

        System.out.println("Litros de refrigerante comprados: " + calc);

        sc.close();

        /**
         * Teste de Mesa:
         * 
         * Teste 1:
         * Entradas:
         * Quantidade Lata: 3; Quantidade Garrafa 600ml: 2;
         * Quantidade Garrafa 2L: 6;
         * 
         * Saída:
         * Litros de refrigerante comprados: 14.25
         * 
         * Teste 2:
         * Entradas:
         * Quantidade Lata: 1; Quantidade Garrafa 600ml: 1;
         * Quantidade Garrafa 2L: 1;
         * 
         * Saída:
         * Litros de refrigerante comprados: 2.95
         * 
         * Teste 3:
         * Entradas:
         * Quantidade Lata: 4; Quantidade Garrafa 600ml: 10;
         * Quantidade Garrafa 2L: 40;
         * 
         * Saída:
         * Litros de refrigerante comprados: 87,4
         */
    }
}
