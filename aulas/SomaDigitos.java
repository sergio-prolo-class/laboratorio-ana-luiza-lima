import java.util.Scanner;

public class SomaDigitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com um inteiro não-negativo: ");
        int numero = sc.nextInt();
        int resto;
        int soma = 0;

        while (numero > 0) {
            resto = numero % 10;
            numero /= 10;
            soma += resto;
        }

        System.out.printf("Soma dos dígitos: %d %n", soma);

        sc.close();
    }
}