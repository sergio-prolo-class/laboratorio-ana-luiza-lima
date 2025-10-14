import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a altura: ");
        double altura = sc.nextDouble();

        System.out.print("Digite o peso: ");
        double peso = sc.nextDouble();

        if (altura < 0 || peso < 0) {
            System.out.println("Altura ou peso inválidos");
            sc.close();
            return;
        }

        double imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc < 24.9) {
            System.out.println("Peso normal");
        } else if (imc < 29.9) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidade");
        }

        sc.close();
    }
}