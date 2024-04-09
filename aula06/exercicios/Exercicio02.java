package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero, cont;

        System.out.println("Qual a tabuada?");
        numero = scanner.nextInt();

        cont = 0;
        while (cont < 11) {
            // System.out.println(numero + " x " + cont + " = " + (numero * cont));
            System.out.printf("%2d x %2d = %2d\n",  numero, cont,(numero * cont));
            cont++;
        }

        scanner.close();
    }
}
