package exercicio01;

import java.util.Random;
import java.util.Scanner;

/**
 * Jogo - advinhar número
 */
public class Exercicio01 {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner teclado = new Scanner(System.in);
        int limite = 10;
        int tentativa = 1;
        int limiteTentativas = 4;
        int secreto;
        int numero;
        boolean acertou = false;
        boolean continuar = true;

        while (continuar) {
            secreto = random.nextInt(limite);
            acertou = false;
            System.out.printf("Tente acertar o valor secreto (1 à %d):\n", limite);
            tentativa = 1;

            while (!acertou && tentativa <= limiteTentativas) {
                System.out.printf("Digite o valor: (tentativa %d/%d)\n", tentativa, limiteTentativas);
                numero = teclado.nextInt();
                if (numero == secreto) {
                    System.out.println("Acertou!");
                    acertou = true;
                }
                if (!acertou && tentativa < limiteTentativas) {
                    if (numero < secreto) {
                        System.out.println("Dica: o número é maior");
                    } else {
                        System.out.println("Dica: o número é menor");
                    }
                }
                tentativa++;
            }
            if (acertou) {
                limite += 10;
                limiteTentativas += 2;
            } else {
                continuar = false;
                System.out.println("Fim de jogo. O número era: " + secreto);
            }
        }
        teclado.close();
    }
}