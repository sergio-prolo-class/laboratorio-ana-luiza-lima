import java.util.Scanner;

public class RPG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com a classe (1-arqueiro, 2-bárbaro, 3-druida, 4-mago): ");
        int classe = sc.nextInt();

        System.out.print("Entre com a vitalidade desejada: ");
        int vitalidade = sc.nextInt();

        int incremento = 0;
        int vitalidadeInicial = 0;
        int nível = 0;

        switch (classe) {
            case 1 -> { 
                incremento = 10; 
                vitalidadeInicial = 150;
            }
            case 2 -> {
                incremento = 15;
                vitalidadeInicial = 200;
            }
            case 3 -> {
                incremento = 5;
                vitalidadeInicial = 100;
            }
            case 4 -> {
                incremento = 4;
                vitalidadeInicial = 80;
            }
            default -> {
                System.out.println("Classe inválida");
                sc.close();
                return;
            }
        }

        while (vitalidadeInicial < vitalidade) {
            if (nível % 5 == 0 && nível != 0) {
                vitalidadeInicial += (2 * incremento);
            } else {
                vitalidadeInicial += incremento;
            }
            nível++;
            System.out.printf("Nível: %d, Vitalidade: %d%n", nível, vitalidadeInicial); //Debug - Classe 4 - Vitalidade 5000
        }

        System.out.printf("Nível necessário: %d%n", nível);
        sc.close();
    }
}