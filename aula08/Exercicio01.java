import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        // 1. ler números
        // 2. ler 10 números
        // 3. separar pares e ímpares
        // 4. somar e calcular a média dos pares
        // 5. contar e calcular a porcentagem dos ímpares
        
        Scanner teclado = new Scanner(System.in);
        int numero;
        int somaPares = 0, contaPares = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite um valor inteiro:");
            numero = teclado.nextInt();
            boolean ehPar = numero % 2 == 0;
            if(ehPar) {
                somaPares = somaPares + numero;
                contaPares++;
            } 
        }

        System.out.println("Média dos pares: " + ((double)somaPares / contaPares));
        System.out.println("Impares: " + (10.0 - contaPares) / 10 * 100 + "%");

        teclado.close();
    }
}
