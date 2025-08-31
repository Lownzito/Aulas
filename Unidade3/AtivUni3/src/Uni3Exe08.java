import java.util.Scanner;

public class Uni3Exe08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Valor de Dólares a serem trocados: ");
        double value = exchange(sc.nextDouble());

        System.out.println("O atendente deve devolver R$ " + String.format("%,.2f", value) + " para o cliente.");

        sc.close();
    }

    public static double exchange(double value) {
        double dolarExchangeRate = 5.65;

        double exchangedValue = value * dolarExchangeRate;

        return exchangedValue;
    }
}
