package Inheritance;

import java.util.ArrayList;

public class Escola {
    public static void main(String[] args) {
        ArrayList<Professor> professores = new ArrayList<Professor>();
        ArrayList<Aluno> alunos = new ArrayList<Aluno>();

        alunos.add(new Aluno("Pedro", 10, 0, 4));
        alunos.add(new Aluno("Jorge", 11, 1, 4));

        professores.add(new Professor("Marcos", 24, "Geografia", 2000.0f));
        professores.add(new Professor("Julia", 30, "Biologia", 2500.0f));

        for (Aluno i : alunos){
            System.out.println(i);
        }

        for (Professor i : professores){
            System.out.println(i);
        }
    } 
}

class Pessoa{
    String nome;
    int idade;
    Pessoa (String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    @Override
    public String toString() {
        return nome + ";" + idade;
    }
}

class Aluno extends Pessoa{
    int numeroChamada;
    int semestre;

    Aluno (String nome, int idade, int numeroChamada, int semestre){
        super(nome, idade);
        this.numeroChamada = numeroChamada;
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return super.toString() + ";semestre:" + semestre;
    }
}

class Professor extends Pessoa{
    String materia;
    Float salario;

    Professor (String nome, int idade, String materia, Float salario){
        super(nome, idade);
        this.materia = materia;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString() + ";materia:" + materia;
    }
}