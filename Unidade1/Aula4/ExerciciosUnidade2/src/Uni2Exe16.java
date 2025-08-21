import java.util.Scanner;

public class Uni2Exe16 {
    public static void main(String[] args) {
        float lata = 350f, garrafa600 = 600f, garrafa2L = 2000f, calc;
        int quantidadeLata, quantidadeGarrafa600, quantidade2l;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a Quantidade de Latas de 350ml");
        quantidadeLata = sc.nextInt();

        System.out.println("Digite a Quantidade de Garrafas de 600ml");
        quantidadeGarrafa600 = sc.nextInt();

        System.out.println("Digite a Quantidade de Garrafas de 2L");
        quantidade2l = sc.nextInt();

        calc = ((quantidade2l * garrafa2L) + (quantidadeGarrafa600 * garrafa600) + (quantidadeLata * lata)) / 1000;

        System.out.println("Litros de refrigerante comprados: " + calc);

        sc.close();
    }
}
