import java.util.Scanner;

public class Uni2Exe10 {
    public static void main(String[] args) {
        int tempoOperacao, horas, minutos, segundos;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tempo do evento:");
        tempoOperacao = sc.nextInt();
        
        //usando % converte para minutos, o resto seria os segundos
        segundos = tempoOperacao % 60;
        
        //converte para minutos o tempo da operação
        minutos = tempoOperacao / 60;

        //após os segundos serem convertidos para minutos, converta para hora
        horas = minutos / 60;

        //depois para pegar os minutos exatos da operação faça pegue o restante que então equivalem aos minutos
        minutos =  minutos % 60;

        System.out.println(horas+":"+minutos+":"+segundos);

        sc.close();

        /**
         * Teste de Mesa:
         * 
         * Teste 1:
         * 
         * Entrada: 
         * Tempo de Operação: 4770;
         * Saída:
         * 1:19:30
         * 
         * Teste 2:
         * 
         * Entrada:
         * Tempo de Operação: 49870 
         * Saída:
         * 13:51:10
         * 
         * Teste 3:
         * 
         * Entrada:
         * Tempo de Operação: 5387000 
         * Saída:
         * 1496:23:20
         */
    }
    
}
