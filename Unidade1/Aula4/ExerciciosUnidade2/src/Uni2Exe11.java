import java.util.Scanner;

public class Uni2Exe11 {
    public static void main(String[] args) {
        double valorA, valorB, valorC;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de A");
        valorA = sc.nextDouble();

        System.out.println("Digite o valor de B");
        valorB = sc.nextDouble();

        System.out.println("Digite o valor de C");
        valorC = sc.nextDouble();

        System.out.println("A area do triângulo retângulo é: " + calcAreaTrianguloRetangulo(valorA, valorC));

        System.out.println("A área do círculo é: "+ calcAreaCirculo(valorC));

        System.out.println("A área do trapézio é: " + calcAreaTrapezio(valorA, valorB, valorC));

        System.out.println("A área do quadrado é: " + calcAreaQuadrado(valorB));

        System.out.println("A área do Retângulo é: " + calcAreaDoRetangulo(valorA, valorB));

        sc.close();
    }

    /**
     * Teste de Mesa:
     * 
     * Teste: 1
     * Entradas:
     * Valor A: 5; ValorB: 10; Valor C: 15;
     * 
     * Saídas:
     * A area do triângulo retângulo é: 37.5
     * A área do círculo é: 706.85775       
     * A área do trapézio é: 112.5
     * A área do quadrado é: 100.0
     * A área do Retângulo é: 50.0
     * 
     * Teste: 2
     * Entradas:
     * Valor A: 10; ValorB: 15; Valor C: 20,5;
     * 
     * Saídas:
     * A area do triângulo retângulo é: 102.5
     * A área do círculo é: 1320.2531975
     * A área do trapézio é: 256.25
     * A área do quadrado é: 225.0
     * A área do Retângulo é: 150.0
     * 
     * Teste: 2
     * Entradas:
     * Valor A: 10,3; ValorB: 15,4; Valor C: 20,2;
     * 
     * Saídas:
     * A area do triângulo retângulo é: 104.03
     * A área do círculo é: 1281.8943835999999
     * A área do trapézio é: 259.57
     * A área do quadrado é: 237.16000000000003
     * A área do Retângulo é: 158.62
     * 
     */

    public static double calcAreaTrianguloRetangulo(double base, double altura) {
        double calculo = (base * altura) / 2f;

        return calculo;
    }

    public static double calcAreaCirculo(double raio) {
        double area = 3.14159 * Math.pow(raio, 2);
        return area;
    }

    public static double calcAreaTrapezio(double baseA, double baseB, double altura) {
        double area = ((baseA + baseB) * altura) / 2;

        return area;
    }

    public static double calcAreaQuadrado(double ladoDoQuadrado) 
    {
        double area  = Math.pow(ladoDoQuadrado, 2);

        return area;
    }

    public static double calcAreaDoRetangulo(double ladoA, double ladoB) {
        double area = ladoA * ladoB;
        
        return area;
    }
}
