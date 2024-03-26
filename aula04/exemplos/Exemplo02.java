package exemplos;

public class Exemplo02 {
    public static void main(String[] args) {
        //Operador ternário
        int numero = 7;
        int resposta;

        // se o número for > 5, multiplique por 10, senão multiplique por 2
        resposta = (numero > 5)? numero * 10 : numero * 2;

        System.out.println("Resposta: " + resposta);
    }
}
