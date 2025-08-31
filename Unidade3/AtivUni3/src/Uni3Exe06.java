import java.util.Scanner;

public class Uni3Exe06 {
    public static void main(String[] args) {
        float pesoPrato;

        Scanner sc = new Scanner(System.in);

        System.out.println("Peso do prato montado");
        pesoPrato = sc.nextFloat() - 0.75f;

        System.out.println("O valor do prato do cliente é R$ " + String.format("%,.2f" , 25.00f * pesoPrato));
        
        sc.close();
    }
}
