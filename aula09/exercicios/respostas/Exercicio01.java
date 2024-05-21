package respostas;

// Exibir os números em ordem inversa da digitação

import java.util.Scanner;

class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeros[] = new int[5];

        // length = tamanho do vetor
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º número:");
            numeros[i] = entrada.nextInt();
        }
        System.out.println("Números digitados ao contrário:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

        entrada.close();
    }
}