import java.util.Scanner;

public class Uni2Exe14 {
    public static void main(String[] args) {
        int valorAserDecomposto, quant100, quant50, quant20, quant10, quant5, quant2, quant1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor a ser decomposto: ");
        valorAserDecomposto = sc.nextInt();

        //versão sopa de letrinhas :D
        quant100 = valorAserDecomposto / 100;
        quant50 = (valorAserDecomposto % 100) / 50;
        quant20 = ((valorAserDecomposto % 100) % 50) / 20;
        quant10 = (((valorAserDecomposto % 100) % 50) % 20) / 10;
        quant5 = ((((valorAserDecomposto % 100) % 50) % 20) % 10) / 5;
        quant2 = (((((valorAserDecomposto % 100) % 50) % 20) % 10) % 5) / 2;
        quant1 = (((((valorAserDecomposto % 100) % 50) % 20) % 10) % 5) % 2;

        System.out.println("Notas de 100: "+ quant100);
        System.out.println("Notas de 50: "+ quant50);
        System.out.println("Notas de 20: "+ quant20);
        System.out.println("Notas de 10: "+ quant10);
        System.out.println("Notas de 5: "+ quant5);
        System.out.println("Notas de 5: "+ quant2);
        System.out.println("Notas de 1: "+ quant1);

        sc.close();
    }

    /**
     * Teste de Mesa:
     * 
     * Teste 1:
     * Entrada:
     * Valor a ser decomposto: 137
     * 
     * Saída:
     * Notas de 100: 1
     * Notas de 50: 0
     * Notas de 20: 1
     * Notas de 10: 1
     * Notas de 5: 1 
     * Notas de 5: 1 
     * Notas de 1: 0 
     * 
     * Teste 2:
     * Entrada:
     * Valor a ser decomposto: 23145
     * 
     * Saída:
     * Notas de 100: 231
     * Notas de 50: 0
     * Notas de 20: 2
     * Notas de 10: 0
     * Notas de 5: 1
     * Notas de 5: 0
     * Notas de 1: 0
     * 
     * Teste 3:
     * Entrada:
     * Valor a ser decomposto: 245114
     * 
     * Saída:
     * Notas de 100: 2451
     * Notas de 50: 0
     * Notas de 20: 0
     * Notas de 10: 1
     * Notas de 5: 0
     * Notas de 5: 2
     * Notas de 1: 0
     */
}
