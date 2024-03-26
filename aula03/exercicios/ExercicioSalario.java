package exercicios;

import java.util.Scanner;

public class ExercicioSalario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salarioAtual, novoSalario;

        System.out.print("Informe o salário atual: ");
        salarioAtual = entrada.nextDouble();

        novoSalario = salarioAtual * 1.25;

        System.out.println("Novo salário: " + novoSalario);

        entrada.close();
    }
}
