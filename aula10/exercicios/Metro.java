package exercicios;

import java.util.Scanner;

public class Metro {
    public static void main(String[] args) {
        final int QTDE_VAGOES = 5;
        int[] composicao = new int[QTDE_VAGOES];
        Scanner entrada = new Scanner(System.in);

        // entrada de dados
        for (int i = 0; i < composicao.length; i++) {
            System.out.println("Digite a quantidade de pessoas do vagão " + (i + 1));
            do {
                System.out.println("A quantidade precisa ser > 0 e < 251:");
                composicao[i] = entrada.nextInt();
            } while (composicao[i] < 0 || composicao[i] > 250);
        }

        // entrada de dados
        // for (int i = 0; i < composicao.length;) {
        // System.out.println("Digite a quantidade de pessoas do vagão " + (i + 1));
        // System.out.println("A quantidade precisa ser > 0 e < 251:");
        // composicao[i] = entrada.nextInt();
        // if (composicao[i] > 0 && composicao[i] < 251) {
        // i++;
        // }
        // }

        for (int i = 0; i < composicao.length; i++) {
            if (composicao[i] < 51) {
                System.out.println("AZUL - baixa ocupação");
            } else {
                if (composicao[i] < 101) {
                    System.out.println("AMARELA - média ocupação");
                } else {
                    if (composicao[i] < 151) {
                        System.out.println("LARANJA - alta ocupação");
                    } else {
                        System.out.println("VERMELHA - lotado");
                    }
                }
            }
        }

        entrada.close();
    }
}
