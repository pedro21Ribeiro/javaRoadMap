package Inheritance;

public class Main {
    public static void main(String[] args) {
        Cao zeus = new Cao();

        zeus.comer();
        zeus.latir();

        Filhote bobby = new Filhote();
        bobby.comer();
        bobby.latir();
        bobby.serFofo();       

        Gato felpudinho = new Gato();
        felpudinho.comer();
        felpudinho.miar();
    }
    
}

class Animal{
    void comer(){
        System.out.println("Comendo");
    }
}

/*
 * A classe Cao é uma classe filha/Sub-classe de Animal, portanto tem as mesmas caracteristicas de Animal
 * E mais as suas próprias caracteristicas, porém Animal em si não possui as caracteristicas de Cao
 */


class Cao extends Animal{
    void latir(){
        System.out.println("Latindo");
    }
}

/*
 * Filhote é classe filha de cao que por sua vez é filha de animal, portanto ele tem caracterisiticas de
 * seu "Pai" e "Avô"
 */
class Filhote extends Cao{
    void serFofo(){
        System.out.println("Sendo fofo");
    }
}

/*
 * A classe Gato é filha de Animal, portanto "Irmã" de Cao, ela possui somente as propriedades de Animal
 * e suas próprias
 */
class Gato extends Animal{
    void miar(){
        System.out.println("Miando");
    }
}

/*          MODELO DAS CLASSES
 * 
 *          /----------\
 *          |  Animal  |
 *          \---------/
 *              |
 *              |
 *        /------------\
 *    /------\      /-------\
 *    | gato |      |  Cao  |
 *    \-----/       \------/
 *                      |
 *                      |
 *                 /---------\
 *                 | Filhote |
 *                 \--------/
 */         