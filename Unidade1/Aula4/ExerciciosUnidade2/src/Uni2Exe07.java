import java.util.Scanner;

public class Uni2Exe07 {
    public static void main(String[] args) {
        String nomeVendedor;
        double salarioFixo, valorVendas, salarioFinal;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o Nome do Vendedor:");
        nomeVendedor = sc.nextLine();

        System.out.println("Digite o Salário Fixo do vendedor:");
        salarioFixo = sc.nextDouble();

        System.out.println("Digite o Valor das Vendas do vendedor: ");
        valorVendas = sc.nextDouble();

        salarioFinal = salarioFixo + (valorVendas * 0.15);

        System.out.println(
                "O Salário do vendedor: " + nomeVendedor + ". Será de: " + String.format("%,.2f", salarioFinal));

        sc.close();

        /**
         * Teste de Mesa:
         * 
         * Teste 1:
         * Entradas:
         * Nome Vendedor: Thrall; Salario Fixo: 1000; Valor de Vendas: 500;  
         * Saída:
         * O Salário do vendedor: Thrall. Será de: 1.075,00
         * 
         * Teste 2:
         * Entradas:
         * Nome Vendedor: Arthas Menethil; Salario Fixo: 2031,45; Valor de Vendas: 789,99;  
         * Saída:
         * O Salário do vendedor: Arthas Menethil. Será de: 2.149,95
         * 
         * Teste 3:
         * Entradas:
         * Nome Vendedor: Gul'Dan ; Salario Fixo: 6959,42: Valor de Vendas: 678,99;  
         * Saída:
         * O Salário do vendedor: Gul'Dan. Será de: 7.061,27
         */
    }
}
