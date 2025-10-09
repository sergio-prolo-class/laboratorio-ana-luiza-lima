import java.util.Scanner;

public class Paralelepipedo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com a altura (m): ");
        float altura = sc.nextFloat();

        System.out.print("Entre com a largura (m): ");
        float largura = sc.nextFloat();

        System.out.print("Entre com a profundidade (m): ");
        float profundidade = sc.nextFloat();

        float area = 2 * ((largura * altura) + (altura * profundidade) + (largura * profundidade));

        float volume = largura * altura * profundidade;

        System.out.printf("Área: %.3f | Volume: %.3f %n", area, volume);

        System.out.print("Entre com a quantidade produzida: ");
        int quantidade = sc.nextInt();

        System.out.print("Entre com o custo por m2: ");
        float custo = sc.nextFloat();

        float valor = custo * (quantidade * area);

        System.out.printf("Custo total da Produção: %.2f %n", valor);

        sc.close();
    }
}