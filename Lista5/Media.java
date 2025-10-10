import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite as notas do aluno: ");
        double notas = sc.nextDouble();
        notas += sc.nextDouble();
        notas += sc.nextDouble();
        notas += sc.nextDouble();

        System.out.print("Digite a presença do aluno: ");
        int freq = sc.nextInt();

        System.out.printf("Média: %.2f - %s %n", notas / 4, (freq > 75 && (notas/4) >= 6) ? "Aprovado" : "Reprovado");

    sc.close();
    }
}