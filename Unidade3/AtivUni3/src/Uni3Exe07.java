import java.util.Scanner;

public class Uni3Exe07 {

    public static void main(String[] args) {
        int quantLata, quantGarrafa600ml, quantGarrafa2L;

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantidade de latas: ");
        quantLata = sc.nextInt();

        System.out.println("Quantidade de Garrafas de 600ml: ");
        quantGarrafa600ml = sc.nextInt();

        System.out.println("Quantidade de Garrafas de 2 Litros: ");
        quantGarrafa2L = sc.nextInt();

        System.out.println("O cliente comprou ao total "
                + String.format("%,.2f", totalVendido(quantLata, quantGarrafa600ml, quantGarrafa2L)) + " litros");

        sc.close();
    }

    private static float totalVendido(int quantLata, int quantGarrafa600ml, int quantGarrafa2L) {
        float calculo = (0.35f * quantLata) + (0.60f * quantGarrafa600ml) + (2.0f * quantGarrafa2L);
        return calculo;
    }
}
