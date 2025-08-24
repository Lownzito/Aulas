import java.util.Scanner;

public class Uni2Exe17 {
    public static void main(String[] args) {
        double salarioHora = 10.00, salarioFamilia = 60,
                salarioTrabalho, salarioBruto, salarioLiquido;
        String nome;
        int dependentes, horasTrabalhadas;

        Scanner sc = new Scanner(System.in);

        System.out.println("Nome do funcionário: ");
        nome = sc.nextLine();

        System.out.println("Horas Trabalhadas: ");
        horasTrabalhadas = sc.nextInt();

        System.out.println("Número de dependentes: ");
        dependentes = sc.nextInt();

        salarioTrabalho = horasTrabalhadas * salarioHora;
        salarioFamilia = dependentes * salarioFamilia;

        salarioBruto = salarioTrabalho + salarioFamilia;
        salarioLiquido = salarioBruto - ((salarioTrabalho * 0.085) + (salarioTrabalho * 0.05));

        System.out.println("O funcionário: " + nome + " terá este mês de salário bruto: R$" + salarioBruto
                + " e de salário liquido: R$ " + salarioLiquido);

        sc.close();

        /**
         * Fonte de Mesa:
         * 
         * Teste 1:
         * Entradas:
         * Nome: Jim Raynor; Horas Trabalhadas: 33; Dependentes: 5;
         * 
         * Saída:
         * O funcionário: Jim Raynor terá este mês de salário bruto: R$630.0 e de salário liquido: R$ 585.45
         * 
         * Teste 2:
         * Entradas:
         * Nome: Sarah Kerrigan; Horas Trabalhadas: 197; Dependentes: 2;
         * 
         * Saída:
         * O funcionário: Sarah Kerrigan terá este mês de salário bruto: R$2090.0 e de salário liquido: R$ 1824.05
         * 
         * Teste 3:
         * Entradas:
         * Nome: Arcturus Mengsk; Horas Trabalhadas: 210; Dependentes: 4;
         * 
         * Saída:
         * O funcionário: Arcturus Mengsk terá este mês de salário bruto: R$2340.0 e de salário liquido: R$ 2056.5
         */
    }
}
