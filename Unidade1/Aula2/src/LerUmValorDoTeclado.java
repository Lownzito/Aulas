import java.util.Scanner;

/**
 * o Scanner lê as informações que o usuário inserir
 */

public class LerUmValorDoTeclado {

    public static void main(String[] args) {
        // exemploScanner();
        exemploMediaComNome();
    }

    public static void exemploScanner() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do Aluno: ");
        String nomeAluno = scanner.nextLine();

        System.out.println("O nome do Aluno é: " + nomeAluno);

        scanner.close();
    }

    public static void exemploMediaComNome() {
        float nota1, nota2, nota3, media = 0.00f;
        String nomeAluno;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o Nome do Aluno");
        nomeAluno = scanner.nextLine();

        System.out.println("Insira a Primeira nota");
        nota1 = scanner.nextFloat();

        System.out.println("Insira a Segunda nota");
        nota2 = scanner.nextFloat();

        System.out.println("Insira a Terceira nota");
        nota3 = scanner.nextFloat();

        media = (nota1 + nota2 + nota3) / 3;

        System.out.println(
                media >= 7
                        ? "O " + nomeAluno + " foi aprovado com uma média de: " + media
                        : "O " + nomeAluno + " foi reprovado com uma média de: " + media);
        scanner.close();
    }
}
