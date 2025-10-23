import java.util.Scanner;

public class Corretora {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o valor negociado: ");
        double transacao = sc.nextDouble();
        double comissao;

        if (transacao < 2500) {
            comissao = 30 + (transacao * 1.7) / 100;
        } else if (transacao < 6250) {
            comissao = 56 + (transacao * 0.66) / 100;
        } else if (transacao < 20000) {
            comissao = 76 + (transacao * 0.34) / 100;
        } else if (transacao < 50000) {
            comissao = 100 + (transacao * 0.22) / 100;
        } else if (transacao < 500000) {
            comissao = 155 + (transacao * 0.11) / 100;
        } else {
            comissao = 255 + (transacao * 0.09) / 100;
        }

        System.out.printf("Taxa de corretagem: %.2f %n", (comissao < 39.0) ? 39.0 : comissao);

        sc.close();

    }
}