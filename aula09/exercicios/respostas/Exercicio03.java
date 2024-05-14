package respostas;

// Ler as notas de 5 alunos, calcular a média e mostrar as notas que estão acima da média calculada

import java.util.Scanner;

class Exercicio03 {
    public static void main(String[] args) {
        final int QTDE_ALUNOS = 5;
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[QTDE_ALUNOS];
        double media = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Digite a nota do º%d aluno: ",(i+1));
            notas[i] = sc.nextDouble();
            media += notas[i];
        }
        sc.close();

        media /= QTDE_ALUNOS;
        
        System.out.printf("Notas acima da média %.2f\n", media);
        for (int i = 0; i < notas.length; i++) {
            if(notas[i] > media) {
                System.out.println(notas[i]);
            }
        }
    }

}