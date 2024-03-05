package exemplos;

import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int idade;
        String nome;
        
        System.out.println("Digite sua idade:");
        idade = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Digite seu nome:");
        nome = teclado.nextLine();



        System.out.println("Seu nome é " + nome);
        System.out.println("Sua idade é " + idade);

        teclado.close();
    }
}
