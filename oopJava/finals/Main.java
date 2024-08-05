package finals;

/*
 * Classes com a declaração de final, não podem ser modificadas, porém as suas propriedades podem.
 * Não é possível redefinir um objeto inteiro, mas somente as propriedades
 */

public class Main {
    public static void main(String[] args) {
        final Numero a = new Numero(10);
        Numero b = new Numero(30);
        //Da erro pois a é final
        //a = b;

        //Para trocar o valor ent
        a.num = b.num;
        //É permitido pois num não é final e ao trocar num não está alterando a classe em si

        System.out.println(a.num);
    }
}

class Numero{
    int num;

    Numero (int num){
        this.num = num;
    }
}
