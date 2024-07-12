// ExemploWhile.java
import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {
    public static void main (String [] args) {
        double mesada = 50.0;
        double precoDoce = 0;

        while (mesada > 0) {
            precoDoce = valorAleatorio();
            if (precoDoce > mesada)
                precoDoce = mesada;

            mesada -= precoDoce;
            System.out.println("Doce de R$ " + precoDoce + " foi adicionado ao carrinho.");
        }

        System.out.println("Mesada:" + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");


    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
