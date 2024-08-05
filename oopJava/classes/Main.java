package classes;

public class Main {
    public static void main(String[] args) {
        Aluno jorge = new Aluno(1, "Jorge Silva", 10.0f);
        Aluno roberta = jorge;
        jorge.nome = "Roberta Silva";//Isso funciona porque a variavel roberta não está criando um novo aluno
        System.out.println(roberta.nome);//Ou seja ela está apontando para o mesmo espaço de memória que jorge
        //Portanto ao mudar jorge muda-se também roberta e vice-versa
    }
}

class Aluno{
    int numero;
    String nome;
    float nota;

    Aluno(){
        this(0, "Default", 0.0f);
    }
    
    Aluno(int numero, String nome, float nota){
        this.numero = numero;
        this.nome = nome;
        this.nota = nota;
    }
}