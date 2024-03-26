package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        String resposta;

        // entrada de dados
        System.out.println("Informe o número inteiro:");
        numero = scanner.nextInt();

        // processamento
        if(numero % 2 == 0) {
            resposta = "par";
        } else {
            resposta = "impar";
        }

        // saída
        System.out.println("O número é " + resposta);
        scanner.close();
    }
}
