import java.util.Scanner;

public class Remuneracao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o total de vendas (R$) : ");
        double vendas = sc.nextDouble();

        System.out.print("Entre com a avaliação de desempenho (1-10): ");
        int desempenho = sc.nextInt();

        double salario = 0;

        if (vendas >= 10000) {
            salario = 2000 + (vendas * 0.07);
        } else {
            salario = 2000 + (vendas * 0.05);
        }

        System.out.printf("Remuneração: R$ %.2f%n", (desempenho >= 8) ? salario + 500 : salario);
        
        sc.close();
    }
}