package respostas;

// Um usuario quer saber se um dado está viciado.
// Escreva um programa que simule o lançamento de um dado 100 vezes (ramdom)
// Conte quantas vezes cada lado foi sorteado e exiba essas quantidades na tela

import java.util.Random;

class Exercicio04 {
    public static void main(String[] args) {
        final int LADOS = 6;
        final int SORTEIOS = 100;
        int[] lados = new int[LADOS];
        Random random = new Random(LADOS);

        for (int i = 0; i < SORTEIOS; i++) {
            int sorteio = random.nextInt(LADOS);
            lados[sorteio]++;
        }

        for (int i = 0; i < LADOS; i++) {
            System.out.printf("lado %d sorteado %d vez(es)\n", i+1, lados[i]);
        }
    }
}