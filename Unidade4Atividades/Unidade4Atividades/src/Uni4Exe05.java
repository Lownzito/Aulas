import java.util.Scanner;

public class Uni4Exe05 {
    Scanner sc = new Scanner(System.in);

    boolean answer;

    public Uni4Exe05() {
        execApp();
    }

    public static void main(String[] args) {
        new Uni4Exe05();
    }

    private void execApp() {
        getInput();

        returnAnswer();
    }

    private void getInput() {
        System.out.println("A cor é azul?");
        answer = sc.nextBoolean();
    }

    private void returnAnswer() {
        System.out.println(answer ? "Sim" : "Não");
    }

}
