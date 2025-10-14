import java.util.Scanner;

public class Aritmetica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double resultado;

        System.out.print("Entre com um número real: ");
        double n1 = sc.nextDouble();

        System.out.print("Entre com o operador: ");
        char c = sc.next().charAt(0);

        System.out.print("Entre com outro número real: ");
        double n2 = sc.nextDouble();

        switch (c) {
            case '+' -> {
                resultado = n1 + n2;
                System.out.printf("Resultado: %.2f\n", resultado);
            }
            case '-' -> {
                resultado = n1 - n2;
                System.out.printf("Resultado: %.2f\n", resultado);
            }
            case '*' -> {
                resultado = n1 * n2;
                System.out.printf("Resultado: %.2f\n", resultado);
            }
            case '/' -> {
                if (n2 == 0.0) {
                    System.out.println("Número não pode ser dividido por zero");
                    sc.close();
                    return;
                } else {
                    resultado = n1 / n2;
                    System.out.printf("Resultado: %.2f\n", resultado);
                }
            }
            default -> {
                System.out.println("Operação inválida!");
                sc.close();
                return;
            }
            
        }
        sc.close();
    }
}