/*
    Leia 2 notas de um aluno, calcule a média e informe o resultado de acordo
    com os seguintes critérios:
    Aprovado --> média >= 7
    Exame --> 5 >= média < 7
    Reprovado --> média < 5
 */
package exercicios;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota1, nota2, media;
        String resposta;

        // entrada
        System.out.println("Informe as notas do aluno:");
        nota1 = teclado.nextDouble();
        nota2 = teclado.nextDouble();

        // processamento
        media = (nota1 + nota2) / 2;

        if(media >= 7) {
            resposta = "Aprovado";
        } else {
            if(media >= 5) {
                resposta = "em Exame";
            } else {
                resposta = "Reprovado";
            }
        }

        //saída
        System.out.println("A média é: " + media);
        System.out.println("Resultado: " + resposta);

        teclado.close();
    }
}
