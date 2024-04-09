package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cont, limite;

        System.out.println("Informe o valor limite: ");
        limite = scanner.nextInt();

        if(limite < 1 || limite > 100) {
            System.out.println("Valor inválido");
        } else {
            cont = 1;
            while( cont <= limite ) {
                System.out.print(cont + " ");
                cont++;
            }
        }

/*      
        Solução alternativa:
        
        if(limite > 0 && limite < 101) {
            cont = 1;
            while( cont <= limite ) {
                System.out.print(cont + " ");
                cont++;
            }
        } else {
            System.out.println("Valor inválido");
        } */

       

        scanner.close();
    }
}
