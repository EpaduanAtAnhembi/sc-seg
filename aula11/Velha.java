import java.util.Scanner;

/**
 * Velha
 */
public class Velha {
    final static int TAM = 3;
    static int tabuleiro[][] = new int[TAM][TAM];
    static int jogador = 1;
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        while (!fimDeJogo()) {
            lerJogada();
            exibirTabuleiro();
            trocaJogador();
        }
        teclado.close();
    }

    static void exibirTabuleiro() {
        for (int i = 0; i < TAM; i++) {
            for (int j = 0; j < TAM; j++) {
                if (tabuleiro[i][j] == 1)
                    System.out.print("X ");
                else {
                    if (tabuleiro[i][j] == -1)
                        System.out.print("O ");
                    else {
                        System.out.print("- ");
                    }
                }
            }
            System.out.println();
        }
    }

    static void lerJogada() {
        int linha, coluna;
        boolean invalida = true;

        do {
            System.out.print("Digite a linha: ");
            linha = teclado.nextInt() - 1;
            System.out.print("Digite a coluna: ");
            coluna = teclado.nextInt() - 1;
            if (jogadaValida(linha, coluna)) {
                tabuleiro[linha][coluna] = jogador;
                invalida = false;
            } else {
                System.out.println("Posição inválida");
            }
        } while (invalida);

    }

    static boolean jogadaValida(int linha, int coluna) {
        return linha >= 0 && linha < 4 &&
                coluna >= 0 && coluna < 4 &&
                tabuleiro[linha][coluna] == 0;
    }

    static boolean fimDeJogo() {
        return false;
    }

    static boolean ganhou() {
        return true;
    }

    static void trocaJogador() {
        jogador *= -1;
    }

}