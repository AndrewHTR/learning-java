package src;

public class aritmetica {
    public static void main(String[] args) {
       /*
        * Operadores aritmeticos: 
        * + = Adição
        * - = Subtração
        * * = Multiplicação
        * / = Divisão
        * % = Modulo de divisão
        * ++ = Incrementação
        * -- = Decrementação
        */
        int x = 2;
        int y = 3;
        int z = x + y;
        System.out.println(z);


        /*
        * Valores de recebimento:
        * += valor = Recebe o próprio numero mais outro valor | x += 3 é o mesmo que x = + 3
        * -= valor = Recebe o próprio numero menos outro valor | x -= 3 é o mesmo que x = - 3
        * *= valor = Recebe o próprio numero vezes outro valor | x *= 3 é o mesmo que x = * 3
        * /= valor = Recebe o próprio numero dividido por outro valor | x /= 3 é o mesmo que x = / 3
        * %= valor = Recebe o próprio numero modulo de divisão do valor | x %= 3 é o mesmo que x = % 3
        */ 
        int numero = 10;
        System.out.println(numero+=2);


       /*
        * Operadores de comparação:
        * == Igual a
        * != Não igual a
        * > Maior que
        * < Menor que
        * >= Maior ou igual que
        * <= Menor ou igual que
        */
        int numero1 = 4;
        int numero2 = 3;
        if(numero1 >= numero2){
            System.out.println("Numero 1 eh maior que o numero 2");
        }
        /*
         * Operadores lógicos:
         * && logical and - Retorna true caso as afirmações sejam iguais    
         * || logical or - Retorna true caso alguma das afirmações sejam verdadeiras
         * ! logical not - Retorna falso caso a afirmação seja true
         */
        int w = 2;
        int v = 2;
        if(w == v && v == w){
            System.out.println("As duas variaveis sao iguais :)");
        }else{
            System.out.println("As duas variaveis nao sao iguais :(");
        }
    }
}
