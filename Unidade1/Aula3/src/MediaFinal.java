import java.util.Scanner;

public class MediaFinal {
    public static void main(String[] args) {
        double prova1, prova2, projetoFinal, nota1, nota2, nota3, nota4, nota5, nota6, mediaAritmetica, notaFinal;
        String nome;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o Nome do aluno");
        nome = sc.nextLine();

        System.out.println("Insira a nota da primeira Prova");
        prova1 = sc.nextDouble();

        System.out.println("Insira a nota da segunda Prova");
        prova2 = sc.nextDouble();

        System.out.println("Insira a nota do Projeto Final");
        projetoFinal = sc.nextDouble();

        System.out.println("Insira a primeira nota de Exercício ou Trabalho Parcial");
        nota1 = sc.nextDouble();

        System.out.println("Insira a segunda nota de Exercício ou Trabalho Parcial");
        nota2 = sc.nextDouble();

        System.out.println("Insira a terceira nota de Exercício ou Trabalho Parcial");
        nota3 = sc.nextDouble();

        System.out.println("Insira a quarta nota de Exercício ou Trabalho Parcial");
        nota4 = sc.nextDouble();

        System.out.println("Insira a quinta nota de Exercício ou Trabalho Parcial");
        nota5 = sc.nextDouble();

        System.out.println("Insira a sexta nota de Exercício ou Trabalho Parcial");
        nota6 = sc.nextDouble();

        mediaAritmetica = (nota1 + nota2 + nota3 + nota4 + nota5 + nota6) / 6;

        notaFinal = (prova1 * 0.2) + (prova2 * 0.3) + (projetoFinal * 0.3) + (mediaAritmetica * 0.2);

        System.out.format(
                notaFinal >= 7
                        ? "O Aluno: " + nome + " Foi Aprovado com a média de: %2." + notaFinal
                        : "O Aluno: " + nome + " Foi Reprovado com a média de: " + notaFinal);

        sc.close();

    }
}
