package metodos;

public class met {
    // Aqui eu criei um metodo para printar uma string mais facilmente
    /*
     * Metodos são usados para executar certas ações, são funções
     * Eles são utilizados para ser um codigo reutilizavel, assim impedindo a pessoa de reescrever certo codigo uma ou mais vezes
     * 
     * Para criar um metodo, nós primeiro chamamos o static que diz que  metodo pertence a class main e não a um objeto da classe main
     * após isso nós chamamos o void que diz pro computador que o metodo não retorna algum valor
     * e por ultimo damos o nome da classe colocando parenteses para dar os argumentos
     * 
     * Também podemos fazer o overload de metodo fazendo com que possamos criar um metodo com o mesmo nome para evitar muitos metodos diferentes
     * exemplo: podemos criar um metodo matematica que recebe int e dps criar outro metodo com o mesmo nome que receba float
     */
    public static void print(String args){
        System.out.println(args);
    }
    public static void nome(String nome){
        if(nome == "Andrew"){
            print("Andrew? Belo nome chara :)");
        } else {
            print(nome + "? Pessimo nome.");
        }
    }
    public static int matemat(int num1, int num2){
        return num1 + num2;
    }
    public static float matemat(float num1, float num2){
        return num1 + num2;
    }
    public static void main(String[] args) {
        print("ae funfo");
    }
}
