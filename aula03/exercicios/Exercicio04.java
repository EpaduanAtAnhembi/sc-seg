package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
        double nota1, nota2, media;

        System.out.println("Digite a primeira nota:");
        nota1 = teclado.nextDouble();

        System.out.println("Digite a sgunda nota:");
        nota2 = teclado.nextDouble();

        media = (nota1 + nota2) / 2;

        System.out.println("Sua média é: " + media);

        if(media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        teclado.close();
    }
}
