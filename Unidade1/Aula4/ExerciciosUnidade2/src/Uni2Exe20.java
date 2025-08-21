import java.util.Scanner;

public class Uni2Exe20 {
    public static void main(String[] args) {
        int numeroDeDobras; 

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o número de dobras feitas");
        numeroDeDobras = sc.nextInt();

        System.out.println("O número de quadrados é:" + (numeroDeDobras * 4));

        sc.close();
    }
}