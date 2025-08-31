import java.util.Scanner;

public class Uni3Exe05 {
    public static void main(String[] args) {
        int frangos;
        double calculo;
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos frangos a serem marcados?");
        frangos = sc.nextInt();

        calculo = frangos * 11;

        System.out.println("O gasto total para marcar " + frangos + " é R$ " + calculo);

        sc.close();
    }
}
