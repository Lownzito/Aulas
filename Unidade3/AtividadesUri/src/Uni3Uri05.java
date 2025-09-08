import java.util.Scanner;

public class Uni3Uri05 {
    public static void main(String[] args) {
        int valorA, valorB, valorC, valorD, dif;

        Scanner sc = new Scanner(System.in);

        valorA = sc.nextInt();
        valorB = sc.nextInt();
        valorC = sc.nextInt();
        valorD = sc.nextInt();

        dif = (valorA * valorB) - (valorC * valorD);

        System.out.println("DIFERENCA = " + dif);
        
        sc.close();
    }
}
