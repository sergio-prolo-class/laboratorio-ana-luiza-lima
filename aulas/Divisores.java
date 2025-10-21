import java.util.Scanner;

public class Divisores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com um inteiro positivo: ");
        int numero = sc.nextInt();
        int resto;
        int cont = 0;

        System.out.print("Divisores: [ ");

        for (int i = numero; i > 1; i--){
            resto = numero % i; 
            if (resto == 0){
                System.out.printf(" %d ,", i);
                cont +=1;
            }
        }

        System.out.println(" 1 ]");

        if (cont > 1) {
            System.out.println("Não é primo");
        } else {
            System.out.println("É primo");
        }

        sc.close();
    }
}