import java.util.Scanner;

public class Uni4Exe06 {
    Scanner sc = new Scanner(System.in);

    char sex;

    public Uni4Exe06() {
        execApp();
    }

    public static void main(String[] args) {
        new Uni4Exe06();
    }

    private void execApp() {
        getInput();
    }

    private void getInput() {
        System.out.println("Insira o seu sexo: ");
        System.out.println("M - para masculino ");
        System.out.println("F - para feminino ");
        System.out.println("I - desejo não informar ");

        sex = sc.next().toUpperCase().charAt(0);

        runSelectedOption();
    }

    private void runSelectedOption() {
        switch (sex) {
            case 'M':
                outputMessage("Masculino");
                break;
            case 'F':
                outputMessage("Feminino");
                break;
            case 'I':
                outputMessage("Não Informado");
                break;
            default:
                outputMessage("Opção invalida");
                getInput();
                break;
        }
    }

    private void outputMessage(String sex) {
        System.out.println(sex);
    }
}
