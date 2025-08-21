import java.util.Scanner;

public class Uni2Exe19 {
    public static void main(String[] args) {
        int valorA, valorB, valorC, valorD;

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o Valor de B");
        valorB = sc.nextInt();
        valorA = valorB;

        System.out.println("Insira o Valor de C");
        valorC = sc.nextInt();

        System.out.println("Insira o Valor de D");
        valorD = sc.nextInt();
        valorC = sc.nextInt();

        System.out.println("O valor de A é: " + valorA);
        System.out.println("O valor de B é: " + valorB);
        System.out.println("O valor de C é: " + valorC);
        System.out.println("O valor de D é: " + valorD);

        sc.close();
    }
}
