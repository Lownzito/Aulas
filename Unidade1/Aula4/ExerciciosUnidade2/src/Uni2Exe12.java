import java.util.Scanner;

public class Uni2Exe12 {
    public static void main(String[] args) {
        double x1, x2, y1, y2, calculo;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o x do primeiro ponto no plano:");
        x1 = sc.nextDouble();
        
        System.out.println("Digite o y do primeiro ponto no plano:");
        y1 = sc.nextDouble();

        System.out.println("Digite o x do segundo ponto no plano:");
        x2 = sc.nextDouble();

        System.out.println("Digite o y do segundo ponto no plano:");
        y2 = sc.nextDouble();

        calculo = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);

        calculo = Math.sqrt(calculo);

        System.out.println("A distância entre os dois pontos é de: " + String.format("%,.4f", calculo));

        sc.close();
    }
}
