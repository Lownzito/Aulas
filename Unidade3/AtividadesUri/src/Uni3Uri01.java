import java.util.Scanner;

public class Uni3Uri01 {
    public static void main(String[] args) throws Exception {
        int numero1, numero2;

        Scanner sc = new Scanner(System.in);

        numero1 = sc.nextInt();

        numero2 = sc.nextInt();

        System.out.println("X = " + (numero1 + numero2));

        sc.close();
    }
}
