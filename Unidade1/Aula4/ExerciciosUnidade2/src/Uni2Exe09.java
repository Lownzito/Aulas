import java.util.Scanner;

public class Uni2Exe09 {
    public static void main(String[] args) {
        double cotacaoDolar = 5.44;
        double entradaDolares;

        Scanner sc = new Scanner(System.in);

        System.out.println("Valor de Dólares a serem trocados");
        entradaDolares = sc.nextDouble();

        System.out.println("Dê ao cliente: " + String.format("%,.2f", entradaDolares * cotacaoDolar));

        sc.close();
    }
}
