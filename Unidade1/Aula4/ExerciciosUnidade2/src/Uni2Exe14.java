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
}
