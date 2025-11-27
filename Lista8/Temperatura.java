import java.util.Scanner;

public class Temperatura{

    static double deCparaK(double celsius){
        double kelvin = celsius + 273.15;
        return kelvin;
    }

    static double deCparaF(double celsius){
        double far = 1.8 * celsius + 32; 
        return far;
    }

    static double deKparaC(double kelvin){
        double celsius = kelvin - 273.15;
        return celsius;
    }

    static double deFparaC(double far){
        double celsius = (far - 32) / 1.8;
        return celsius;
    }

    static double deKparaF(double kelvin){
        double far = deCparaF(deKparaC(kelvin));
        return far;
    }

    static double deFparaK(double far){
        double kelvin = deCparaK(deFparaC(far));
        return kelvin;
    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com uma temperatura: ");
        double temp = sc.nextDouble();

        System.out.print("Entre com a escala de origem (C, F ou K): ");
        char escalaOrigem = sc.next().charAt(0);

        System.out.print("Entre com escala de destino (C, F, ou K): ");
        char escalaDestino = sc.next().charAt(0);

        switch (escalaOrigem) {
            case 'C':
                if (escalaDestino == 'F'){
                    System.out.printf("Temperatura convertida: %.2f %n", deCparaF(temp));
                    break;
                } else {
                    System.out.printf("Temperatura convertida: %.2f %n", deCparaK(temp));
                    break;
                }
            case 'F': 
                if (escalaDestino == 'K'){
                    System.out.printf("Temperatura convertida: %.2f %n", deFparaK(temp));
                    break;
                } else {
                    System.out.printf("Temperatura convertida: %.2f %n", deFparaC(temp));
                    break;
                }
            case 'K':
                if (temp < 0) {
                    System.out.printf("Temperatura %.2f inválida para escala de origem Kelvin%n", temp);
                }
                if (escalaDestino == 'C'){
                    System.out.printf("Temperatura convertida: %.2f %n", deKparaC(temp));
                    break;
                } else {
                    System.out.printf("Temperatura convertida: %.2f %n", deKparaF(temp));
                    break;
                }
            default:
                System.out.println("Escala de origem não encontrada!");
                break;
        }
        sc.close();
    }
}
