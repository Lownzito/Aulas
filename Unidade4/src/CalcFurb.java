import java.util.Scanner;

public class CalcFurb {
    public CalcFurb() {
        double numero1, numero2, calc;
        int opcao;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo ao Calc Furb!!");

        System.out.println("Agora informe dois números");
        System.out.println("Informe o primeiro número: ");
        numero1 = sc.nextDouble();

        System.out.println("Informe o segundo número: ");
        numero2 = sc.nextDouble();

        System.out.println("Agora selecione uma opção");
        System.out.println("Se for selecionado errado, será somado.");
        System.out.println("1 - Somar");

        System.out.println("2 - Subtrair");

        System.out.println("3 - Multiplicar");

        System.out.println("4 - Dividir");

        opcao = sc.nextInt();

        runSelectedOption(opcao, numero1, numero2);

        sc.close();

    }

    public static void main(String[] args) {
        new CalcFurb();
    }

    public static void runSelectedOption(int opcao, double numero1, double numero2) {
        switch (opcao) {
            case 1:
                System.out.println("O resultado da soma foi: " + (numero1 + numero2));
                break;
            case 2:
                System.out.println("O resultado da subtração foi: " + (numero1 - numero2));
                break;
            case 3:
                System.out.println("O resultado da multiplicação foi: " + (numero1 * numero2));
                break;
            case 4:
                System.out.println("O resultado da divisão foi: " + (numero1 / numero2));
                break;
            default:
                System.out.println("O resultado da soma foi: " + (numero1 + numero2));
                break;
        }
    }
}
