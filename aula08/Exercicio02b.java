import java.util.Scanner;

public class Exercicio02b {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int NUM_ALUNOS = 3;
        double nota1, nota2, mediaAluno, mediaSala = 0;

        for (int i = 1; i <= NUM_ALUNOS; i++) {
            do {
                System.out.println("Informe a primeira nota do " + i + "º aluno:");
                nota1 = entrada.nextDouble();
            } while (nota1 < 0 || nota1 > 10);
            do {
                System.out.println("Informe a segunda nota do " + i + "º aluno:");
                nota2 = entrada.nextDouble();
            } while (nota2 < 0 || nota2 > 10);

            mediaAluno = (nota1 + nota2) / 2;
            System.out.println("Média aluno: " + mediaAluno);
            mediaSala = mediaSala + mediaAluno;

        }
        System.out.println("Média sala = " + mediaSala / NUM_ALUNOS);

        entrada.close();
    }
}
