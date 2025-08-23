import java.util.Scanner;

public class Uni2Exe18 {
    public static void main(String[] args) {
        double azulejoPreco = 12.50, alturaParede, comprimentoParede, total ;

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a altura da parede");
        alturaParede = sc.nextDouble();

        System.out.println("Insira o comprimento da parede");
        comprimentoParede = sc.nextDouble();

        total = azulejoPreco * (alturaParede * comprimentoParede);

        System.out.println("O valor para cubrir a parede com azulejos é de: R$ " + String.format("%,.2f", total) );

        sc.close();
    }
}
