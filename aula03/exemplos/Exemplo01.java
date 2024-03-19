package exemplos;

import java.util.Scanner;

public class Exemplo01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.println("Digite um valor inteiro:");
        numero = teclado.nextInt();
        System.out.println("Você digitou " + numero);

        teclado.close();
    }
}