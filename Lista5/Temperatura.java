import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Temperatura em graus Fahrenheit: ");
        float fahr = sc.nextFloat();

        double celsius = (fahr - 32) * (5/9.0);

        System.out.printf("A temperatura em Celsius é: %f %n", celsius);

        sc.close();
    }
}