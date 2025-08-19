import java.util.Scanner;

public class Uni2Exe07 {
    public static void main(String[] args) {
        String nomeVendedor;
        double salarioFixo, valorVendas, salarioFinal;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o Nome do Vendedor:");
        nomeVendedor = sc.next();

        System.out.println("Digite o Salário Fixo do vendedor:");
        salarioFixo = sc.nextDouble();

        System.out.println("Digite o Valor das Vendas do vendedor: ");
        valorVendas = sc.nextDouble();

        salarioFinal = salarioFixo + (valorVendas * 0.15);

        System.out.println(
                "O Salário do vendedor: " + nomeVendedor + ". Será de: " + String.format("%,.2f", salarioFinal));

        sc.close();
    }
}
