import java.util.Scanner;

public class CalcFurb {
    Scanner sc = new Scanner(System.in);

    double numero1, numero2;
    int opcao;

    public CalcFurb() {

        inputValues();

        sc.close();
    }

    public static void main(String[] args) {
        new CalcFurb();
    }

    private void inputValues() {
        System.out.println("Bem vindo ao Calc Furb!!");

        System.out.println("Agora informe dois números");
        System.out.println("Informe o primeiro número: ");
        numero1 = sc.nextDouble();

        System.out.println("Informe o segundo número: ");
        numero2 = sc.nextDouble();

        selectOption();
    }

    private void selectOption() {
        System.out.println("Agora selecione uma opção");
        System.out.println("Se for selecionado errado, será somado.");
        System.out.println("1 - Somar");

        System.out.println("2 - Subtrair");

        System.out.println("3 - Multiplicar");

        System.out.println("4 - Dividir");

        opcao = sc.nextInt();

        runSelectedOption();
    }

    private void runSelectedOption() {
        switch (opcao) {
            case 1:
                somar();
                break;
            case 2:
                subtrair();
                break;
            case 3:
                multiplicar();
                break;
            case 4:
                dividir();
                break;
            default:
                System.out.println("Opção inválida, selecione uma das opções disponiveis: ");
                selectOption();
                break;
        }

        shouldContinue();
    }

    private void shouldContinue() {
        System.out.println("Você gostaria de continuar?");

        System.out.println("Sim - 1");
        System.out.println("Não - 2");

        int shouldContinue = sc.nextInt();

        if (shouldContinue == 1) 
        {
            inputValues();
        } else {
            System.out.println("Tchau, tenha um bom dia!");
            sc.close();
        }
    }

    private void printResult(double result) {
        System.out.println("O resultado foi: " + result);
    }

    private void somar() {
        printResult((numero1 + numero2));
    }

    private void subtrair() {
        printResult((numero1 - numero2));
    }

    private void multiplicar() {
        printResult((numero1 * numero2));
    }

    private void dividir() {
        if (numero2 > 0) {
            printResult((numero1 / numero2));
        } else {
            printResult(0);
        }
    }

}
