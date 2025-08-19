import java.util.Scanner;

public class Uni2Exe04 {
    public static void main(String[] args) {
        float notaA, notaB, media;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a notaA");
        notaA = sc.nextFloat();

        System.out.println("Digite a notaB");
        notaB = sc.nextFloat();

        media = (notaA * 3.5f) + (notaB * 7.5f);
        
        System.out.println("Média final foi: " + media/11);

        sc.close();
    }
}
