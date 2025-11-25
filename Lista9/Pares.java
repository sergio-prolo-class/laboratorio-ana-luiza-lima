import java.util.Scanner;

public class Pares {
    public static int contaPares(int[] valores) {
        int quantidadePares = 0;
        for (int valor : valores) {
            if (valor % 2 == 0) {
                quantidadePares++;
            }
        }
        return quantidadePares;
    }

    public static int comparaArranjos(int[] primeiroArranjo, int[] segundoArranjo) {
        int paresPrimeiro = contaPares(primeiroArranjo);
        int paresSegundo = contaPares(segundoArranjo);

        if (paresPrimeiro == paresSegundo) {
            return 0; 
        } else if (paresPrimeiro > paresSegundo) {
            return -1; 
        } else {
            return 1;
        }
    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Entre com o tamanho dos arranjos: ");
        int tamanho = sc.nextInt();

        int[] arranjo1 = new int[tamanho];
        int[] arranjo2 = new int[tamanho];

        System.out.print("Entre com os valores do primeiro: ");
        for (int i = 0; i < tamanho; i++) {
            arranjo1[i] = sc.nextInt();
        }

        System.out.print("Entre com os valores do segundo: ");
        for (int i = 0; i < tamanho; i++) {
            arranjo2[i] = sc.nextInt();
        }

        int resultado = comparaArranjos(arranjo1, arranjo2);

        if (resultado == -1) {
            System.out.println("O primeiro arranjo possui mais pares");
        } else if (resultado == 1) {
            System.out.println("O segundo arranjo possui mais pares");
        } else {
            System.out.println("Os arranjos possuem o mesmo número de pares");
        }

        sc.close();
    }
}