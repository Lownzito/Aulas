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
    }
}
