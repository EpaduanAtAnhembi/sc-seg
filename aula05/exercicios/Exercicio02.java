package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota1, nota2, nota3, exame, media;
        int faltas;
        String resposta;

        // entrada
        System.out.println("Informe as notas do aluno:");
        nota1 = teclado.nextDouble();
        nota2 = teclado.nextDouble();
        nota3 = teclado.nextDouble();

        System.out.println("Informe o número de faltas:");
        faltas = teclado.nextInt();

        // processamento

        if (faltas >= 16) {
            System.out.println("Reprovado por falta");
        } else {
            media = (nota1 + nota2 + nota3) / 3;

            if (media >= 6) {
                resposta = "Aprovado";
            } else {
                System.out.println("Qual a nota do exame?");
                exame = teclado.nextDouble();

                media = (media + exame) / 2;

                if (media >= 5) {
                    resposta = "aprova em Exame";
                } else {
                    resposta = "Reprovado";
                }
            }
            // saída
            System.out.println("A média é: " + media);
            System.out.println("Resultado: " + resposta);
        }

        teclado.close();
    }
}
