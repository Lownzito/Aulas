import java.util.Scanner;

public class Uni3Uri03 {
    public static void main(String[] args) {
        int numero1, numero2, PROD;

        Scanner sc = new Scanner(System.in);

        numero1 = sc.nextInt();
        numero2 = sc.nextInt();

        PROD = numero1 * numero2;

        System.out.println("PROD = " + PROD);

        sc.close();
    }
}
