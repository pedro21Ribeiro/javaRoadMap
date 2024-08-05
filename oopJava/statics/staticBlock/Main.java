package statics.staticBlock;

public class Main {
    public static void main(String[] args) {
        System.out.println(Numeros.a + " " + Numeros.b);
        Numeros c = new Numeros();//Como o bloco é static a criação de objetos não faz com que o bloco rode
        System.out.println(Numeros.a + " " + Numeros.b);
    } 
}

class Numeros {
    static int a = 2;
    static int b;

    /*
     * Esse bloco static é chamado quando a classe é compilada, como ele pertence a classe e não a um objeto
     * ele roda somente com a classe, caso seja criado um objeto ele não ira ser realizado novamente, pois
     * não pertence ao objeto
     */
    static {
        b = 2 * 5;
    }
}