import java.util.Scanner;

public class Uni3Uri04 {
    public static void main(String[] args) {
        float nota1, nota2, media;
        Scanner sc = new Scanner(System.in);

        nota1 = sc.nextFloat();
        nota2 = sc.nextFloat();

        media = ((nota1 * 3.5f) + (nota2 * 7.5f)) / 11.0f;

        System.out.println("MEDIA = " + String.format("%,.5f", media));

        sc.close();
    }
}
