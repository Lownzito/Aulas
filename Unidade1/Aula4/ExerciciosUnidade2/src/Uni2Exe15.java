import java.util.Scanner;

public class Uni2Exe15 {
    public static void main(String[] args) {
        int valorInteiro, valorDecimos;
        double valor;

        //tornar o número em int para tirar as notas do valor, ou fazer um splice de string
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor a ser decomposto: ");
        valor = sc.nextDouble();

        valorInteiro = (int)valor;
        valorDecimos = (int) Math.round((valor - valorInteiro) * 100);

        System.out.println("Notas de 100 Reais: " + valorInteiro / 100);
        valorInteiro %= 100;

        System.out.println("Notas de 50 Reais: " + valorInteiro / 50);
        valorInteiro %= 50;

        System.out.println("Notas de 20 Reais: " + valorInteiro / 20);
        valorInteiro %= 20;

        System.out.println("Notas de 10 Reais: " + valorInteiro / 10);
        valorInteiro %= 10;

        System.out.println("Notas de 5 Reais: " + valorInteiro / 5);
        valorInteiro %= 5;

        System.out.println("Notas de 2 Reais: " + valorInteiro / 2);
        valorInteiro %= 2;

        System.out.println("Moedas de 1 Real: " + valorInteiro);

        System.out.println("Moedas de 50 Centavos: " + valorDecimos / 50);
        valorDecimos %= 50;

        System.out.println("Moedas de 25 Centavos: " + valorDecimos / 25);
        valorDecimos %= 25;

        System.out.println("Moedas de 10 Centavos: " + valorDecimos / 10);
        valorDecimos %= 10;

        System.out.println("Moedas de 5 Centavos: " + valorDecimos / 5);
        valorDecimos %= 5;

        System.out.println("Moedas de 1 Centavo: " + valorDecimos);

        sc.close();
    }
}
