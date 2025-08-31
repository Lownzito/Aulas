import java.util.Scanner;

public class Uni3Exe04 {
    public static void main(String[] args) {
        float nota1, nota2, nota3, calculo;

        Scanner sc = new Scanner(System.in);

        System.out.println("Nota 1: ");
        nota1 = sc.nextFloat();

        System.out.println("Nota 2: ");
        nota2 = sc.nextFloat();

        System.out.println("Nota 3: ");
        nota3 = sc.nextFloat();

        calculo = (nota1 * 0.5f) + (nota2 * 0.3f) + (nota3 * 0.2f);

        System.out.println(String.format("%,.2f",calculo));

        sc.close();
    }
}
