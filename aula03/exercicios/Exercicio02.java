package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota1, nota2, media;

        // Entrada de dados
        System.out.println("Digite a primeira nota:");
        nota1 = teclado.nextDouble();

        System.out.println("Digite a sgunda nota:");
        nota2 = teclado.nextDouble();

        // processamento
        media = (nota1 + nota2) / 2;

        // saída
        System.out.println("Sua média é: " + media);
        teclado.close();
    }
}
