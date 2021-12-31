package matematica;

public class Mathzin {
    public static void main(String[] args) {
      // ! A contagem dos numeros sempre começa pelo zero, então se eu pedir para Math.random() randomizar um numero de 0 até 10 eu preciso passar 11
      // Pega o maior valor
        System.out.println(Math.max(5, 10));

      // Pega o menor valor
        System.out.println(Math.min(5, 10));

      // Raiz quadrada
        System.out.println(Math.sqrt(64));

      // Retorna o valor positivo absoluto - Retira o negativo
        System.out.println(Math.abs(-5.2));

      // Randomiza os numeros em formato double, se necessario, devemos trocar o double por int para maior controle
        int randomNum = (int) (Math.random() * 101);
        System.out.println(randomNum);

      // o Valor booleano retorna true ou false para os argumentos passados
        int x = (int) (Math.random() * 11);
        int y = (int) (Math.random() * 11);
        boolean z = true;
        if(x > y == z){
            System.out.println("o valor x e maior que y");
        } else{
            System.out.println("o valor y e maior que x");
        }
    }
}
