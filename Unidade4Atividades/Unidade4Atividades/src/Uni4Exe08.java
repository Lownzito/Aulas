import java.util.Scanner;

public class Uni4Exe08 {
    Scanner sc = new Scanner(System.in);

    public Uni4Exe08() {
        execApp();
    }

    public static void main(String[] args) {
        new Uni4Exe08();
    }

    private void execApp() {
        getInput();
    }
    
    private void getInput()
    {
        System.out.println("Informe a letra: ");
        letra = sc.next();
    }
}
