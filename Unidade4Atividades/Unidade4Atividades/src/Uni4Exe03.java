import java.util.Scanner;

public class Uni4Exe03 {
    Scanner sc = new Scanner(System.in);

    int value1, value2;

    private Uni4Exe03() {
        execApp();

    }

    public static void main(String[] args) {
        new Uni4Exe03();
    }

    private void execApp() {
        getInputs();

        compareValues();
    }

    private void getInputs() {
        System.out.println("Insira o primeiro número: ");
        value1 = sc.nextInt();

        System.out.println("Insira o segundo número: ");
        value2 = sc.nextInt();
    }

    private void compareValues() {
        if (value1 > value2) {
            printResult(value1, value2);
        } else {
            printResult(value2, value1);
        }
    }

    private void printResult(int highest, int lowest) {
        System.out.println("O valor " + highest + " é maior do que o valor " + lowest);
    }
}
