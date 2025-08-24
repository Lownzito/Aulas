import java.util.Scanner;

public class Uni2Exe06 {
    public static void main(String[] args) {
        int numeroFuncionario;
        /**
         * horas trabalhadas e valorHora deve ser double não por seu valor ser grande mas sim pq 
         * o valor do calculo do salário será e ele será um double, para não necessitar
         * de cast ou qualquer outra mandinga.
         * Horas trabalhadas também não será um integer para ser um cálculo preciso
         */
        double horasTrabalhadas, salario, valorHora;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o digito identificador do funcionário:");
        numeroFuncionario = sc.nextInt();

        System.out.println("Digite o número de horas trabalhadas:");
        horasTrabalhadas = sc.nextDouble();

        System.out.println("Digite o valor da hora deste funcionário:");
        valorHora = sc.nextDouble();

        salario = horasTrabalhadas * valorHora;

        System.out.println("O funcionário com o digito: "+ numeroFuncionario + " teve um salário de: " + String.format("%,.2f", salario));

        sc.close();

        /**
         * Teste de Mesa:
         * 
         * Teste 1:
         * Entradas:
         * NumeroFuncionario: 1; Horas Trabalhadas: 2; ValorHora: 3,50;
         * 
         * Saída:
         * O funcionário com o digito: 1 teve um salário de: 7,00
         * 
         * Teste 2:
         * Entradas:
         * NumeroFuncionario: 2; Horas Trabalhadas: 4; ValorHora: 7;
         * 
         * Saída:
         * O funcionário com o digito: 2 teve um salário de: 28,00
         * 
         * Teste 1:
         * Entradas:
         * NumeroFuncionario: 3; Horas Trabalhadas: 8; ValorHora: 14;
         * 
         * Saída:
         * O funcionário com o digito: 3 teve um salário de: 112,00
         */
    }
}
