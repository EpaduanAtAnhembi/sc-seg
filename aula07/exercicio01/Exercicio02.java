package exercicio01;

import java.util.Random;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String enter;
        int dado1, dado2, soma;
        Random random = new Random();
        boolean naoTerminou = true;

        while (naoTerminou) {
            System.out.println("tecle ENTER para jogar os dados:");
            entrada.nextLine();
            dado1 = random.nextInt(6) + 1;
            dado2 = random.nextInt(6) + 1;
            System.out.printf("Dados: %d e %d\n", dado1, dado2);
            soma = dado1 + dado2;

            if (soma == 7 || soma == 11) {
                System.out.println("Você ganhou!");
                naoTerminou = false;
            } else {
                if (soma == 2 || soma == 3 || soma == 12) {
                    System.out.println("Você perdeu!");
                    naoTerminou = false;
                } else {
                    int objetivo = soma;
                    while(naoTerminou) {
                        System.out.println("tecle ENTER para jogar os dados:");
                        entrada.nextLine();
                        dado1 = random.nextInt(6) + 1;
                        dado2 = random.nextInt(6) + 1;
                        soma = dado1 + dado2;
                        if(soma == objetivo) {
                            System.out.printf("Você ganhou: %d e %d\n", dado1, dado2);
                            naoTerminou = false;
                        } else {

                        }
                    }
                }
            }
        }

        entrada.close();
    }
}
