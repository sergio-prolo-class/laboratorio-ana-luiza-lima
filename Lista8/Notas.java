import java.util.Scanner;

public class Notas {

    static double menorDeTres(double a, double b, double c) {
        double min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        return min;
    }

    static double calcularMediaDosMaiores(double x1, double x2, double x3) {
        return (x1 + x2 + x3 - menorDeTres(x1, x2, x3)) / 2;
    }

    static double calcularMediaFinal(double p, double t) {
        return 0.8 * p + 0.2 * t;
    }

    static boolean numValido(double x) {
        return (x >= 0 && x <= 10);
    }

    static double lerNotaValida(Scanner sc, int indice) {
        double nota;
        do {
            System.out.printf("Nota %d: ", indice);
            nota = sc.nextDouble();
            if (!numValido(nota)) {
                System.out.println("Nota inválida! Digite uma nota entre 0 e 10."); // 
            }
        } while (!numValido(nota)); 
        return nota;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alunos;
        double somaMediasTurma = 0; 

        do {
            System.out.print("Entre com o número de alunos: ");
            alunos = sc.nextInt();
        } while (alunos < 1);


        for (int i = 1; i <= alunos; i++) {

            
            System.out.printf("Entre com as notas das provas do aluno %d %n", i);


            double p1 = lerNotaValida(sc, 1);
            double p2 = lerNotaValida(sc, 2);
            double p3 = lerNotaValida(sc, 3);
            
            double mediaProvas = calcularMediaDosMaiores(p1, p2, p3);

            System.out.printf("Entre com as notas dos trabalhos do aluno %d %n", i);
            double t1 = lerNotaValida(sc, 1);
            double t2 = lerNotaValida(sc, 2);
            double t3 = lerNotaValida(sc, 3);

            double mediaTrabalhos = calcularMediaDosMaiores(t1, t2, t3);

            double mediaFinal = calcularMediaFinal(mediaProvas, mediaTrabalhos);
            System.out.printf("Média final do aluno %d: %.2f %n", i, mediaFinal);

            somaMediasTurma += mediaFinal;
        }

        double mediaDaDisciplina = somaMediasTurma / alunos;

        System.out.printf("Média da disciplina: %.2f %n", mediaDaDisciplina);

        sc.close();
    }
}