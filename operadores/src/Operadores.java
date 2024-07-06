public class Operadores {
    public static void main (String [] args) {
        // String nomeCompleto = "LINGUAGEM" + "JAVA";

        // System.out.println(nomeCompleto);

        // String concatenacao = "?";

        // System.out.println(concatenacao);

        // concatenacao = 1+1+1+"1";

        // System.out.println(concatenacao);

        // concatenacao = 1+"1"+1+1;

        // System.out.println(concatenacao);

        // concatenacao = 1+"1"+1+"1";

        // System.out.println(concatenacao);

        // concatenacao = "1"+1+1+1;

        // System.out.println(concatenacao);

        // concatenacao = "1"+(1+1+1);

        // System.out.println(concatenacao);

        // int numero = 5;

        // numero = -numero;

        // System.out.println(numero);

        // numero = -numero;

        // System.out.println(numero);

        // System.out.println(- numero);

        // System.out.println(numero);

        // int numero = 5;

        // System.out.println(++numero);

        // System.out.println(numero);

        // boolean variavel = true;

        // System.out.println(!variavel);

        // System.out.println(variavel);

        // variavel = !variavel;

        // System.out.println(variavel);

        // int a = 2;
        // int b = 2;

        // int resultado = a>b ?0 : 1;

        // // if (a > b)
        // //     resultado = "Verdadeiro";
        // // else
        // //     resultado = "Falso";

        // System.out.println(resultado);

        // String nomeUm = "Fábio";
        // String nomeDois = new String("Fábio");

        // System.out.println(nomeUm == nomeDois);

        // System.out.println(nomeUm.equals(nomeDois));

        // int numero1 = 1;
        // int numero2 = 2;

        // boolean simNao = numero1 == numero2;

        // if(numero1 > numero2)
        //     System.out.println(numero1 + " é maior que " + numero2 + ".");

        // System.out.print(numero1 + " é igual a " + numero2 + "? ");
        // System.out.println(simNao);

        // simNao = numero1 != numero2;

        // System.out.print(numero1 + " é diferente de " + numero2 + "? ");
        // System.out.println(simNao);

        // simNao = numero1 > numero2;

        // System.out.print(numero1 + " é maior que " + numero2 + "? ");
        // System.out.println(simNao);

        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && (7 > 4))
            System.out.println("As duas condições são verdadeiras");
        else if(condicao1 || condicao2)
            System.out.println("Uma das condições é verdadeira");
        else
            System.out.println("Nenhuma das duas condições são verdadeiras");

        System.out.println("Parte 2");

        if(condicao1 && condicao2)
            System.out.println("As duas condições são verdadeiras");
        
        if(condicao1 || condicao2)
            System.out.println("Uma das duas condições é verdadeira");

        System.out.println("Fim");
    }
}
