package loop;

public class whilefor {
    public static void main(String[] args){
        /*
         ! Loop continuam rodando enquanto a condição for verdadeira
         */

         int x = (int) (Math.random() * 10);
        //* Enquanto x for maior que 2 ele vai printar a e decrementar 1 de x até que a condição retorne False 
         while(x > 2){
             System.out.println("a");
             x -= 1;
         }
         int y = (int) (Math.random() * 21);
         do{
             System.out.println(y);
             y += 1;
         } while (y <= 20);

         /*
          ! O loop for tem os seguintes argumentos:
          * for(declaração1; declaração2; declaração3){}
          * A primeira declaração é executada uma vez antes de executar o pedaço de codigo da condição
          * A segunda declaração define a condição para continuar rodando o codigo
          * A terceira declaração é executada toda hora enquanto a condição for True
          */ 
          //* A primeira declaração da uma variavel antes do loop começar (int i = 0;)
          //* segunda declaração da a condição do loop (i precisa ser menor ou igual a 5 para o codigo rodar) se a condição retorna true, o loop começa
          //* a terceira declaração roda aquele codigo toda vez q a condição retorna true, nesse exemplo (i++) ele vai incrementar i a ele mesmo enquanto o codigo rodar 
         for(int i = 0; i <= 5; i++){
             System.out.println(i);
         }
         String[] desenhos = {"Hora de aventura", "Steven universe", "Star vs as forcas do mal"};
         // for-each é usado para passar por elementos de um array. for(tipo variavel : variavel)
         for(String i : desenhos){
             System.out.println(i);
         }
    }
}
