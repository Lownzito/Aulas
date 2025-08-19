import java.util.Scanner;

public class Uni2Exe05 {
    public static void main(String[] args) {
        int valorA, valorB, valorC, valorD, diferenca;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a valorA");
        valorA = sc.nextInt();

        System.out.println("Digite a valorB");
        valorB = sc.nextInt();

        System.out.println("Digite a valorC");
        valorC = sc.nextInt();

        System.out.println("Digite a valorD");
        valorD = sc.nextInt();

        diferenca = (valorA * valorB) - (valorC * valorD);

        System.out.println("A diferenca entre os produtos AB e CD é de: " + diferenca);
        
        sc.close();
    }
}
