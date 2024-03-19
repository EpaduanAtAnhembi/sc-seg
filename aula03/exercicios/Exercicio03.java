package exercicios;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int idade;

        System.out.println("Digite sua idade: ");
        idade = teclado.nextInt();

        if(idade >= 18) {
            System.out.println("Voê pode dirigir");
        } else {
            System.out.println("Vá de carona");
        }

        teclado.close();
    }
}