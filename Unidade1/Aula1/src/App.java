public class App {
    public static String variavel = "10";
    public static String variavel2 = "10";

    public static void main(String[] args) throws Exception 
    {
        variavel2 += variavel;
        System.out.println("A variavel tem um valor de:" + (variavel2));
    }
}