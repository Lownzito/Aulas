import java.util.Scanner;

public class Uni3Exe02 {
    public static void main(String[] args) {
        float preco, totalDescontado;

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor do calçado: ");
        preco = sc.nextFloat();

        totalDescontado = preco * 0.12f;

        System.out.println("O valor do desconto é de R$ " + String.format("%,.2f", totalDescontado));
        System.out.println(
                "O preço do par de sapatos com desconto é " + String.format("%,.2f", (preco - totalDescontado)));

        sc.close();
    }
}
