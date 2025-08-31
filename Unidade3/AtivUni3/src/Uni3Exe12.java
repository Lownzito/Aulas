import java.util.Scanner;

public class Uni3Exe12 {
    public static void main(String[] args) {
        float horasTrabalhadas;
        int numeroDependentes;
        String nome;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do empregado");
        nome = sc.next();

        System.out.println("Horas Trabalhadas");
        horasTrabalhadas = sc.nextFloat();

        System.out.println("Número de dependentes");
        numeroDependentes = sc.nextInt();

        float salarioTrabalho = calcSalarioTrabalho(horasTrabalhadas);

        float salarioFamilia = calcSalarioFamilia(numeroDependentes);

        float salarioBruto = calcSalarioBruto(salarioTrabalho, salarioFamilia);

        float salarioLiquido = calcSalarioLiquido(salarioBruto, salarioTrabalho);

        System.out.println(
                "O funcionário " + nome + " possui um salário bruto de R$ " + String.format("%,.2f", salarioBruto)
                        + " e um salário líquido de R$" + String.format("%,.2f", salarioLiquido));

        sc.close();
    }

    private static float calcSalarioTrabalho(float horasTrabalhadas) {
        return horasTrabalhadas * 10.0f;
    }

    private static float calcSalarioFamilia(int dependentes) {
        return 60.0f * (float) dependentes;
    }

    private static float calcSalarioBruto(float salarioTrabalho, float salarioFamilia) {
        return salarioFamilia + salarioTrabalho;
    }

    private static float calcSalarioLiquido(float salarioBruto, float salarioTrabalho) {
        return salarioBruto - ((salarioTrabalho * 0.085f) + (salarioTrabalho * 0.05f));
    }

}
