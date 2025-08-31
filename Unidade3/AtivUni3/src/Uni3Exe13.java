import java.util.Scanner;

public class Uni3Exe13 {
    public static void main(String[] args) {
        float altura, comprimento;

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a altura da parede");
        altura = sc.nextFloat();

        System.out.println("Insira a comprimento da parede");
        comprimento = sc.nextFloat();

        float area = calcArea(altura, comprimento);

        System.out.println("O valor final é R$ " + String.format("%,.2f" , calcValorFinal(area)));

        sc.close();
    }

    private static float calcArea(float altura, float comprimento) {
        return altura * comprimento;
    }

    private static float calcValorFinal(float area) {
        float valorAzulejoMetro = 112.5f;

        int areaInteira = (int) area;
        float areaRestante = area - areaInteira;

        return (areaInteira * valorAzulejoMetro) + (areaRestante * valorAzulejoMetro);
    }
}
