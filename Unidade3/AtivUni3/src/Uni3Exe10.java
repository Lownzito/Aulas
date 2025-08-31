import java.util.Scanner;

public class Uni3Exe10 {
    public static void main(String[] args) {
        float cateto1, cateto2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o cateto oposto: ");
        cateto1 = sc.nextFloat();

        System.out.println("Insira o adjacente: ");
        cateto2 = sc.nextFloat();

        System.out.println("A hipotenusa é: " + String.format("%,.2f", calcHipotenusa(cateto1, cateto2)));

        sc.close();
    }

    public static float calcHipotenusa(float cateto1, float cateto2) {
        return (float) Math.sqrt((cateto1 * cateto1) + (cateto2 * cateto2));
    }
}
