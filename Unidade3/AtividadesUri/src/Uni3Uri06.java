import java.util.Scanner;

public class Uni3Uri06 {
    public static void main(String[] args) {
        double valor;
        int centavos, reais;
        Scanner sc = new Scanner(System.in);

        valor = sc.nextDouble();

        reais = (int) valor;

        centavos = (int) Math.round((valor - reais) * 100);

        System.out.println("NOTAS:");
        System.out.println((reais / 100) + " nota(s) de R$ 100.00");
        reais %= 100;

        System.out.println((reais / 50) + " nota(s) de R$ 50.00");
        reais %= 50;

        System.out.println((reais / 20) + " nota(s) de R$ 20.00");
        reais %= 20;

        System.out.println((reais / 10) + " nota(s) de R$ 10.00");
        reais %= 10;

        System.out.println((reais / 5) + " nota(s) de R$ 5.00");
        reais %= 5;

        System.out.println((reais / 2) + " nota(s) de R$ 2.00");
        reais %= 2;

        System.out.println("MOEDAS:");
        System.out.println(reais + " moeda(s) de R$ 1.00");

        System.out.println(centavos / 50 + " moeda(s) de R$ 0.50");
        centavos %= 50;

        System.out.println(centavos / 25 + " moeda(s) de R$ 0.25");
        centavos %= 25;

        System.out.println(centavos / 10 + " moeda(s) de R$ 0.10");
        centavos %= 10;

        System.out.println(centavos / 5 + " moeda(s) de R$ 0.05");
        centavos %= 5;

        System.out.println(centavos + " moeda(s) de R$ 0.01");

        sc.close();
    }
}
