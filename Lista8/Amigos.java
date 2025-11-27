import java.util.Scanner;

public class Amigos {

    static int somaDivisores(int a){
        int soma = 0;
        for (int i = 1; i < a; i ++) {
            if (a % i == 0){
                soma+=i;
            }
        }
        return soma;
    }

    static boolean saoAmigos(int a, int b) {
        int divisoresA = somaDivisores(a);
        int divisoresB = somaDivisores(b);

        if (divisoresA == b && divisoresB == a){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

            System.out.print("Entre com dois números inteiros: ");
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (saoAmigos(a, b) == true) {
                System.out.printf("Os números são amigos :D %n");
            } else {
                System.out.printf("Os números não são amigos D: %n");
            }
       
        sc.close();
    }

}
