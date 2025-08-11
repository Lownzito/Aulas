import java.util.Scanner;

public class App {

    /**
     * notas do professor:
     * nessa atividade se deve usar float, motivo:
     * float é 32 bits e o double é 64 bits, float
     * ocupa menos memoria e double ocupa menos
     * se for usar float use somente float no seu código,
     * o mesmo se aplica para double.
     *
    */

    /**
     * para rodar um código diferente comente a função e escola qual você preferir
     */
    public static void main(String[] args) throws Exception {
        // meuExemploCalculoDeMedia();
        exemplo1_professor();

    }

    public static void exemplo1_professor()
    {
        /**
         * teste com esses valores
         * n1:9 n2:9 n3:9;
         * n1:9 n2:4 n3:5;
         * n1:8 n2:9 n3:7;
         * n1:7.34 n2:8.12 n3:7.26;
         */
        float nota1 = 9;
        float nota2 = 9;
        float nota3 = 9;

        float media = (nota1 + nota2 + nota3);

        System.out.println("A média é: " + media);
    }

    public static void meuExemploCalculoDeMedia()
    {
        float nota1, nota2, nota3, media = 0.00f;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a Primeira nota");
        nota1 = Float.parseFloat(scanner.nextLine());

        System.out.println("Insira a Segunda nota");
        nota2 = Float.parseFloat(scanner.nextLine());

        System.out.println("Insira a Terceira nota");
        nota3 = Float.parseFloat(scanner.nextLine());

        media = (nota1 + nota2 + nota3) / 3;

        System.out.println(
                media >= 7
                        ? "O aluno foi aprovado com uma média de: " + media
                        : "O aluno foi reprovado com uma média de: " + media);
    }
}
