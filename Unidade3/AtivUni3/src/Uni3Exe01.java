import java.util.Scanner;

public class Uni3Exe01 {

    public static void main(String[] args) {
        int frente, comprimento;

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a Frente do terreno:");
        frente = sc.nextInt();

        System.out.println("Insira a Frente do terreno:");
        comprimento = sc.nextInt();

        System.out.println(comprimento * frente);

        sc.close();
    }
}
