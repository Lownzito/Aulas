import java.util.Scanner;

public class Uni2Exe13 {
    public static void main(String[] args) {
        int distancia, minutosKm = 2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a diferença de distancia que o carro Y tem em relação ao X, em Km's ");
        distancia = sc.nextInt();

        System.out.println("O carro Y levou " + (distancia * minutosKm) + " minutos");

        sc.close();
    }
}
