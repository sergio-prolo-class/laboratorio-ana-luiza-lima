import java.util.Scanner;

public class Senha {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int senha;
        int SENHA_CORRETA = 314159;
        int tentativas = 3;

        do {
            System.out.print("Entre com a senha: ");
            senha = sc.nextInt();
            if (senha != SENHA_CORRETA){
                System.out.println("Acesso negado (senha incorreta)");
            } else {
                System.out.println("Acesso autorizado");
                break;
            }

            tentativas -= 1;

            if (tentativas == 0){
                System.out.println("Sistema bloqueado");
                break;
            }

        } while (senha != SENHA_CORRETA);

        sc.close();
}
}
