//refazendo o exercicio para estudar pra prova
import java.util.Scanner;

public class SomaMatrizes {

    static int melhorColuna(int[][] matriz){
        int indiceColuna = -1;
        int somaMaior = 0;

        for (int coluna = 0; coluna < matriz.length; coluna++){
            int somaAtual = 0;

            for (int linha = 0; linha < matriz.length; linha++){
                somaAtual += matriz[linha][coluna];
            }

            if (somaAtual > somaMaior) {
                indiceColuna = coluna;
            }
        }

        return indiceColuna;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o tamanho da matriz quadrada: ");
        int tamanho = sc.nextInt();

        int[][] matriz = new int[tamanho][tamanho];

        System.out.print("Entre com os valores da matriz: ");
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.printf("O índice da coluna com maior soma é: %d %n", melhorColuna(matriz));
        

        sc.close();
    }
}
