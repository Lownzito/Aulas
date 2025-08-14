import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        // exemploDoProfessor();
    }

    public static void exemploDoProfessor() {
        Scanner sc = new Scanner(System.in);
        double nota1, nota2, nota3;

        System.out.println("Digite o nome do usuário");
        String nome = sc.nextLine();

        System.out.println("Digite a primeira nota do aluno");
        nota1 = sc.nextDouble();

        System.out.println("Digite a segunda nota do aluno");
        nota2 = sc.nextDouble();

        System.out.println("Digite a terceira nota do aluno");
        nota3 = sc.nextDouble();

        double notaFinal = (nota1 + nota2 + nota3) / 3;

        System.out.println(
            notaFinal > 7 
            ? nome + "Foi aprovado com a média de: " + notaFinal 
            : nome + "Não foi aprovado com a média de: " + notaFinal
        );

        sc.close();
    }
}
