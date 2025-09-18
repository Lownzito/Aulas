import java.util.Scanner;

public class Uni4Exe12 {
    Scanner sc = new Scanner(System.in);
    int side1, side2, side3;

    private Uni4Exe12() {
        execApp();
    }

    public static void main(String[] args) {
        new Uni4Exe12();
    }

    private void execApp() {
        getInputs();

        checkTriangleType();
    }

    private void getInputs() {
        System.out.println("Entre com o comprimento do lado 1: ");
        side1 = sc.nextInt();

        System.out.println("Entre com o comprimento do lado 2: ");
        side2 = sc.nextInt();

        System.out.println("Entre com o comprimento do lado 3: ");
        side3 = sc.nextInt();
    }

    private void checkTriangleType() {
        if (side1 < (side2 + side3) && side2 < (side1 + side3) && side3 < (side2 + side1)) {
            
            if (side1 == side2 && side1 == side3) {
                System.out.println("É Equilátero");
            } else if (side1 == side2 || side2 == side3 || side1 == side3) {
                System.out.println("É isósceles");
            } else {
                System.out.println("É Escaleno");
            }

        } else {
            System.out.println("Não formam um triângulo");
        }
    }
}
