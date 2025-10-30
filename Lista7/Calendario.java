import java.util.Scanner;

public class Calendario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mes;
        do {
        System.out.print("Entre com o número do mês: ");
        mes = sc.nextInt();
        } while (mes < 1 || mes > 12);

        int primeiroDia;
        do {
        System.out.print("Entre com o primeiro dia da semana: ");
        primeiroDia = sc.nextInt();
        } while (primeiroDia < 1 || primeiroDia > 7);

        int dias = 0;

        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> dias = 31;
            case 4, 6, 9, 11 -> dias = 30;
            case 2 -> dias = 28;
        }

        System.out.println("Dom Seg Ter Qua Qui Sex Sáb");

        for (int i = 1; i < primeiroDia; i++) {
            System.out.print("    ");
        }

        for (int i = 1; i <= dias; i++) {
            System.out.printf("%3d ", i);
            if ((i + primeiroDia - 1) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
        sc.close();
    }
}