import java.util.Scanner;

public class Uni4Exe10 {
    Scanner sc = new Scanner(System.in);
    int[] agesArray = { 0, 0, 0 };
    int youngestKey;
    String[] sonsNames = { "Marquinhos", "Zezinho", "Luluzinha" };

    /**
     * 0 marquinhos,
     * 1 zezinho,
     * 2 luluzinha.
     */
    private Uni4Exe10() {
        execApp();
    }

    public static void main(String[] args) {
        new Uni4Exe10();
    }

    private void execApp() {
        getInputs();

        getYoungestSon();

        printYoungest();
    };

    private void getInputs() {
        System.out.println("Insira a idade de Marquinhos: ");
        agesArray[0] = sc.nextInt();

        System.out.println("Insira a idade de Zezinho: ");
        agesArray[1] = sc.nextInt();

        System.out.println("Insira a idade de Luluzinha: ");
        agesArray[2] = sc.nextInt();
        System.out.println(agesArray[0]);
    }

    private void getYoungestSon() {
        int youngest = agesArray[0];

        for (int i = 0; i <= agesArray.length - 1; i++) {
            if (youngest > agesArray[i]) {
                youngest = agesArray[i];
                youngestKey = i;
            }
        }
    }

    private void printYoungest() {
        System.out.println("O " + sonsNames[youngestKey] + " é o caçula.");
    }
}
