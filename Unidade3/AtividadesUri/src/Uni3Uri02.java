import java.util.Scanner;

public class Uni3Uri02 {
    public static void main(String[] args) {
        double raio, pi = 3.14159;

        Scanner sc = new Scanner(System.in);

        raio = sc.nextDouble();

        double calculo = pi * Math.pow(raio, 2);

        System.out.printf("A=%.4f%n", calculo);

        sc.close();
    }
}
