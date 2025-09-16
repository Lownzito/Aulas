import java.util.Scanner;

public class Uni4Exe07 {

    Scanner sc = new Scanner(System.in);

    int weight, exceedWeight;
    float aditionalQt, toPay = 0.45f;

    public Uni4Exe07() {
        execApp();
    }

    public static void main(String[] args) {
        new Uni4Exe07();
    }

    private void execApp() {
        getInput();

        calculatePrice();

        printResult();
    }

    private void getInput() {
        System.out.println("Insira o peso da carta: ");
        weight = sc.nextInt();
    }

    private void calculatePrice() {
        if (weight > 50) {
            exceedWeight = weight - 50;

            aditionalQt = (exceedWeight / 20f) + 1;
            toPay = 0.45f + 0.45f * aditionalQt;
        }
    }

    private void printResult() {
        System.out.println("Custo do selo: " + toPay);
    }
}
