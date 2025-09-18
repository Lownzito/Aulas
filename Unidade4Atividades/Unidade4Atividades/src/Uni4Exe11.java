import java.util.Scanner;

public class Uni4Exe11 {
    Scanner sc = new Scanner(System.in);
    int age1, age2, age3;

    private Uni4Exe11() {
        execApp();
    }

    public static void main(String[] args) {
        new Uni4Exe11();
    }

    private void execApp() {
        getInputs();

        checkForTwins();
    }

    private void getInputs() {
        System.out.println("Digite a idade do primeiro filho");
        age1 = sc.nextInt();

        System.out.println("Digite a idade do segundo filho");
        age2 = sc.nextInt();

        System.out.println("Digite a idade do terceiro filho");
        age3 = sc.nextInt();
    }

    private void checkForTwins() {
        if (age1 == age2 && age1 == age3) {
            System.out.println("TRIGÊMEOS");
        } else if (age1 == age2 || age1 == age3 || age2 == age3) {
            System.out.println("GÊMEOS");
        } else {
            System.out.println("APENAS IRMÃOS");
        }
    }
}
