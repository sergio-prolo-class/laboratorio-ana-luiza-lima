import java.util.Scanner;

public class Floyd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o número de linhas: ");
        int linhas = sc.nextInt();
        int num = 1;

        for (int i = 1; i <= linhas; i++){
            for (int j = i; j < (i*2); j++){
                System.out.printf(" %d ", num);
                num += 1;
            }
            System.out.println("");
        }


        sc.close();
    }
}