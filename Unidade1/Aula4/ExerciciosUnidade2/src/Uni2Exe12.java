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

    /**
     * Testes de Mesa
     * 
     * Teste 1:
     * Entradas:
     * x1: 5; y1: 10; x2: 20; y2: 25;
     * 
     * Saída:
     * A distância entre os dois pontos é de: 21,2132
     * 
     * Teste 2:
     * Entradas:
     * x1: 10; y1: 15; x2: 5,4; y2: 3,3;
     * 
     * Saída:
     * A distância entre os dois pontos é de: 12,5718
     * 
     * Teste 3:
     * Entradas:
     * x1: 5,3; y1: 3,2; x2: 5,4; y2: 3,3;
     * 
     * Saída:
     * A distância entre os dois pontos é de: 0,1414
     * 
     */
}
