package statics.singleton;

/*
 * Singletons são classes que só podem ser criados apenas uma unica vez, seja qual for o objetivo
 * Abaixo um meio de criar uma classe Singleton
 */

public class Main {
    public static void main(String[] args) {
        //Não funciona pois o construtor é privado, somente a própria classe 
        //Singleton obj1 = new Singleton();
        
        //Fica assim então
        Singleton obj1 = Singleton.getInstance();
        Singleton ob2 = Singleton.getInstance();

        ob2.num = 0;

        //Como falado anteriormente já que ambos apontam para a mesma instancia que é static
        //Pertecente a classe, alterar uma altera o outro também 
        System.out.println(obj1.num);
    }
}

class Singleton {
    private static Singleton instance;
    int num;

    private Singleton(){
        num = 10;
    }

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }

        return instance;
    }
}
