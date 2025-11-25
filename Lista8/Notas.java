import java.util.Scanner;

public class Notas {
    static double menorDeTres(double a, double b, double c) {
        double min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        return min;
    }

    static double calcularMediaDosMaiores(double x1, double x2, double x3) {
        return (x1 + x2 + x3 - menorDeTres(x1, x2, x3)) / 2;
    }

    static double calcularMediaFinal(double p, double t) {
        return 0.8 * p + 0.2 * t;
    }

    static boolean numValido(double x){
        if (x < 0 || x > 10) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alunos;

        do {
            System.out.print("Entre com o número de alunos: ");
            alunos = sc.nextInt();
        } while (alunos < 1);

        for (int i=1; i <= alunos; i++){
            System.out.printf("Entre com as notas das provas do aluno %d %n", i);
            for (int j=1; j<=3; j++){
                System.out.printf("Nota %d: ", j);
                double nota = sc.nextDouble();
                if (!numValido(nota)){
                    System.out.println("Nota inválida! Digite uma nota entre 0 e 10.");
                    j--; 
                }
            }
            double mediaProvas = calcularMediaDosMaiores(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

            System.out.printf("Entre com as notas das provas do aluno %d: ", i);
            double mediaTrabalhos = calcularMediaDosMaiores(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

            double mediaFinal = calcularMediaFinal(mediaProvas, mediaTrabalhos);
            System.out.printf("Média final do aluno %2.f: %n", mediaFinal);
        }

        sc.close();

    }
}
