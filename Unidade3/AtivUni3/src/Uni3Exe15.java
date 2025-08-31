import java.util.Scanner;

public class Uni3Exe15 {
    public static void main(String[] args) {
        int valor, centenas, dezenas, unidades;

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor a ser decomposto:");
        valor = sc.nextInt();

        centenas = valor / 100;
        valor %= 100;
        dezenas = valor / 10;
        valor %= 10;
        unidades = valor % 10;

        System.out.println(centenas + " centena(s) " + dezenas + " dezenas " + unidades + " unidades");

        sc.close();
    }
}
