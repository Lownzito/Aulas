import java.util.Scanner;

public class Uni3Exe09 {
    public static void main(String[] args) {
        float raio, altura;

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o raio: ");
        raio = sc.nextFloat();

        System.out.println("Insira o altura: ");
        altura = sc.nextFloat();

        System.out.println("O volume da lata de óleo é: " + String.format("%,.2f" , calcVolume(raio, altura)));

        sc.close();
    }

    private static float calcVolume(float raio, float altura) {
        float volume = 3.14159f * (raio * raio) * altura;

        return volume;
    }
}
