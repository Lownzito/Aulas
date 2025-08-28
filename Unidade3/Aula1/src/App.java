// import java.text.DecimalFormat;

public class App {
    public static void main(String[] args) throws Exception {
        // int c = soma(2, 3);
        // double areaTriangulo = calculoAreaTriangulo(5, 6);

        // DecimalFormat df = new DecimalFormat("0.00");
        // System.out.println("Decimal Formatado " + df.format(19.023));

        // df = new DecimalFormat("#,##0.00");

        // System.out.println(c);

        Aluno alunoClass = new Aluno();

        alunoClass.setNumeroMatricula(99234);

        alunoClass.cadastrarAluno(99234, 'F', "Arthas Melithal", true);

        System.out.println(alunoClass);
    }

    /**
     * Calcula a área do triangulo
     * 
     * @param base
     * @param altura
     * @return area do triangulo
     */
    public static double calculoAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    public static int soma(int a, int b) {
        return a + b;
    }
}
