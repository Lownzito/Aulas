import java.util.Scanner;

public class Uni2Exe08 {
    public static void main(String[] args) {
        String idPeca1, idPeca2;
        int qntPeca1, qntPeca2;
        double valorPeca1, valorPeca2, totalPeca1, totalPeca2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o Código da Primeira Peça:");
        idPeca1 = sc.next();

        System.out.println("Quantidade da Primeira Peça:");
        qntPeca1 = sc.nextInt();

        System.out.println("Valor da Primeira Peça:");
        valorPeca1 = sc.nextDouble();

        System.out.println("Digite o Código da Segunda Peça:");
        idPeca2 = sc.next();

        System.out.println("Quantidade da Segunda Peça:");
        qntPeca2 = sc.nextInt();

        System.out.println("Valor da Segunda Peça: ");
        valorPeca2 = sc.nextDouble();

        totalPeca1 = valorPeca1 * qntPeca1;

        totalPeca2 = valorPeca2 * qntPeca2;

        System.out.println("O total a ser pago da peça: " + idPeca1 + " será: " + String.format("%,.2f", totalPeca1));
        System.out.println("O total a ser pago da peça: " + idPeca2 + " será: " + String.format("%,.2f", totalPeca2));

        System.out.println("O total a ser pago será: " + String.format("%,.2f", totalPeca1 + totalPeca2));

        sc.close();

        /**
         * Teste de Mesa:
         * 
         * Teste 1:
         * Entradas:
         * ID Peça1: 1; Valor Peça 1: 5; Quantidade Peça 1: 10,99;
         * ID Peça2: B; Valor Peça 2: 9; Quantidade Peça 2: 32,59;
         * 
         * Saídas:
         * O total a ser pago da peça: 1 será: 54,95 
         * O total a ser pago da peça: B será: 293,31
         * O total a ser pago será: 348,26
         * 
         * Teste 2:
         * Entradas:
         * ID Peça1: 2; Valor Peça 1: 10; Quantidade Peça 1: 20;
         * ID Peça2: C; Valor Peça 2: 18; Quantidade Peça 2: 64;
         * 
         * Saídas:
         * O total a ser pago da peça: 2 será: 200,00
         * O total a ser pago da peça: C será: 1.152,00
         * O total a ser pago será: 1.352,00
         * 
         * Teste 3:
         * Entradas:
         * ID Peça1: 3; Valor Peça 1: 20; Quantidade Peça 1: 40;
         * ID Peça2: D; Valor Peça 2: 36; Quantidade Peça 2: 128;
         * 
         * Saídas:
         * O total a ser pago da peça: 3 será: 800,00
         * O total a ser pago da peça: D será: 4.608,00
         * O total a ser pago será: 5.408,00
         */
    }
}
