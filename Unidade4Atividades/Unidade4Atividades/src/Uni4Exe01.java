import java.util.Scanner;

public class Uni4Exe01 {
    Scanner sc = new Scanner(System.in);

    double workedHours, hourlySalary, salary, extraSalary = 0.0, extraHours, hourlySalaryExraHours, finalSalary;

    private Uni4Exe01() {
        execApp();
    }

    public static void main(String[] args) throws Exception {
        new Uni4Exe01();
    }

    private void execApp() {

        getInputs();

        calculateSalary();

        printSalary();
    }

    private void getInputs() {
        System.out.println("Insira as horas trabalhadas no mês");
        workedHours = sc.nextDouble();

        System.out.println("Valor pago hora");
        hourlySalary = sc.nextDouble();
    }

    private void calculateSalary() {

        if (workedHours > 160) {
            extraSalary = (workedHours - 160) * (hourlySalary / 2);
        }

        salary = workedHours * hourlySalary;

        finalSalary = salary + extraSalary;
    }

    private void printSalary() {
        System.out.println("Salário : " + salary);
        System.out.println("Salário Extra: " + extraSalary);
        System.out.println("Salário Total: " + finalSalary);
    }
}
