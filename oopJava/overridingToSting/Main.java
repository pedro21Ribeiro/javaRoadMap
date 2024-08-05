package overridingToSting;

public class Main {
    int num;
    public static void main(String[] args) {
        Aluno pedro = new Aluno("Pedro", 1, 9.4f);
        System.out.println(pedro);
        Main a = new Main();
        a.num = 10;
        System.out.println(a);
    }
}

class Aluno{
    String nome;
    int numero;
    float nota;

    Aluno (String nome, int numero, float nota){
        this.nome = nome;
        this.numero = numero;
        this.nota = nota;
    }

    /*
     * Usando override estamos sobrescrevendo o metodo original chamado to string
     * Nesse caso ao invés de retornar a referencia do objeto estou retornando todas as propriedades dele
     */
    @Override
    public String toString() {
        return nome + " " + numero + " " + nota;
    }
}
