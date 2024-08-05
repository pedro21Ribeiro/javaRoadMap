package statics;


public class Main {
    public static void main(String[] args) {
        Humano pedro = new Humano("Pedro", "Homen", 20);
        System.out.println(Humano.populacao);
        Humano mariane = new Humano("Mariane", "Mulher", 20);
        System.out.println(Humano.populacao);
        pedro.obito();
        System.out.println(Humano.populacao);
    }
}

/*
 * Staticos definem algo que não pertence a um obejto de uma classe, mas sim
 * a classe em si.
 */

class Humano{
    String nome;
    String genero;
    int idade;
    boolean IsVivo;
    static int populacao;

    Humano (String nome, String genero, int idade){
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
        this.IsVivo = true;
        Humano.populacao ++;//A diferença é visivel em como população pertence a humano ao invés de "esse"
        //Objeto
    }

    void obito(){
        IsVivo = false;
        Humano.populacao--;//Novamente, mechendo em static, usa-se a classe
    }
}