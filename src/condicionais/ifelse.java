package condicionais;

public class ifelse {
    public static void main(String[] args) {
        /*
         ! If, Else else if e switch são declarações condicionais, ou seja, elas vão rodar o codigo caso as condições sejam cumpridas
         * Exemplo: x = 5 y = 5 if x == y{print("ola mundo")}
         */
        int x = 5;
        int y = 5;
        if(x == y){
            System.out.println("X e igual a Y");
        //! Caso a primeira condição retorne False o else será rodado. Ele é generalizado, então a melhor alternativa é utilizar um else if
        } else {
            System.out.println("X não é igual a Y");
        }
        //! Temos um atalho para utilizar condições facilmente no java
        int tempo = (int) (Math.random() * 25);
        String resultado = (tempo < 18) ? "Bom dia" : "Boa noite";
        System.out.println(resultado);

        //! Metodo switch, ele é um if else, porém mais arrumado
        int dia = (int) (Math.random() * 8);
        // Pega a varivel dia
        switch(dia){
            // Caso ela seja == a 1 vai rodar esse codigo e parar
            case 1:
                System.out.println("Domingo");
                // Se a condição retornar True, a execução do switch vai parar e o codigo continuara normalmente
                break;
            case 2:
                System.out.println("Segunda");
                break;
            // Caso nenhuma das opções acima retornem True, este codigo sempre vai rodar 
            default:
                System.out.println("Esta um belo dia la fora");
        }
    }
}
