package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valor1, valor2, resposta = 0;
        char operacao;
        boolean sucesso = true;

        // entrada de dados
        System.out.print("digite o primeiro número: ");
        valor1 = scanner.nextDouble();
        System.out.print("digite o segundo número: ");
        valor2 = scanner.nextDouble();

        scanner.nextLine(); // Limpa o ENTER do teclado

        System.out.print("digite a operação(+ - * /): ");
        // pega o primeiro caracter do texto
        operacao = scanner.nextLine().charAt(0);

        // processamento
        switch (operacao) {
            case '+':
                resposta = valor1 + valor2;
                break;
            case '-':
                resposta = valor1 - valor2;
                break;
            case '*':
                resposta = valor1 * valor2;
                break;
            case '/':
                if (valor2 != 0) {
                    resposta = valor1 / valor2;
                } else {
                    System.out.println("Divisão por zero");
                    sucesso = false;
                }
                break;

            default:
                System.out.println("Operador inválido");
                sucesso = false;
                break;
        }

        // saída
        if (sucesso) {
            System.out.println(valor1 + " " + operacao + " " + valor2 + " = " + resposta);
        }

        scanner.close();
    }
}
