import java.util.Scanner;

public class DesvioPadrao {
    public static double media(int[] vals) {
        double soma = 0;
        for (int valor : vals) {
            soma += valor;
        }
        return soma / vals.length;
    }

    public static double desvioPadrao(int[] vals) {
        double mediaDosValores = media(vals);
        double somaDasDiferencasQuadradas = 0;
        int n = vals.length;
        for (int valor : vals) {
            double diferenca = valor - mediaDosValores;
            somaDasDiferencasQuadradas += Math.pow(diferenca, 2);
        }
        double variancia = somaDasDiferencasQuadradas / (n - 1);
        return Math.sqrt(variancia);
    }

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o tamanho do arranjo: ");
        int tamanho = sc.nextInt();

        int[] arranjo = new int[tamanho];

        System.out.print("Entre com os valores do arranjo: ");
        for (int i = 0; i < arranjo.length; i++) {
            arranjo[i] = sc.nextInt();
        }

        double resultado = desvioPadrao(arranjo);

        System.out.printf("O desvio padrão é %.4f%n", resultado);

        sc.close();

    }
}