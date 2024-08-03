package dataStruct.Objetos;

public class Pessoa {
    private String nome;
    private int idade;
    private String profissao;
    private float salario;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        this.profissao = "Desempregado";
        this.salario = 0.0f;
    }
    
    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public String getProfissao() {
        return profissao;
    }

    public float getSalario() {
        return salario;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
