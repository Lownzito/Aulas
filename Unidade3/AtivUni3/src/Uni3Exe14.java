import java.util.Scanner;

public class Uni3Exe14 {
    public static void main(String[] args) {
        float distancia, tempo;

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a distancia da viagem");
        distancia = sc.nextFloat();

        System.out.println("Insira o tempo da viagem");
        tempo = sc.nextFloat();

        System.out.println("A velocidade média foi de " + String.format("%,.2f", velocidadeMedia(distancia, tempo))
                + "km/h e a quantidade de combustível usado foi " + String.format("%,.2f", consumoCombustivel(distancia))
                + " litros.");
        sc.close();
    }

    private static float velocidadeMedia(float distancia, float tempo) {
        return distancia / tempo;
    }

    private static float consumoCombustivel(float distancia) {
        return distancia / 12.0f;
    }

}
