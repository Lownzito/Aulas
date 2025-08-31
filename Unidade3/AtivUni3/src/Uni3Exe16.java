import java.util.Scanner;

public class Uni3Exe16 {
    public static void main(String[] args) {
        int valorCompra;

        Scanner sc = new Scanner(System.in);

        System.out.println("Valor da compra: ");
        valorCompra = sc.nextInt();

        System.out.println("Valor pago: ");
        troco(sc.nextInt(), valorCompra);

        sc.close();
    }

    private static void troco(int pago, int valorCompra) {
        int troco = pago - valorCompra;

        System.out.println("Quantidade de notas de 100 necessárias é: " + (troco / 100));
        troco %= 100;

        System.out.println("Quantidade de notas de 100 necessárias é: " + (troco / 10));
        troco %= 10;

        System.out.println("Quantidade de notas de 100 necessárias é: " + troco);
    }
}
