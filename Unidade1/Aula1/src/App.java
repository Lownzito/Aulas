public class App {
    /**
     * ignorar, não faz parte da aula 1
     * 
     */
    public static String variavel = "10";
    public static String variavel2 = "10";

    public static void main(String[] args) throws Exception 
    {
        System.out.println("ola mundo");

        System.out.println("Teste");
        int valorA = 5;
        int valorB = 10;

        int resultado = valorA + valorB;

        System.out.println("Resultado é:" + resultado);

        /**
         * ignorar esse código, ele não faz parte da aula 1
         */
        variavel2 += variavel;
        System.out.println("A variavel tem um valor de:" + (variavel2));
    }
}