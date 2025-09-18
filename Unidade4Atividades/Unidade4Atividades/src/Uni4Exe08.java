import java.util.Scanner;

public class Uni4Exe08 {
    Scanner sc = new Scanner(System.in);
    char character;

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
        character = sc.next().toLowerCase().charAt(0);
    
        checkIfIsVogal();
    }

    private void checkIfIsVogal() 
    {
        if(character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' )
        {
            System.out.println("É vogal");
        }
        else {
            System.out.println("Não é vogal");
        }
    }
}
