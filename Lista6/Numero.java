import java.util.Scanner;

public class Numero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com um número inteiro de 1 a 99: ");
        int num = sc.nextInt();

        int unidade = num % 10;
        int dezena = (num-(num % 10)/10);

        String palavra_unidade = "um";
        String palavra_dezena = "vinte";
        String palavra_numero = "dez";

        switch (num) {
            case 11 -> palavra_numero = "doze";
            case 12 -> palavra_numero = "doze";
            case 13 -> palavra_numero = "treze";
            case 14 -> palavra_numero = "quatorze";
            case 15 -> palavra_numero = "quinze";
            case 16 -> palavra_numero = "dezesseis";
            case 17 -> palavra_numero = "dezessete";
            case 18 -> palavra_numero = "dezoito";
            case 19 -> palavra_numero = "dezenove";
        }

        switch (unidade) {
            case 2 -> palavra_unidade = "dois";
            case 3 -> palavra_unidade = "três";
            case 4 -> palavra_unidade = "quatro";
            case 5 -> palavra_unidade = "cinco";
            case 6 -> palavra_unidade = "seis";
            case 7 -> palavra_unidade = "sete";
            case 8 -> palavra_unidade = "oito";
            case 9 -> palavra_unidade = "nove";
        }

        switch (dezena) {
            case 3 -> palavra_unidade = "trinta";
            case 4 -> palavra_unidade = "quarenta";
            case 5 -> palavra_unidade = "cinquenta";
            case 6 -> palavra_unidade = "sessenta";
            case 7 -> palavra_unidade = "setenta";
            case 8 -> palavra_unidade = "oitenta";
            case 9 -> palavra_unidade = "noventa";
        }

        if (num < 10) {
            System.out.printf("Número por extenso: %s %n", palavra_unidade);
        }




        sc.close();
    }
}