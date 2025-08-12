public class Desafio {
    /*
     * 
     */
    public static void main(String[] args) 
    {
        /**
         * o calculo funciona desta forma, mas se estiver de dificil leitura, siga a segunda forma
         */
        //primeira forma
        double calculo = ((Math.pow((1 / 100), 2) + 1) * (5/2)) / Math.PI;
        System.out.println("O cálculo resulta em: " + calculo);

        //segunda forma
        double parte1,parte2,parte3,parte4,parte5,parte6;
        parte1 = 1/100;
        parte2 = Math.pow(parte1, 2);
        parte3 = parte2+1;
        parte4 = 5/2;
        parte5 = parte3 * parte4;
        parte6 = parte5 / Math.PI;

        System.out.println("De forma extensa, o cálculo fica: "+parte6);

    }
}
