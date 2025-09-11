import java.util.Scanner;

public class DidaDaSemana {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o dia da semana");

        System.out.println("DIGITE O DIA DA SEMANA");

        String diaDaSemana = sc.nextLine().toUpperCase();
        int diaEnumerado;
        switch (diaDaSemana) {
            case "DOMINGO":
                diaEnumerado = 0;
                break;
            case "SEGUNDA-FEIRA":
                diaEnumerado = 1;
                break;
            case "TERÇA-FEIRA":
                diaEnumerado = 2;
                break;
            case "QUARTA-FEIRA":
                diaEnumerado = 3;
                break;
            case "QUINTA-FEIRA":
                diaEnumerado = 4;
                break;
            case "SEXTA-FEIRA":
                diaEnumerado = 5;
                break;
            case "SÁBADO":
                diaEnumerado = 6;
                break;
            default:
                diaEnumerado = 99999;
                break;
        }
        System.out.println("O dia da semana enumerado é:" + diaEnumerado);

        sc.close();
    }
}
