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
        // exemplo1_professor();
        // exemploRestoDivisao();
        // exemploExpoente();
        // exemploRaizQuadrada();
        // exemploDeArredondamento();
        // desafioCalculo();
    }

    public static void exemplo1_professor() {
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

    public static void exemploRestoDivisao() {
        /**
         * operador de resto de divisão %,
         * note também que quando o número é declarado com
         * double você não precisa colocar o 'f' após
         * inicializar a variável com um valor
         */
        double num1 = 17.5;
        double num2 = 5.0;

        double restoDivisao = num1 % num2;

        System.out.println("O valor restante é: " + restoDivisao);

        /**
         * você pode usar para checar se um número é par ou não
         */

        System.out.println(num1 % 2);
    }

    public static void exemploExpoente() {
        /**
         * a código a seguir é uma pegadinha por que o operador
         * ^ na verdade faz uma comparação de bits no java, para fazer
         * a exponenciação você deveria usar a biblioteca Math.pow
         */
        int base = 2;
        int expoente = 3;

        System.out.println("A base de: " + base + " Elevada a: " + expoente);
        System.out.println("Utilizando o operador ^, resulta: " + (base ^ expoente));

        System.out.println("Utilizando a biblioteca Math: " + Math.pow(base, expoente));
    }

    public static void exemploRaizQuadrada() {
        int numeroRaiz = 16;
        int numeroRaizCub = 27;
        System.out.println("A Raiz quadrada de " + numeroRaiz + " é: " + Math.sqrt(numeroRaiz));
        System.out.println("A Raiz cúbica de " + numeroRaizCub + " é: " + Math.sqrt(numeroRaizCub));
    }

    /**
     * O Cálculo exemplo é:
     * ((1/100) ^ 2 + 1 * (5/2)) / Pi
     */
    public static void exemploDeArredondamento() {
        double pi = Math.PI;

        System.out.println("Arredondamento para cima: " + Math.ceil(pi));
        System.out.println("Arredondamento para baixo: " + Math.floor(pi));
        System.out.println("Arredondar: " + Math.round(pi));

        System.out.println("Formatando o valor de PI: " + String.format("%.2f", pi));

        System.out.printf("Valor de pi formatado: %.2f%n", pi);
    }

    /**
     * O Cálculo exemplo é:
     * ((1/100) ^ 2 + 1 * (5/2)) / Pi
     */
    public static void desafioCalculo() {

        double calculo = ((Math.pow((1 / 100), 2) + 1) * (5/2)) / Math.PI;
        System.out.println("O cálculo resulta em: " + calculo);
    }

    public static void meuExemploCalculoDeMedia() {
        float nota1, nota2, nota3, media = 0.00f;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a Primeira nota");
        nota1 = scanner.nextFloat();

        System.out.println("Insira a Segunda nota");
        nota2 = scanner.nextFloat();

        System.out.println("Insira a Terceira nota");
        nota3 = scanner.nextFloat();

        media = (nota1 + nota2 + nota3) / 3;

        System.out.println(
                media >= 7
                        ? "O aluno foi aprovado com uma média de: " + media
                        : "O aluno foi reprovado com uma média de: " + media);
        scanner.close();
    }
}
