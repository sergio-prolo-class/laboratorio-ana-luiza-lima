import java.util.Scanner;

public class Moeda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com a quantidade de centavos: ");
        int moedas = sc.nextInt();

        int resto = moedas % 50;
        System.out.printf("Moedas de 50 centavos: %d %n", moedas/=50);
        
        


    sc.close();    
    }
}
