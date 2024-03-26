package exercicios;

import java.util.Scanner;

public class Exercicio01B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        String resposta;
        boolean ehPar;

        // entrada de dados
        System.out.println("Informe o número inteiro:");
        numero = scanner.nextInt();

        // processamento
        ehPar = (numero % 2 == 0);
        resposta =  (ehPar)? "par" : "impar";

        // saída
        System.out.println("O número é " + resposta);
        scanner.close();
    }
}
