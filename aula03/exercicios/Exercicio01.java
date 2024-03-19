package exercicios;

import java.util.Scanner;

/* 
 * Leia um nome e apresente na tela "Boa noite Nome"
 * dica: nextLine()
*/
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;

        System.out.print("Digite seu nome: ");
        nome = teclado.nextLine();

        System.out.println("Boa noite " + nome);

        teclado.close();
    }
}
