import java.util.Scanner;

public class Uni2Exe10 {
    public static void main(String[] args) {
        int tempoSegundos, hora, minutos, segundos, restoHora, restoMinutos;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tempo do evento:");
        tempoSegundos = sc.nextInt();
        hora = tempoSegundos / 3600;
        restoHora = tempoSegundos % 3600;

        System.out.println(restoHora);
        System.out.println(hora+":");

        sc.close();
    }
}
