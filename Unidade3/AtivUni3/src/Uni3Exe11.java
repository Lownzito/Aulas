import java.util.Scanner;

public class Uni3Exe11 {
    public static void main(String[] args) {
        float temperatura;

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a temperatura:");
        temperatura = sc.nextFloat();

        System.out.println(String.format("%,.2f", celsiusToFahrenheit(temperatura)));

        sc.close();
    }

    public static float celsiusToFahrenheit(float celsius) {
        return ((9.0f / 5.0f) * celsius) + 32;
    }
}
