import java.util.Scanner;

public class Uni3Exe03 {
    public static void main(String[] args) {
        float preco, pago;

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor do litro da gasolina: ");
        preco = sc.nextFloat();

        System.out.println("Insira o valor pago: ");
        pago = sc.nextFloat();

        System.out.println("O motorista conseguiu colocar: " + String.format("%,.2f", (pago / preco)) + " litros");

        sc.close();
    }
}
