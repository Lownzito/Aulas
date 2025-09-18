import java.util.Scanner;

public class Uni4Exe09 {
    Scanner sc = new Scanner(System.in);
    int number1, number2;
    char character;

    private Uni4Exe09() {
        execApp();
    }

    public static void main(String[] args) {
        new Uni4Exe09();
    }

    private void execApp() {
        getInputs();
    };

    private void getInputs() {
        System.out.println("Insira o primeiro número:");
        number1 = sc.nextInt();

        System.out.println("Insira o segundo número:");
        number2 = sc.nextInt();

        checkIfAreMultiple();
    }

    private void checkIfAreMultiple() {
        if (number1 % number2 == 0 && number2 % number1 == 0) {
            System.out.println("Os valores são múltiplos.");
        } else {
            System.out.println("Os valores não são múltiplos.");
        }

    }
}
