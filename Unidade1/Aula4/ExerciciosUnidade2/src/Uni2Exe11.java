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
