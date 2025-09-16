import java.util.Scanner;

public class Uni4Exe02 {
    Scanner sc = new Scanner(System.in);
    int value;

    private Uni4Exe02() {
        execApp();
    }

    public static void main(String[] args) {
        new Uni4Exe02();
    }

    private void execApp() {
        getInput();

        evenOrOdd();
    }

    private void getInput() {
        System.out.println("Entre um valor inteiro maior que 0: ");
        value = sc.nextInt();

        validateInput();
    }

    private void validateInput() {
        if (value <= 0) {
            getInput();
        }
    }

    private void evenOrOdd() {
        if (value % 2 == 0) {
            System.out.println("O Número é par");
        } else {
            System.out.println("O Número é ímpar");
        }
    }
}
