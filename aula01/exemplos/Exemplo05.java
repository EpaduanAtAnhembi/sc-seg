package exemplos;

import java.util.Scanner;

public class Exemplo05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int idade;
        String nome;
        
        System.out.println("Digite sua idade:");
        idade = teclado.nextInt();
        System.out.println();


        System.out.println("Sua idade é " + idade);

        teclado.close();
    }
}
