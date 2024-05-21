package respostas;

// Gerar um vetor com 10 números inteiros aleatórios e contar quantos são pares.

import java.util.Random;

class Exercicio02 {
    public static void main(String[] args) {
        final int QTDE_NUMEROS = 10;
        final int MAIOR_INT = 100;
        Random random = new Random();
        int[] numeros = new int[QTDE_NUMEROS];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(MAIOR_INT);
        }

        int pares = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                pares++;
            }
        }

        System.out.println("Números sorteados:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println("\nPares: "+ pares);
    }
}