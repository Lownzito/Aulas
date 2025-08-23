import java.util.Scanner;

public class Uni2Exe17 {
    public static void main(String[] args) {
        double salarioHora = 10.00, salarioFamilia = 60,
                salarioTrabalho, salarioBruto, salarioLiquido;
        String nome;
        int dependentes, horasTrabalhadas;

        Scanner sc = new Scanner(System.in);

        System.out.println("Nome do funcionário: ");
        nome = sc.next();

        System.out.println("Horas Trabalhadas: ");
        horasTrabalhadas = sc.nextInt();

        System.out.println("Número de dependentes: ");
        dependentes = sc.nextInt();

        salarioTrabalho = horasTrabalhadas * salarioHora;
        salarioFamilia = dependentes * salarioFamilia;

        salarioBruto = salarioTrabalho + salarioFamilia;
        salarioLiquido = salarioBruto - ((salarioTrabalho * 0.085) + (salarioTrabalho * 0.05));

        System.out.println("O funcionário" + nome + " terá este mês de salário bruto: R$" + salarioBruto
                + " e de salário liquido: R$ " + salarioLiquido);

        sc.close();
    }
}
