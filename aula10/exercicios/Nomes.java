package exercicios;

import java.util.Scanner;

public class Nomes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] nomes = { "Carlos", "Maria", "Luiz", "Beto" };
        String procurado;
        boolean achou = false;

        System.out.println("Qual o nome?");
        procurado = entrada.nextLine();

        for (int i = 0; i < nomes.length; i++) {
            if (procurado.equals(nomes[i])) {
                achou = true;
            }
        }

        if (achou) {
            System.out.println("Achei");
        } else {
            System.out.println("Não achei");
        }
        entrada.close();

    }
}
