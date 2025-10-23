import java.util.Scanner;

public class Bhaskara {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o valor do ângulo em graus: ");
        double angulo = sc.nextDouble();

        double sen = 0;

        if (angulo > 180 && angulo < 360) {
            angulo = 360 - angulo;
            sen = (-1) * ((4*angulo)*(180 - angulo))/(40500-(angulo*(180-angulo)));
        } else {
            sen = ((4*angulo)*(180 - angulo))/(40500-(angulo*(180-angulo)));
        }

        double senReal = Math.sin(Math.toRadians(angulo));

        System.out.printf("Valor aproximado do seno: %.4f %n", sen);

        System.out.printf("Valor real do seno: %.4f %n", senReal);

        sc.close();
    }
}