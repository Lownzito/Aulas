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
    }
}
