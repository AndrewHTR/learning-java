import metodos.met;

// * Todo arquivo java começa iniciando uma classe com o nome do arquivo
public class Main {
    // * Após criar a classe do arquivo, nós abrimos o main que é onde o codigo sera rodado
    public static void main(String[] args) {
        // Aqui estou dizendo para o sistema printar para uma String no CMD
        System.out.println("Hello World");
        /*
        * Para criar uma variavel, primeiros nós definimos o tipo dessa variavel:
        * type variavel = valor;
        * sem esquecer o ponto e virgula
        *
        * Os tipos de variaveis que temos é:
        * String - Guarda uma String (é possivel concatenar as Strings e Chars) - 
        * int - Guarda um numero inteiro = -2,147,483,648 até 2,147,483,647 - 4 bytes
        * float - Guarda numeros, mas os numeros decimais = 6 pra 7 digitos decimais - 4 bytes
        * char - Guarda apenas uma letra, o valor é definido com aspas simples '' - 2 bytes
        * boolean - Guarda um valor verdadeiro ou falso (True . False) - 1 bit
        *
        * Tipos de data primitivos:*
        * byte - Guarda numeros de -128 até 127 - 1 byte
        * short - Guarda numeros de -32,768 até 32,767 - 2 bytes
        * long - -9,223,372,036,854,775,808 até 9,223,372,036,854,775,807 - 8 bytes
        * double - Guarda até 15 digitos decimais - 8 bytes
        */ 
        String hello = "Hello ";
        System.out.println(hello + "World");
        met.print("ae funfo");
        met.nome("Andrew");
    }
}
