package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int chavesEncontradas, pontos;

        System.out.println("Informe o total de pontos:");
        pontos = teclado.nextInt();
        System.out.println("Informe quantas chaves encontradas:");
        chavesEncontradas = teclado.nextInt();

        if( (pontos >= 1000) && (chavesEncontradas >= 3) ) {
            System.out.println("Você passou para a fase 2");
        } else {
            System.out.println("Você não passou de fase");
        }

        teclado.close();
    }
}
