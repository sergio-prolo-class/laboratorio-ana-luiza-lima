import java.util.Scanner;

public class MatrizQuadrada {

    public static int obterIndiceMelhorColuna(int[][] mat) {
        int n = mat.length;
        
        long maiorSomaEncontrada = Long.MIN_VALUE; 
        int indiceMelhorColuna = -1;

        for (int coluna = 0; coluna < n; coluna++) {
            
            long somaAtual = 0;
            
            for (int linha = 0; linha < n; linha++) {
                somaAtual += mat[linha][coluna];
            }

            if (somaAtual > maiorSomaEncontrada) {
                maiorSomaEncontrada = somaAtual;
                indiceMelhorColuna = coluna;
            }
        }

        return indiceMelhorColuna;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com o tamanho da matriz quadrada: ");
        int n = scanner.nextInt();

        int[][] matriz = new int[n][n];

        System.out.println("Entre com os valores:");
        for (int linha = 0; linha < n; linha++) {
            for (int coluna = 0; coluna < n; coluna++) {

                matriz[linha][coluna] = scanner.nextInt();
            }
        }

        int indiceColuna = obterIndiceMelhorColuna(matriz);

        System.out.println("O índice da coluna com maior soma é: " + indiceColuna);
        
        scanner.close();
    }
}