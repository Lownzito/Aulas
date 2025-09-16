import java.util.Scanner;

public class Uni4Exe04 {
    Scanner sc = new Scanner(System.in);

    float input, remaining;

    int integerValue;

    public Uni4Exe04() {
        execApp();
    }

    public static void main(String[] args) {
        new Uni4Exe04();
    }

    private void execApp() {
        getInput();

        isFloat();
    }

    private void getInput() {
        System.out.println("Insira o valor: ");
        input = sc.nextFloat();
    }

    private void isFloat() {
        integerValue = (int) input;

        remaining = input - integerValue;

        if(remaining <= 0) 
        {
            System.out.println("Casas decimais não foram digitadas");
        }
        else {
            System.out.println("Casas decimais foram digitadas");
        }
    }

}
