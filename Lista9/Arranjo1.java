package Lista9;

import java.util.Scanner;

public class Arranjo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Digite um número inteiro positivo: ");
            numero = sc.nextInt();
            if (numero < 1 || numero > 999999999) {
                System.out.println("Erro: O número deve estar entre 1 e 999999999");
            }
        } while (numero < 1 || numero > 999999999);

        int[] contagem = new int[10];

        while (numero > 0) {
            int digito = numero % 10; 
            contagem[digito]++;     
            numero = numero / 10;       
        }

        System.out.println("Quantidade de cada dígito:");

        for (int i = 0; i < contagem.length; i++) {
            if (contagem[i] > 0) {
                String vezes = (contagem[i] == 1) ? "vez" : "vezes";
                System.out.println(i + ": " + contagem[i] + " " + vezes);
            }
        }



        sc.close();
    }
}
