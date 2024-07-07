public class Comentarios {
    public static void main (String [] args) {
        // Olá, eu sou um comentário

        /* Olá, eu sou um comentário
         * mais detalhado e que envolve
         * mais linhas quando necessário.
         */
    }
    /**
     * Estas duas estrelinhas acima
     * é para identificar um comentário
     * a nível de documentação.
     */
    // Passe o mouse sobre o nome do método.
    public void metodo() {

    }

    /*
    * Este método foi elaborado as pressas
    * por isso eu abrevei o nome das variáveis
    * mas olha, ele tem a finalidade de somar ou  multiplicar
    * dois números
    */

    public int somaMultiplica (int n, int x, String m){
        int r = 0; // r é igual ao resultado
        if (m == "M"){ // M= multiplicação
            r= n * x;
        }else{
            // se não soma mesmo
            r = n + x;
        }
        return r;
    }
}
